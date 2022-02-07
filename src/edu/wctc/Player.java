package edu.wctc;

import java.util.Collections;
import java.util.List;

public class Player {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public List<String> getInventory() {
        if(inventory.isEmpty()){
            return Collections.singletonList("Inventory Empty");
        } else return inventory;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    private List<String> inventory;

    public String addToInventory(String addedinventory){
        inventory.add(addedinventory);
        return "added to inventory";
    }
    public String addToScore(int AddedScore){
        score += AddedScore;
        return "Added to score";
    }







}
