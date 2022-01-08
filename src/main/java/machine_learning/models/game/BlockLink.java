package machine_learning.models.game;

import java.lang.reflect.Field;

public class BlockLink {
    private double relativeBlockSize;
    private Position startPosition;
    private Position endPosition;
    private BlockMerge blockMerge;
    private int score;

    public BlockLink(double relativeBlockSize, Position startPosition, Position endPosition, BlockMerge blockMerge) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.blockMerge = blockMerge;
    }

    public BlockLink(double relativeBlockSize, Position startPosition, Position endPosition) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }

    public void calculateScore() {
        int blockMoveValue = 0;
        String fieldName;
        startPosition.getBorders();
        startPosition.getEmptySpaces();
        startPosition.getStages();

        //score += getPositionValue(relativeBlockSize, "borders", startPosition.getBorders());
        //Get data from SQL database

            //TODO Ask MachineLearningController for position values.
            //int emptySpaces;
            //int borders;
            //ArrayList<int[]> stages;

        Field[] endPositionFields = endPosition.getClass().getDeclaredFields();
//        for(Field field: endPositionFields) {
//            //TODO Ask MachineLearningController for position values.
//        }
//        if(blockMerge != null) {
//            int emptySpaces = blockMerge.getEmptySpaces();
//            //TODO Ask MachineLearningController for blockMerge values.
//        }

    }

}
