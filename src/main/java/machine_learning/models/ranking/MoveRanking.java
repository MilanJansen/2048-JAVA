package machine_learning.models.ranking;

import machine_learning.models.game.Merge;

public class MoveRanking {
    private double relativeBlockSize;
    private PositionRanking startPositionRanking;
    private PositionRanking endPositionRanking;
    private Merge merge;
    //TODO StartPosition, endPosition and merge will receive point sorted by the relativeBlockSize.

    public MoveRanking(double relativeBlockSize, PositionRanking startPositionRanking, PositionRanking endPositionRanking, Merge merge) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPositionRanking = startPositionRanking;
        this.endPositionRanking = endPositionRanking;
        this.merge = merge;
    }
}
