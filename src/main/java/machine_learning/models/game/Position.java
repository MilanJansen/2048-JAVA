package machine_learning.models.game;

import java.util.ArrayList;

public class Position {
    private int emptySpaces;
    private int equalNumbers;
    private int borders;
    private ArrayList<int[]> stages;

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
