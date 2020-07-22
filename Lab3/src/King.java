public class King extends Piece{
	King(Position p){
		super(p);
 }


	public boolean isLegalMove(Position newp) {
		if (Math.abs(newp.x - this.x) == 1 && Math.abs(newp.y - this.y) == 1) 
			return true;
		return false;
  
 }
}