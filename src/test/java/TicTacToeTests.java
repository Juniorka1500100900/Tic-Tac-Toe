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
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeOInSecondRowWin() {
        char[][] board = {
                {'X',' ','X'},
                {'O','O','O'},
                {'X',' ','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeOInThirdRowWin() {
        char[][] board = {
                {'X','X',' '},
                {'X','X',' '},
                {'O','O','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeOInFirstColumnWin() {
        char[][] board = {
                {'O','X','X'},
                {'O',' ','X'},
                {'O','X',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeOInSecondColumnWin() {
        char[][] board = {
                {'X','O','O'},
                {'O','O','X'},
                {'X','O','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeOInThirdColumnWin() {
        char[][] board = {
                {' ','X','O'},
                {'X',' ','O'},
                {'X','X','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeODiagonallyOptionOneWin() {
        char[][] board = {
                {' ','X','O'},
                {'X','O','X'},
                {'O',' ','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeODiagonallyOptionTwoWin() {
        char[][] board = {
                {'O','X',' '},
                {' ','O','X'},
                {'X','X','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'O'));
    }
    @Test
    void ThreeXInFirstRowWin() {
        char[][] board = {
                {'X','X','X'},
                {'X','O','O'},
                {'O',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXInSecondRowWin() {
        char[][] board = {
                {' ','O','X'},
                {'X','X','X'},
                {'O',' ','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXInThirdRowWin() {
        char[][] board = {
                {' ','O',' '},
                {'O','O','X'},
                {'X','X','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXInFirstColumnWin() {
        char[][] board = {
                {'X','O','X'},
                {'X','O','O'},
                {'X',' ',' '},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXInSecondColumnWin() {
        char[][] board = {
                {'O','X','X'},
                {'X','X','O'},
                {'O','X','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXInThirdColumnWin() {
        char[][] board = {
                {' ','O','X'},
                {'O',' ','X'},
                {'O','X','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXDiagonallyOptionOneWin() {
        char[][] board = {
                {'O',' ','X'},
                {'X','X','O'},
                {'X',' ','O'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void ThreeXDiagonallyOptionTwoWin() {
        char[][] board = {
                {'X','O','O'},
                {'O','X','X'},
                {' ',' ','X'},
        };
        assertTrue(GameLogic.hasContestantWon(board, 'X'));
    }
    @Test
    void GameFinishedInATieOptionOne() {
        char[][] board = {
                {'X','X','O'},
                {'X','O','X'},
                {'O','O','X'},
        };
        assertTrue(GameLogic.isGameFinished(board));
    }
    @Test
    void GameFinishedInATieOptionTwo() {
        char[][] board = {
                {'O','X','X'},
                {'X','O','O'},
                {'O','X','X'},
        };
        assertTrue(GameLogic.isGameFinished(board));
    }
    @Test
    void GameFinishedInATieOptionThree() {
        char[][] board = {
                {'X','X','O'},
                {'X','X','O'},
                {'O','O','X'},
        };
        assertTrue(GameLogic.isGameFinished(board));
    }
    @Test
    void NotValidMove_OccupiedPosition() {
        char[][] board = {
                {'X','X','O'},
                {' ','X','O'},
                {'O','O','X'},
        };
        assertFalse(GameBoard.isValidMove(board, "9"));
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
    }

