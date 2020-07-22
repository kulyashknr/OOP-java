public class Rook extends Piece{
	Rook(Position p){
		super(p);
	}
 
	public boolean isLegalMove(Position newp) {
		return (newp.x == this.x || newp.y == this.y) ;
	}	 

}
