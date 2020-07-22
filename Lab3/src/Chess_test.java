public class Chess_test {
 public static void main(String[] args) {
	  
	  Position p = new Position(3, 8);  
	  Position newp = new Position(5, 6);
	  
	  Queen queen = new Queen(p);
	  System.out.println(queen.isLegalMove(newp));
	  King king = new King(p);
	  System.out.println(king.isLegalMove(newp));
	  Knight knight = new Knight(p);
	  System.out.println(knight.isLegalMove(newp));
	  Bishop bishop = new Bishop(p);
	  System.out.println(bishop.isLegalMove(newp));
	  Rook rook = new Rook(p);
	  System.out.println(rook.isLegalMove(newp));

 }
}