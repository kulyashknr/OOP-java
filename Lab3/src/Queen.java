
public class Queen extends Piece{
	Queen(Position p){
	 super(p);
 }
 public boolean isLegalMove(Position newp) {
	 if(newp.x == this.x || newp.y == this.y) 
		 return true;
  		else if (Math.abs(newp.x - this.x) == Math.abs(newp.y - this.y))
  			return true;  
  		else 
  			return false;
 }
}
 
