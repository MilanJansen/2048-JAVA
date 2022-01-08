package machine_learning.models.ranking;

import java.util.ArrayList;

public class PositionRanking {
    private ArrayList<Integer> emptySpaces;
    private ArrayList<Integer> borders;
    private ArrayList<int[]> stages;

    public PositionRanking() {}

    public void addEmptySpaces(int numberOfEmptySpaces, int points) {
        int currentPoints = this.emptySpaces.get(numberOfEmptySpaces);
        this.emptySpaces.add(numberOfEmptySpaces, currentPoints + points);
    }

    public void addBorderPoints(int numberOfBorders, int points) {
        int currentPoints = this.borders.get(numberOfBorders);
        this.borders.set(numberOfBorders, currentPoints + points);
    }

    public void addStagePoints(int numberOfStages, int stageHeight, int points) {

        //TODO stageHeight is not being taken into account yet.
        int currentPoints = this.stages.get(numberOfStages)[1];

        //this.stages.add(numberOfStages, points);
        for (int i = 0; i <= this.stages.size(); i++) {
            if (this.stages.get(i)[0] == stageHeight) {
                this.stages.get(i)[1] += points;
                break;
            } else if (i >= this.stages.size()) {
                //this.stages.add(stage);
            }
        }
    }

    public void addStages(ArrayList<int[]> stages) {
        for(int[] stage: stages){
            for(int i=0;i<=this.stages.size();i++){
                if(this.stages.get(i)[0] == stage[0]){
                    this.stages.get(i)[1] += stage[1];
                    break;
                }
                else if(i >= this.stages.size()){
                    this.stages.add(stage);
                }
            }
        }
    }

    public ArrayList<Integer> getEmptySpaces() {
        return emptySpaces;
    }

    public ArrayList<Integer> getBorders() {
        return borders;
    }

    public ArrayList<int[]> getStages() {
        return stages;
    }
}
