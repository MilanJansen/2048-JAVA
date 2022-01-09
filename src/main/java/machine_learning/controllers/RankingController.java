package machine_learning.controllers;

import game.Game;

import java.util.*;
import java.util.concurrent.TimeUnit;


public class RankingController {
    public SimBoard simBoard;
    public int[] moveArray;
    public ArrayList<ArrayList<Integer>> pathsArray;
    public int r;

    public RankingController() {
        pathsArray = new ArrayList<>();
        simBoard = new SimBoard(4);
        moveArray = new int[]{ 1,2,3,4 };
        r = 3;

        Deque<Integer> out = new ArrayDeque<>();
        findCombinations(moveArray, out, r, 0, moveArray.length);

//        while(Game.BOARD.getWonOrLost().equals("")) {
//            try {
//                TimeUnit.SECONDS.sleep(3);
//            }catch(InterruptedException e){}
//
//            int step = choosePath(pathsArray);
//            takeStep(step);
//        }

    }

    public void takeStep(int step) {
        switch (step) {
            case 1:
                Game.BOARD.moveDown();
                break;
            case 2:
                Game.BOARD.moveLeft();
                break;
            case 3:
                Game.BOARD.moveRight();
                break;
            case 4:
                Game.BOARD.moveUp();
                break;
            default:
                break;
        }
    }

    public void takeStepSim(int step) {
        switch (step) {
            case 1:
                simBoard.moveDown();
                break;
            case 2:
                simBoard.moveLeft();
                break;
            case 3:
                simBoard.moveRight();
                break;
            case 4:
                simBoard.moveUp();
                break;
            default:
                break;
        }
    }


    public int choosePath(ArrayList<ArrayList<Integer>> pathsArray) {
        for (int i = 0 ; i < pathsArray.size() ; i++) {
            try {
                simBoard = (SimBoard) Game.BOARD.clone();
            } catch (CloneNotSupportedException e) {
            }
            for (int j = 0 ; j < pathsArray.get(i).size() ; j++) {
                takeStepSim(pathsArray.get(i).get(j));
                //TODO When reaching a move that is not possible. Skip all paths that are identical to this path to this point (iteration number).
            }
        }




        //TODO Retrieve current state of board -> Calculate paths -> 1 Move from best path -> Retrieve current state of board -> Recalculate paths (Because an additional block has appeared)
        //TODO while calculating paths, do not take moves into account where the board does not change. Write function in SimBoard that can check this.
        int step = 0;
        //TODO randomize chosen path. Paths with a higher value have relatively higher chance of being chosen.
        //TODO what is a good path. The end state of the board after last move? Highest value of any intermediate move? average?
        //TODO you need to see it as two separate AI's one learning and one playing. The play AI is limited by some restrictions, to prevent to force the machine to calculate to much to find a path and for humans to be able from the AI as well.
        //TODO the learning AI cannot receive any hints on what kind of things are good/bad aside from the final score.
        //TODO the playing AI will be restricted to calculate paths two times (each time generating other random tiles). It will take the average of the two tiles, unless the scores are to far apart. Then a third run will be calculates and this will be taken into the average as well.

        //TODO idea: intermediate assign of points. If the AI determines that a certain board state is of relative low/high value (points based on the average board value %), it can assign/substract points to the previous x amount of moves. x equals length of path.
        //TODO Compare boardStates as a graph. Every Block has a link to all neighbouring blocks. All links are counted ones. So we are counting and ranking BlockLinks, not BlockMoves.

//        int pathValue = 0;
//        int moveValue = 0;
//        ArrayList<BlockMove> blockMoves;
//        for(Move move: path) {
//            blockMoves = move.getBlockMoves();
//            for(BlockMove blockMove: blockMoves) {
//                moveValue += getBlockMoveValue();
//            }
//            pathValue += moveValue;
//
//        }
        return step;
    }

    public int getBestPath(int[] pathValueList){
        int bestPathIndex = Arrays.stream(pathValueList).max().getAsInt();
        return bestPathIndex;
    }

    public void findCombinations(int[] A, Deque<Integer> out,
                                 int k, int i, int n)
    {
        // base case: if the combination size is `k`, print it
        if (out.size() == k)
        {
            System.out.println(out);
            ArrayList<Integer> pathArray = new ArrayList<>();
            for (Iterator<Integer> z = out.iterator(); z.hasNext();) {
                pathArray.add(z.next());
            }
            pathsArray.add(pathArray);
            return;
        }

        // start from the previous element in the current combination
        // till the last element
        //j = 0 to allow all possible order combinations. Make this j = i to remove duplicates in different order.
        for (int j = 0; j < n; j++)
        {
            // add current element `A[j]` to the solution and recur with the
            // same index `j` (as repeated elements are allowed in combinations)
            out.addLast(A[j]);
            findCombinations(A, out, k, j, n);

            // backtrack: remove the current element from the solution
            out.pollLast();
        }
    }




}
