package machine_learning.controllers;

import game.Game;
import machine_learning.models.game.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RankingController {
    public SimBoard simBoard = new SimBoard(4);
    public int[] moveArray = new int[]{ 1,2,3,4 };
    public Combination combination = new Combination();

    public RankingController() {

    }

    public int choosePath(ArrayList<Path> paths) {
        try {
            simBoard = (SimBoard)Game.BOARD.clone();
        }catch (CloneNotSupportedException e){}

        int r = 3;
        int n = moveArray.length;
        combination.printCombination(moveArray, n, r);

        int i;
        switch (i) {
            case 1:
                simBoard.moveDown();
                break;
            case 2:
                simBoard.moveLeft();
                break;
            case 3:
                simBoard.moveRight();
                break;
            case 4:
                simBoard.moveUp();
                break;
            default:
                break;





        //TODO Retrieve current state of board -> Calculate paths -> 1 Move from best path -> Retrieve current state of board -> Recalculate paths (Because an additional block has appeared)
        //TODO while calculating paths, do not take moves into account where the board does not change. Write function in SimBoard that can check this.
        int pathIndex = 0;
        //TODO randomize chosen path. Paths with a higher value have relatively higher chance of being chosen.
        //TODO what is a good path. The end state of the board after last move? Highest value of any intermediate move? average?
        //TODO you need to see it as two separate AI's one learning and one playing. The play AI is limited by some restrictions, to prevent to force the machine to calculate to much to find a path and for humans to be able from the AI as well.
        //TODO the learning AI cannot receive any hints on what kind of things are good/bad aside from the final score.
        //TODO the playing AI will be restricted to calculate paths two times (each time generating other random tiles). It will take the average of the two tiles, unless the scores are to far apart. Then a third run will be calculates and this will be taken into the average as well.

        //TODO idea: intermediate assign of points. If the AI determines that a certain board state is of relative low/high value (points based on the average board value %), it can assign/substract points to the previous x amount of moves. x equals length of path.
//        int pathValue = 0;
//        int moveValue = 0;
//        ArrayList<BlockMove> blockMoves;
//        for(Move move: path) {
//            blockMoves = move.getBlockMoves();
//            for(BlockMove blockMove: blockMoves) {
//                moveValue += getBlockMoveValue();
//            }
//            pathValue += moveValue;
//
//        }
        return pathIndex;
    }

    public int getBestPath(int[] pathValueList){
        int bestPathIndex = Arrays.stream(pathValueList).max().getAsInt();
        return bestPathIndex;
    }




}
