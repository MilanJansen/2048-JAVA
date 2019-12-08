package machine_learning.models.game;

import java.util.ArrayList;

public class Move {
    private ArrayList<BlockMove> blockMoves;
    private String direction;
    private int score;

    public Move(ArrayList<BlockMove> blockMoves, String direction) {
        this.blockMoves = blockMoves;
        this.direction = direction;
    }

    public ArrayList<BlockMove> getBlockMoves() {
        return blockMoves;
    }

    public String getDirection() {
        return direction;
    }
}
