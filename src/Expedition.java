import java.util.Random;

public class Expedition {
    Random rd = new Random();
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

    public boolean startNewGame(int rows, int colums){
        if (rows < 5 || rows > 12 || cols < 5 || cols > 12){
            return false;
        }

        map = new char[rows][cols];
        for (int i = 0 ; i < row ; i++){
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
        // Placing random tiles will be implemented.
        return true;
    }
}
    
    public String getStatus(){
        return Status;
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
    public int getCollectedRelic(){
        return collectedRelics;
    }
    public int getRequiredRelics(){
        return requiredRelics;
    }
    public int getScore(){
        if (status.equals("NOT_STARTED"){
            return 0;
        }
        return (100*collectedRelics) + (5*energy);
    }