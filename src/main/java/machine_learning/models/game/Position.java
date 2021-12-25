package machine_learning.models.game;

import java.util.ArrayList;

public class Position {
    private int emptySpaces;
    private int borders;
    private ArrayList<int[]> stages; // x neighbouring higher/lower/equal numbers with x stages difference (negative values for lower)
    // stage: -1, amount: x
    // stage: 0, amount: x
    // stage: 1, amount: x
    // stage: 2, amount: x

    public Position(int emptySpaces, int equalNumbers, int borders, ArrayList<int[]> stages) {
        this.emptySpaces = emptySpaces;
        this.equalNumbers = equalNumbers;
        this.borders = borders;
        this.stages = stages;
    }

    public int getEmptySpaces() {
        return emptySpaces;
    }

    public int getEqualNumbers() {
        return equalNumbers;
    }

    public int getBorders() {
        return borders;
    }

    public ArrayList<int[]> getStages() {
        return stages;
    }

}

