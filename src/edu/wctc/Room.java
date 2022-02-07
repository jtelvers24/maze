package edu.wctc;

public abstract class Room {

    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room getAdjoiningRoom(char direction) {
        if (direction == 'N') {
            return north;
        } else if (direction == 'S') {
            return south;
        }else if (direction == 'E'){
            return east;
        }else if (direction == 'W'){
            return west;
        }else if (direction == 'U'){
            return up;
        }else if (direction == 'D'){
            return down;
        }else   return null;
    }

    public abstract String getDescription();

    public String getExits(){
        String result = "";

        if (north != null) {
            result += "North";
        }

        if (south != null) {
            result += " South";
        }
        if(east != null){
            result += " East";
        }
        if(west != null){
            result += " West";
        }
        if(up != null){
            result += " Up";
        }
        if(down != null){
            result += " Down";
        }

        return result;
    }

    public boolean validDirection(char direction){
        if (direction == 'n') {
            return north != null;
        } else if (direction == 's') {
            return south != null;
        }else if (direction == 'e'){
            return east != null;
        }else if (direction == 'w'){
            return west != null;
        }else if (direction == 'u'){
            return up != null;
        }else if (direction == 'd'){
            return down != null;
        }else   return false;
    }

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

    public Room getUp() {
        return up;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public Room getDown() {
        return down;
    }

    public void setDown(Room down) {
        this.down = down;
    }


}
