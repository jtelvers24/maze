package edu.wctc;

public class FinalRoom extends Room implements Exit {

    public FinalRoom(String name) {
        super(name);
    }

    @Override
    public String exit(Player player) {
        return "Excited room";
    }

    @Override
    public String getDescription() {
        return "You are in Room: " + getName();
    }
}
