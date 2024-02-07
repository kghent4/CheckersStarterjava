public class CheckersMechanics {

    //Instance Variables
    private CheckersGraphics g = new CheckersGraphics();
    
    private int[][] board = {
        {2, 0, 2, 0, 2, 0, 2, 0},
        {0, 2, 0, 2, 0, 2, 0, 2},
        {2, 0, 2, 0, 2, 0, 2, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1, 0, 1, 0},
        {0, 1, 0, 1, 0, 1, 0, 1}
    };

    //Constructor(s)
    public CheckersMechanics(){  

        //Reuse this line of code to update the game board!
        g.updateBoard(board);
    }
   
    
            
     
}
