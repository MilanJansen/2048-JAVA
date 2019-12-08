package machine_learning.controllers;

import machine_learning.models.game.*;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

public class RankingController {

    public RankingController() {

    }

    public int calculateBestPath(ArrayList<Move> path) {
        int pathIndex = 0;
        int pathValue = 0;
        int moveValue = 0;
        ArrayList<BlockMove> blockMoves;
        for(Move move: path) {
            blockMoves = move.getBlockMoves();
            for(BlockMove blockMove: blockMoves) {
                moveValue += getBlockMoveValue();
            }
            pathValue += moveValue;

        }
        return pathIndex;
    }

    public int getBestPath(int pathValueList[]){
        int bestPathIndex = Arrays.stream(pathValueList).max().getAsInt();
        return bestPathIndex;
    }




}
