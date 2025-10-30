public class Seat {
	private boolean sold;
	private String type;
	private double price;
	public Seat(boolean s, String t, double p) {
		sold = s;
		type = t;
		price = p;
	}
	public boolean avalable() {return sold;}
	public void buySeat() {sold = true;}
}
