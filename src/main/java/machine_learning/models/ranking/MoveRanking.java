package machine_learning.models.ranking;

import machine_learning.models.game.BlockMerge;

public class MoveRanking {
    private double relativeBlockSize;
    private PositionRanking startPositionRanking;
    private PositionRanking endPositionRanking;
    private BlockMerge blockMerge;
    //TODO StartPosition, endPosition and blockMerge will receive point sorted by the relativeBlockSize.

    public MoveRanking(double relativeBlockSize, PositionRanking startPositionRanking, PositionRanking endPositionRanking, BlockMerge blockMerge) {
        this.relativeBlockSize = relativeBlockSize;
        this.startPositionRanking = startPositionRanking;
        this.endPositionRanking = endPositionRanking;
        this.blockMerge = blockMerge;
    }
}
