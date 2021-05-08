package adr.squish;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

public class DatabseOpenHelper extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "sqDB.db";
    private static final int DATABASE_VERSION = 1;

    public DatabseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
