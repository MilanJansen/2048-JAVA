package machine_learning.models.game;

public class BlockMerge {
    private int emptySpaces;
    //Two StartPositions
    //One stopPosition

    public BlockMerge(int emptySpaces) {
        this.emptySpaces = emptySpaces;
    }

    public int getEmptySpaces() {
        return emptySpaces;
    }

    //Get data from SQL database

//    The end point location will be measured using the new block size. The points will only count one time. Not for both blocks involved in the merge.
//    Count the % of filled spaces on the board during a merge. This may affect the value of a merge. How to award points based on this?
//    Because the  system is checking a few steps ahead, the empty space created by the merge will be taken into account. So above two mechanisms should cover the total value of a merge.

}
