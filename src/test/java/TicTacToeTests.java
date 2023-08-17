import org.Game.GameBoard;
import org.Game.GameLogic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTests {

    @Test
    void ThreeOInFirstRowWin() {
        char[][] board = {
                {'O','O','O'},
                {'X','O','O'},
                {'O','X',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O',3));
    }
    @Test
    void ThreeOInSecondRowWin() {
        char[][] board = {
                {'X',' ','X'},
                {'O','O','O'},
                {'X',' ','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeOInThirdRowWin() {
        char[][] board = {
                {'X','X',' '},
                {'X','X',' '},
                {'O','O','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeOInFirstColumnWin() {
        char[][] board = {
                {'O','X','X'},
                {'O',' ','X'},
                {'O','X',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeOInSecondColumnWin() {
        char[][] board = {
                {'X','O','O'},
                {'O','O','X'},
                {'X','O','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeOInThirdColumnWin() {
        char[][] board = {
                {' ','X','O'},
                {'X',' ','O'},
                {'X','X','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeODiagonallyOptionOneWin() {
        char[][] board = {
                {' ','X','O'},
                {'X','O','X'},
                {'O',' ','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeODiagonallyOptionTwoWin() {
        char[][] board = {
                {'O','X',' '},
                {' ','O','X'},
                {'X','X','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 3));
    }
    @Test
    void ThreeXInFirstRowWin() {
        char[][] board = {
                {'X','X','X'},
                {'X','O','O'},
                {'O',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXInSecondRowWin() {
        char[][] board = {
                {' ','O','X'},
                {'X','X','X'},
                {'O',' ','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXInThirdRowWin() {
        char[][] board = {
                {' ','O',' '},
                {'O','O','X'},
                {'X','X','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXInFirstColumnWin() {
        char[][] board = {
                {'X','O','X'},
                {'X','O','O'},
                {'X',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXInSecondColumnWin() {
        char[][] board = {
                {'O','X','X'},
                {'X','X','O'},
                {'O','X','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXInThirdColumnWin() {
        char[][] board = {
                {' ','O','X'},
                {'O',' ','X'},
                {'O','X','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXDiagonallyOptionOneWin() {
        char[][] board = {
                {'O',' ','X'},
                {'X','X','O'},
                {'X',' ','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void ThreeXDiagonallyOptionTwoWin() {
        char[][] board = {
                {'X','O','O'},
                {'O','X','X'},
                {' ',' ','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 3));
    }
    @Test
    void GameFinishedInATieOptionOne() {
        char[][] board = {
                {'X','X','O'},
                {'X','O','X'},
                {'O','O','X'},
        };
        assertTrue(GameLogic.isGameFinished(board,3));
    }
    @Test
    void GameFinishedInATieOptionTwo() {
        char[][] board = {
                {'O','X','X'},
                {'X','O','O'},
                {'O','X','X'},
        };
        assertTrue(GameLogic.isGameFinished(board,3));
    }
    @Test
    void GameFinishedInATieOptionThree() {
        char[][] board = {
                {'X','X','O'},
                {'X','X','O'},
                {'O','O','X'},
        };
        assertTrue(GameLogic.isGameFinished(board,3));
    }
    @Test
    void NotValidMove_OccupiedPosition() {
        char[][] board = {
                {'X','X','O'},
                {' ','X','O'},
                {'O','O','X'},
        };
        assertFalse(GameBoard.isValidMove(board, "1"));
    }
    @Test
    void NotValidMove_InvalidInput() {
        char[][] board = {
                {'X','X','O'},
                {' ','X','O'},
                {'O','O','X'},
        };
        assertFalse(GameBoard.isValidMove(board, "H"));
    }

    //few extra tests after I implemented 10x10 board and enhanced game option.
    @Test
    void FiveXInARowWin() {
        char[][] board = {
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ','X','X','X','X','X',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ','O',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ','O',' '},
                {' ',' ',' ',' ','O',' ','O',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 5));
    }
    @Test
    void FiveXInColumnWin() {
        char[][] board = {
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {'X',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {'X',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {'X',' ',' ',' ','O',' ',' ',' ',' ',' '},
                {'X',' ',' ',' ',' ',' ',' ',' ','O',' '},
                {'X',' ',' ',' ','O',' ','O',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 5));
    }
    @Test
    void FiveODiagonallyWin() {
        char[][] board = {
                {' ','X',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {'X',' ',' ',' ',' ','X','X',' ','X',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ','O',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ','O',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ','O',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ','O',' ',' ',' '},
                {' ','X',' ',' ',' ',' ',' ','O',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O', 5));
    }
    @Test
    void FiveXDiagonallyWin() {
        char[][] board = {
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {'O',' ',' ',' ',' ','O',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ','X','X',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ','O',' ','X',' ',' ',' ',' '},
                {' ',' ',' ',' ','X',' ',' ',' ','O',' '},
                {'O',' ',' ','X',' ',' ',' ',' ',' ',' '},
                {' ',' ','X',' ',' ',' ',' ',' ','O',' '},
                {' ','X',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X', 5));
    }
}

