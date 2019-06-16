package chess;

import java.util.ArrayList;
import java.util.List;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private int turn;
	
	private Color currentPlayer;
	
	private Board board;
	
	private List<Piece> piecesOnTheBoard = new ArrayList<>();
	
	private List<Piece> capturedPieces = new ArrayList<>();

	public ChessMatch() {

		board = new Board(8, 8);
		turn = 1;
		currentPlayer = Color.WHITE;
		initialSetup();
		
	}
	
	
	public int getTurn() {
		
		return turn;
		
	}
	
	
	public Color getCurrentPlayer() {
		
		return currentPlayer;
		
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
	
	
	public boolean[][] possibleMoves(ChessPosition sourcePosition){
		
		Position position = sourcePosition.toPosition();
		
		validateSourcePosition(position);
		
		return board.piece(position).possibleMoves();
		
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
		
		nextTurn();
		
		return (ChessPiece)capturedPiece;	
		
	}
	
	private Piece makeMove(Position source, Position target) {	
		
		Piece p = board.removePiece(source);
		
		Piece capturedPiece = board.removePiece(target);
		
		board.placePiece(p, target);
		
		if(capturedPiece != null) {
			
			piecesOnTheBoard.remove(capturedPiece);
			
			capturedPieces.add(capturedPiece);
			
		}
		
		return capturedPiece;
		
	}
	
	private void validateSourcePosition(Position position) {
		
		if(!board.thereIsAPiece(position)) {
			
			throw new ChessException("Nao  h� pe�a nessa posi�ao!");
			
		}
		
		if(currentPlayer != ((ChessPiece)board.piece(position)).getColor()) {
			
			throw new ChessException("A pe�a escolhida nao e sua");
			
		}
		
		
		if(!board.piece(position).isThereAnyPossibleMove()) {
			
			throw new ChessException("Nao existe movimentos possiveis");
			
		}
		
	}
	
	//metodo do turno
	
	private void nextTurn() {
		
		turn ++;
		
		currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
		
		
	}

	
	private void validateTargetPosition(Position source, Position target) {
		if (!board.piece(source).possibleMove(target)) {
			throw new ChessException("The chosen piece can't move to target position");
		}
	}
	
	
	
	//metodo para mover as pe�as
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
		
		piecesOnTheBoard.add(piece);
		
		
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