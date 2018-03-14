package player;

public class Player {
    //attributes
    String userName = "Gracz";
    String villageName = "Wioska gracza "+userName;


    //methods
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getVillageName() {
        return villageName;
    }

    public void setVillageName(String villageName) {
        this.villageName = villageName;
    }
}
