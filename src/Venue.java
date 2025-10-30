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
	
	public boolean buyTicket(int row, int col) {
		if(seats[row][col].avalable()) seats[row][col].buySeat();
	}
	
	private boolean isAvailable(int row, int col)
	public void setPremium(int row, double price)
	public void setPremium(int row, int colStart, int colEnd, double price)
	public void setGA(int row, double price)
	public boolean importTickets(String filename) throws IOException
	public double totalRevenue()
	public double totalRevenue(int col)
	public int totalSold()
	public int totalSold(int row)
	public void printVenue()
	public void printVenueType()
	public void printVenuePrice()
	public double maxPrice(int rowStart, int rowEnd, int colStart, int colEnd)
	public boolean containsGA(int row)
	public boolean allPremium(int col)

}
