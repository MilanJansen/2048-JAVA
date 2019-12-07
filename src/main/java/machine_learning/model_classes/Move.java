package machine_learning.model_classes;

public class Move {
    private double relativeBlockSize;
    public Position startPosition;
    public Position endPosition;
    private Merge merge;
    //TODO StartPosition, endPosition and merge will receive point sorted by the relativeBlockSize.

    public Move(double relativeBlockSize, Position startPosition, Position endPosition, Merge merge) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.merge = merge;
    }
}
