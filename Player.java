package hostel;

public class Player {
    private String name;
    private int location=0;
    Player(String name){

        this.name=name;

    }

    public String getName() {
        return name;
    }

    public int getLocation(){
        return location;
    }
    public void setLocation(int n){
        this.location=n;
    }

}
