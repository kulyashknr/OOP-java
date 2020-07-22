public class Pawn extends Piece{
	Pawn(Position p){
		super(p);
 }
 
 public boolean isLegalMove(Position newp) {
	 if(newp.x == this.x && newp.y - this.y == 1) 
		 return true;
	 return false;  
 }
}