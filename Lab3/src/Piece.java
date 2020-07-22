public abstract class Piece {
 
	int x;
	int y;

 	Piece (Position newp){
	    this.x = newp.x;
	    this.y = newp.y;
 	}
 
 	public abstract boolean isLegalMove(Position p);

}