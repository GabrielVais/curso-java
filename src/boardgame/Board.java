package boardgame;

public class Board {
	
	private int rows;
	
	private int columns;
	
	private Piece[][] pieces;

	public Board(int rows, int columns) {
		
		if(rows <1 || columns < 1) {
			
			throw new BoardException
			("Nesessario que exista 1 coluna ou linha");
			
		}
		
		this.rows = rows;
		this.columns = columns;
		
		pieces = new Piece[rows][columns];
		
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	//metodo para retornar peça a coluna
	public Piece piece(int row, int column) {
		
		if(!positionExists(row, column)) {
			
			throw new BoardException("Posiçao nao existe");
			
		}
		
		return pieces[row][column];
		
	}
	
	public Piece piece(Position position) {
		
		if(!positionExists(position)) {
			
			throw new BoardException("Posiçao nao existe");
			
		}
		
		return pieces[position.getRow()][position.getColumn()];
		
		
	}
	
	public void placePiece(Piece piece, Position position) {
		
		if(thereIsAPiece(position)) {
			
			throw new BoardException("ja existe uma peça nessa posiçao");
			
		}
			
		pieces[position.getRow()][position.getColumn()] = piece;
		
		piece.position = position;
	}
	
	//metodo para remover peça
		public Piece removePiece(Position position) {
			
			if(!positionExists(position)) {
				
				throw new BoardException("posiçao invalida");
				
			}
			
			if(piece(position) == null) {
				
				return null;
				
			}

			Piece aux = piece(position);
			
			aux.position = null;
			pieces[position.getRow()][position.getColumn()] = null;
			return aux;
				
		}
	
	private boolean positionExists(int row, int column) {
		
		return row >=0 && row < rows && column >= column && column < columns;
	}
	
	//verificando se a posiçao existe
	public boolean positionExists(Position position) {
		
		return positionExists(position.getRow(), position.getColumn());
		
		
	}
	
	
	//verificando se a peça exista na posiçao
	public boolean thereIsAPiece(Position position) {
		
		if(!positionExists(position)) {
			
			throw new BoardException("Posiçao nao encontrada");
			
		}
		
		return piece(position) != null;
		
	}
	

}
