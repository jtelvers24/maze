package edu.wctc;

import java.util.List;

public class Maze {
    private Room currentRoom;
    private Player player;

    public Maze(Player player) {
        this.player = player;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String getCurrentRoomExits() {
        return currentRoom.getExits();
    }

    public String getCurrentRoomDescription(){
        return currentRoom.getDescription();
    }
    public int getPlayerScore(){
        return player.getScore();
    }
    public List<String> getPlayerInventory(){
        return player.getInventory();
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    private boolean isFinished;

    public String exitCurrentRoom(){
        if (currentRoom instanceof Exit){
            return ((Exit) currentRoom).exit(player);
        }else return "Current room is not exitable";
    }

    public String interactWithCurrentRoom(){
        if (currentRoom instanceof Interactable){
            return ((Interactable) currentRoom).interact(player);
        }else return "Current room is not interactable";
    }

    public String lootCurrentRoom(){
        if (currentRoom instanceof Lootable){
            return ((Lootable) currentRoom).loot(player);
        }else return "Current room is not lootable";
    }

    public boolean move(char direction){
        if (direction == 'n') {
            if (currentRoom.getNorth() != null) {
                currentRoom = currentRoom.getNorth();
                return true;
            } else {
                return false;
            }
        } else if (direction == 's') {
            if (currentRoom.getSouth() != null) {
                currentRoom = currentRoom.getSouth();
                return true;
            } else {
                return false;
            }
        }else if (direction == 'e'){
            if (currentRoom.getEast() != null) {
                currentRoom = currentRoom.getEast();
                return true;
            } else {
                return false;
            }
        }else if (direction == 'w'){
            if (currentRoom.getWest() != null) {
                currentRoom = currentRoom.getWest();
                return true;
            } else {
                return false;
            }
        }else if (direction == 'u'){
            if (currentRoom.getUp() != null) {
                currentRoom = currentRoom.getUp();
                return true;
            } else {
                return false;
            }
        }else if (direction == 'd'){
            if (currentRoom.getDown() != null) {
                currentRoom = currentRoom.getDown();
                return true;
            } else {
                return false;
            }
        }else   return false;
    }


}
