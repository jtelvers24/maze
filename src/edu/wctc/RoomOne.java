package edu.wctc;

public class RoomOne extends Room implements Lootable {
    public RoomOne(String name) {
        super(name);
    }

    @Override
    public String loot(Player player) {
        player.addToScore(2);
        player.addToInventory("2 coins");
        return "Looted";

    }

    @Override
    public String getDescription() {
        return "You are in Room: " + getName();
    }
}
