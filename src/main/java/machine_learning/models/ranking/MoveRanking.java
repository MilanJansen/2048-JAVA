package machine_learning.models.ranking;

import machine_learning.models.game.BlockLink;

public class MoveRanking {
    private double relativeBlockSize;
    private PositionRanking startPositionRanking;
    private PositionRanking endPositionRanking;
    private MergeRanking mergeRanking;
    private BlockLink blockLink;
    //TODO StartPosition, endPosition and mergeRanking will receive point sorted by the relativeBlockSize.

    public MoveRanking(double relativeBlockSize, PositionRanking startPositionRanking, PositionRanking endPositionRanking, BlockLink blockLink) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPositionRanking = startPositionRanking;
        this.endPositionRanking = endPositionRanking;
        this.blockLink = blockLink;
    }
}
