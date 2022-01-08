package machine_learning.models.game;

import java.util.ArrayList;

public class Move {
    private ArrayList<BlockLink> blockMoves;
    private String direction;
    private int score;

    public Move(ArrayList<BlockLink> blockMoves, String direction) {
        this.blockMoves = blockMoves;
        this.direction = direction;
    }

    public ArrayList<BlockLink> getBlockMoves() {
        return blockMoves;
    }

    public String getDirection() {
        return direction;
    }
}
