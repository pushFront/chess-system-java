package boardgame;
/*
    Classe Piece é uma classe abstrata, dela serão criadas as subclasses,
    onde cada uma irá representar um tipo de peça (peão, cavalo, rainha..)
 */
public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; /* Uma peça quando criada deve ter null como position */
    }

    /* Protected pois deve ser visível apenas no pacote board e em subclasses */
    protected Board getBoard() {
        return board;
    }
}
