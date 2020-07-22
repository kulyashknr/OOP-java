public class Bishop extends Piece{
	Bishop(Position p){
		super(p);
 }
 
 public boolean isLegalMove(Position newp) {
  
	 	if (Math.abs(newp.x - this.x) == Math.abs(newp.y - this.y)) 
	 		return true;
	 	return false;
 }
}