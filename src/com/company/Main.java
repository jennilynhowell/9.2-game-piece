package com.company;

public class Main {

    public static void main(String[] args) {

        GamePiece myPiece = new GamePiece();

        myPiece.setColor("purple");
        myPiece.setName("Purple Puma");

        myPiece.move(2, 18);
        myPiece.freeze();
        myPiece.move(3, 18); //does not change location
        myPiece.unfreeze();
        myPiece.move(3, 18);
        myPiece.move(40, 63); //does not move as it's out of bounds

        myPiece.printInfo();

    }


}
