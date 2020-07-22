public class Knight extends Piece {
	Knight(Position p){
		super(p);
 }
 
 public boolean isLegalMove(Position newp) {
	 if (Math.abs(newp.x - this.x) == 2 && Math.abs(newp.y - this.y) == 1) 
		 return true;
  
	 else if (Math.abs(newp.y - this.y) == 2 && Math.abs(newp.x - this.x) == 1) 
		 return true;
	 return false;
  
 }
}