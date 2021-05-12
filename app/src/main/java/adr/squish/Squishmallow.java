package adr.squish;

public class Squishmallow {
    private int id, tie_dye, image;
    private String name, type, color, squad, sizes_id, bio;
    private int[] sizes;


    public Squishmallow(){

    }

    public Squishmallow(int i, int td, String n, String t, String c, String s, String s_i, int img, String b){
        id = i;
        tie_dye = td;
        name = n;
        type = t;
        color = c;
        squad = s;
        sizes_id = s_i;
        image = img;
        bio = b;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setTie_dye(int td){
        tie_dye = td;
    }

    public int getTie_dye(){
        return tie_dye;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setSquad(String squad){
        this.squad = squad;
    }

    public String getSquad(){
        return squad;
    }

    public void setSizes_id(String sizes_id){
        this.sizes_id = sizes_id;
    }

    public String getSizes_id(){
        return sizes_id;
    }

    public void setImage(int image){
        this.image = image;
    }

    public int getImage(){
        return image;
    }

    public void setBio(String bio){
        this.bio = bio;
    }

    public String getBio(){
        return bio;
    }

    public void setSizes(int[] sizes){
        this.sizes = sizes;
    }

    public int[] getSizes(){
        return sizes;
    }

    public void print(){
        System.out.println("*********PROFILE**********");
        System.out.println("ID: "+id);
        System.out.println("NAME: "+name);
        System.out.println("TYPE: "+type);
        System.out.println("COLOR: "+color);
        System.out.println("TIEDYE: "+tie_dye);
        System.out.println("SQUAD: "+squad);

        System.out.println("SIZES: "+sizes_id);
        for(int i=0;i<sizes.length;i++){
            System.out.print(sizes[i]+" ");
        }
        System.out.println();

        System.out.println("IMAGE: "+image);
        System.out.println("BIO: "+bio);
        System.out.println("**************************");
    }
}
