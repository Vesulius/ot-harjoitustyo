package minesweepper.logic;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class BoardGeneratorTest {
    
    BoardGenerator boardGenerator;
    
    @Before
    public void setup() {
        this.boardGenerator = new BoardGenerator();
    }
    
    @Test
    public void createdBoardGenerator() {
        assertTrue(this.boardGenerator != null);
    }
    
    @Test
    public void canCreateBoards() {
        assertTrue(this.boardGenerator.generateBoard(1, 1, 0) != null);
    }
    
    @Test
    public void rightAmountOfMines() {
        int[][] test = this.boardGenerator.generateMines(new int[10][10], 10);
        int minesCount = 0;
        for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 10; x++) {
                if (test[y][x] == -1) minesCount++;
            }
        }
        assertEquals(10, minesCount);
    }
}