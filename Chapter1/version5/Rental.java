/**
 * 
 * @author sigma

 */
package Chapter1.version5;

class Rental {

	Movie _movie;
	private int _daysRented;
	private Price _price;

	public Rental(Movie movie, int daysRented) {
		_movie = movie;
		_daysRented = daysRented;
	}

	public int getDaysRented() {
		return _daysRented;
	}
	
	public Movie getMovie() {
		return _movie;
	}
	
	int getFrequentRenterPoints() {
		return _movie.getFrequentRenterPoints(_daysRented);
	};
	
	double getCharge(){
		return _price.getCharge(_daysRented);
	}
}
