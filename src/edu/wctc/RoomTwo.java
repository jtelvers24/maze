package edu.wctc;

public class RoomTwo extends Room implements Interactable{
    public RoomTwo(String name) {
        super(name);
    }

    @Override
    public String interact(Player player) {
        player.addToScore(1);
        return "Welcome to Room Two";
    }

    @Override
    public String getDescription() {
        return "This is Room: " + getName();
    }
}
