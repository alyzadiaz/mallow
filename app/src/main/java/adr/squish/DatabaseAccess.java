package adr.squish;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private final SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    private DatabaseAccess(Context context){
        this.openHelper = new DatabseOpenHelper(context);
    }

    public static DatabaseAccess getInstance(Context context){
        if(instance==null){
            instance = new DatabaseAccess(context);
        }

        return instance;
    }

    public void open(){
        this.database = openHelper.getReadableDatabase();
    }

    public void close(){
        if(database!=null){
            this.database.close();
        }
    }

    public List<Squishmallow> getSquish(){
        List<Squishmallow> list = new ArrayList<>();
        Cursor cursor = database.rawQuery("SELECT * FROM squishmallow", null);
        cursor.moveToFirst();

        while(!cursor.isAfterLast()){
            Squishmallow sq = new Squishmallow();

            sq.setId(cursor.getInt(0));
            sq.setName(cursor.getString(1));
            sq.setType(cursor.getString(2));
            sq.setColor(cursor.getString(3));
            sq.setTie_dye(cursor.getInt(4));
            sq.setSquad(cursor.getString(5));
            sq.setSizes_id(cursor.getString(6));
            sq.setImage(cursor.getString(7));
            sq.setBio(cursor.getString(8));

            list.add(sq);

            cursor.moveToNext();
        }
        cursor.close();

        for(int i=0;i<list.size();i++){
            Cursor sizesCursor = database.rawQuery("SELECT * FROM sizes WHERE id = ?",
                    new String[] {list.get(i).getSizes_id()});

            int[] sizes = new int[10];

            sizesCursor.moveToFirst();
            while(!sizesCursor.isAfterLast()){
                for(int k=0;k<sizes.length;k++){
                    sizes[k] = sizesCursor.getInt(k+1);
                }
                sizesCursor.moveToNext();
            }
            sizesCursor.close();

            list.get(i).setSizes(sizes);
        }

        return list;
    }
}
