public class Venue {
	Seat[][] seats;
	Venue(int row, int col, double price) {
		seats = new Seat[row][col];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				seats[i][j] = new Seat(false, "R", price);
			}
		}
	}
	public boolean buyTicket(int row, int col) {if(seats[row][col].avalable()) {seats[row][col].buySeat();return true;}return false;}
	private boolean isAvailable(int row, int col) {return seats[row][col].avalable();}	
	public void setPremium(int row, double price) {for(int i = 0; i < seats.length; i++) {seats[row][i].pre(price);}}
	public void setPremium(int row, int colStart, int colEnd, double price) {for(int i = colStart; i < colEnd; i++) {seats[row][i].pre(price);}}
	public void setGA(int row, double price) {for(int i = 0; i < seats.length; i++) {seats[row][i].gen(price);}}
	//public boolean importTickets(String filename) throws IOException {}
	public double totalRevenue() {
		double rev = 0.0;
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				rev += seats[i][j].getPrice();
			}
		}
		return rev;
	}
	public double totalRevenue(int col) {
		double rev = 0.0;
		for(int i = 0; i < seats.length; i++) {
			rev += seats[i][col].getPrice();
		}
		return rev;
		
	}
	public int totalSold() {
		int sold = 0;
		for(int i = 0; i < seats.length; i++) {
			for(int j = 0; j < seats[i].length; j++) {
				sold += seats[i][j].soldNum();
			}
		}
		return sold;
	}
	public int totalSold(int row) {
		int sold = 0;
		for(int i = 0; i < seats.length; i++) {
			sold += seats[row][i].soldNum();
		}
		return sold;
	}
	public void printVenue() {
		for(Seat[] s : seats) {
			for(Seat t : s) {
				System.out.print(t.avalable());
			}
			System.out.print("\n");
		}
	}
	public void printVenueType() {
		for(Seat[] s : seats) {
			for(Seat t : s) {
				System.out.print(t.getType());
			}
			System.out.print("\n");
		}
	}
	public void printVenuePrice() {
		for(Seat[] s : seats) {
			for(Seat t : s) {
				System.out.print(t.getPrice());
			}
			System.out.print("\n");
		}
	}
	public double maxPrice(int rowStart, int rowEnd, int colStart, int colEnd) {
		double max = 0.0;
		for(int i = rowStart; i < rowEnd; i++) {
			for(int j = colStart; j < colEnd; j++) {
				if(seats[i][j].getPrice() > max) max = seats[i][j].getPrice();
			}
		}
		return max;
	}
	public boolean containsGA(int row) {
		for(int i = 0; i < seats.length; i++) {
			if(seats[row][i].getType().equals("G")) return true;
		}
		return false;
	}
	public boolean allPremium(int col) {
		for(int i = 0; i < seats.length; i++) {
			if(!(seats[i][col].getType().equals("P"))) return false;
		}
		return true;
	}

}
