package machine_learning.model_classes;

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
}
