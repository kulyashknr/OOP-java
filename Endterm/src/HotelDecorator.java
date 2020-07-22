
public abstract class HotelDecorator implements Hotel {
	Hotel decoratedHotel;
	
	public HotelDecorator(Hotel h){
		this.decoratedHotel = h;
	}
	public int getCost(){
		return decoratedHotel.getCost();
	}
	public String getInfo(){
		return decoratedHotel.getInfo();
	}
}
}
