public class Expedition {
    private char[][] map = new char[0][0];

    private int row = -1;
    private int column = -1;

    private int energy = 0;
    private int maxEnergy = 0;

    private int collectedRelics = 0;
    private int requiredRelics = 0;
    private int moves = 0;

    private String status = "NOT_STARTED";

    public Expedition() {
        
    }
}