import java.util.Random;

public class Expedition {
    private Random rd = new Random(System.currentTimeMillis());
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

    public boolean startNewGame(int rows, int cols){
        if (rows < 5 || rows > 12 || cols < 5 || cols > 12){
            return false;
        }

        map = new char[rows][cols];
        for (int i = 0 ; i < rows ; i++){
            for (int j = 0 ; j < cols ; j++){
                map[i][j] = '.';
            }
        }
        row = 0;
        column = 0;
        map[0][0] = 'S';
        collectedRelics = 0;
        requiredRelics = 3;
        moves = 0;
        maxEnergy = 4 * rows * cols;
        energy = maxEnergy;
        status = "ACTIVE";
        
        return true;
    }

    public void placeRandomTile(Random rd, char symbol, int count){
        int rows = map.length;
        int cols = map[0].length;
        int placed = 0;

        while (placed < count){
            int placeRow = rd.nextInt(rows);
            int placeCol = rd.nextInt(cols);
            if ((placeRow != 0 || placeCol != 0) && map[placeRow][placeCol] == '.'){
                map[placeRow][placeCol] = symbol;
                placed++;
            }
        }
    }


    public String getStatus(){
        return status;
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }
    public int getEnergy(){
        return energy;
    }
    public int getMoves(){
        return moves;
    }
    public int getMaxEnergy(){
        return maxEnergy;
    }
    public int getCollectedRelics(){
        return collectedRelics;
    }
    public int getRequiredRelics(){
        return requiredRelics;
    }
    public int getScore(){
        if (status.equals("NOT_STARTED")){
            return 0;
        }
        return (100*collectedRelics) + (5*energy);
    }

}