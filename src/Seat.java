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
	public int soldNum() {if(sold){return 1;} return 0;}
	public void buySeat() {sold = true;}
	public double getPrice() {return price;}
	public String getType() {return type;}
	public void pre(double p) {type="P"; price=p;}
	public void gen(double p) {type="G"; price=p;}
	@Override public String toString() {return " |"+type+"("+sold+")| ";}
}
