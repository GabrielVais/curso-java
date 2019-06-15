package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {

		board = new Board(8, 8);
		initialSetup();
		
	}
	
	public ChessPiece[][] getPieces(){
		
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		
		for(int i = 0; i<board.getRows(); i++) {
			
			for(int j = 0; j<board.getColumns(); j++) {			
				
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
	public ChessPiece performChessMove(ChessPosition sourcePosition, 
			ChessPosition targetPosition) {
		
		Position source = sourcePosition.toPosition();
		
		Position target = targetPosition.toPosition();
		
		//validando se existe uma pe�a
		
		validateSourcePosition(source);
		
		//validando posi�ao de destino
		
		validateTargetPosition(source, target);
		
		Piece capturedPiece = makeMove(source, target);
		
		return (ChessPiece)capturedPiece;	
		
	}
	
	private Piece makeMove(Position source, Position target) {	
		
		Piece p = board.removePiece(source);
		
		Piece capturedPiece = board.removePiece(target);
		
		board.placePiece(p, target);
		
		return capturedPiece;
		
	}
	
	private void validateSourcePosition(Position position) {
		
		if(!board.thereIsAPiece(position)) {
			
			throw new ChessException("Nao  h� pe�a nessa posi�ao!");
			
		}
		
		if(!board.piece(position).isThereAnyPossibleMove()) {
			
			throw new ChessException("Nao existe movimentos possiveis");
			
		}
		
	}

	
	private void validateTargetPosition(Position source, Position target) {
		if (!board.piece(source).possibleMove(target)) {
			throw new ChessException("The chosen piece can't move to target position");
		}
	}
	
	
	
	//metodo para mover as pe�as
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		
	}
	
	
	//colocando as pe�as no tabuleiro
	private void initialSetup() {
		placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
   
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
       
        placeNewPiece('d', 8, new King(board, Color.BLACK));
	}
}