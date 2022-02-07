package edu.wctc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RoomOne startingRoom = new RoomOne("Starting Room");
        RoomOne secondRoom = new RoomOne("Second Room");
        RoomTwo thirdRoom = new RoomTwo("Third Room");
        RoomTwo fourthRoom = new RoomTwo("Fourth Room");
        FinalRoom finalRoom = new FinalRoom("Final Room");

        startingRoom.setNorth(secondRoom);
        secondRoom.setWest(thirdRoom);
        thirdRoom.setUp(fourthRoom);
        fourthRoom.setEast(finalRoom);
        finalRoom.setWest(fourthRoom);
        fourthRoom.setDown(thirdRoom);
        thirdRoom.setEast(secondRoom);
        secondRoom.setSouth(startingRoom);

        Player player = new Player();
        player.setInventory(new ArrayList<>());
        Maze maze = new Maze(player);
        maze.setCurrentRoom(startingRoom);

        Scanner keyboardInput = new Scanner(System.in);

        while (true) {
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println(maze.getCurrentRoomExits());
            System.out.println("Input a command");
            char input = keyboardInput.next().charAt(0);
            if (input == 'i') {
                System.out.println(maze.interactWithCurrentRoom());
            } else if (input == 'l') {

                System.out.println(maze.lootCurrentRoom());
            } else if (input == 'x') {
                String exitText = maze.exitCurrentRoom();
                if (exitText.equals("Excited room")) {
                    break;
                } else {
                    System.out.println(exitText);
                }
            } else if (input == 'v') {
                System.out.println(maze.getPlayerInventory());
            } else {
                maze.move(input);
            }

        }
            System.out.println("ending score is: " + maze.getPlayerScore());

        }

    }

