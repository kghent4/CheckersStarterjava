import javax.swing.*;
import java.awt.*;

public class CheckersGraphics extends JFrame {

    private static final int TILE_SIZE = 50; // Size of each tile
    private static final int ROWS = 8; // Number of rows
    private static final int COLS = 8; // Number of columns

    private Color lightColor = Color.WHITE; // Color of light tiles
    private Color darkColor = Color.BLACK; // Color of dark tiles

    private int[][] boardState; // Current state of the checkers board

    public CheckersGraphics() {
        setTitle("Checkers Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int titleBarHeight = 37;
        System.out.println(titleBarHeight);
        int frameWidth = COLS * TILE_SIZE + 19 + getInsets().left + getInsets().right;
        int frameHeight = ROWS * TILE_SIZE + titleBarHeight + getInsets().bottom;
        setSize(frameWidth, frameHeight);

        //setSize(COLS * TILE_SIZE, ROWS * TILE_SIZE);
        setLocationRelativeTo(null); // Center the frame on the screen

        initializeBoard();
    }

    // Method to initialize the board state
    private void initializeBoard() {
        setVisible(true);
        boardState = new int[ROWS][COLS];
        // Initialize the board with empty squares
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                boardState[row][col] = 0;
            }
        }
    }

    // Method to update the board with a new state
    public void updateBoard(int[][] newState) {
        boardState = newState;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Draw the board
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                // Determine the color of the tile
                Color color = (row + col) % 2 == 0 ? lightColor : darkColor;
                g.setColor(color);
                // Draw the tile
                g.fillRect(col * TILE_SIZE + 9, row * TILE_SIZE + 30, TILE_SIZE, TILE_SIZE);
                // Draw checkers pieces if any
                if (boardState[row][col] != 0) {
                    g.setColor(boardState[row][col] == 1 ? Color.RED : Color.BLACK);
                    g.fillOval(col * TILE_SIZE + 5 + 9, row * TILE_SIZE + 5 + 30, TILE_SIZE - 10, TILE_SIZE - 10);
                }
            }
        }
    }
}
