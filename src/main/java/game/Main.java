package game;

import machine_learning.controllers.RankingController;

public class Main {
	public static Game GAME;
	public static RankingController RANKC;
	
	public static void main(String[] args) {
		GAME = new Game();
		RANKC = new RankingController();
	}

}