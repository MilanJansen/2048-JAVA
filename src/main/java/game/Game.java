package game;

public class Game {

	public static ColorScheme COLORS = new ColorScheme();
	public static Window WINDOW = new Window("2048");
	public static Controls CONTROLS = new Controls();
	public static Board BOARD = new Board(4);

	public static void restart() {
		COLORS = new ColorScheme();
		WINDOW = new Window("2048");
		CONTROLS = new Controls();
		BOARD = new Board(4);
	}

}