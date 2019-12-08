package machine_learning.models.game;

import java.lang.reflect.Field;

public class BlockMove {
    private double relativeBlockSize;
    private Position startPosition;
    private Position endPosition;
    private Merge merge;
    private int score;

    public BlockMove(double relativeBlockSize, Position startPosition, Position endPosition, Merge merge) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.merge = merge;
    }

    public BlockMove(double relativeBlockSize, Position startPosition, Position endPosition) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public void calculateScore() {
        int blockMoveValue = 0;
        String fieldName;
        startPosition.getBorders();
        startPosition.getEmptySpaces();
        startPosition.getEqualNumbers();
        startPosition.getStages();

        score += getPositionValue(relativeBlockSize, "borders", startPosition.getBorders());

            //TODO Ask MachineLearningController for position values.
            //int emptySpaces;
            //int equalNumbers;
            //int borders;
            //ArrayList<int[]> stages;
        }
        Field[] endPositionFields = endPosition.getClass().getDeclaredFields();
        for(Field field: endPositionFields) {
            //TODO Ask MachineLearningController for position values.
        }
        if(merge != null) {
            int emptySpaces = merge.getEmptySpaces();
            //TODO Ask MachineLearningController for merge values.
        }

    }

}
