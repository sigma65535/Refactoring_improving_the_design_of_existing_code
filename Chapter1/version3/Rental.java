/**
 * getFrequentRenterPoints()-->Moive
 * @author sigma
 */
package Chapter1.version3;

class Rental {

	Movie _movie;
	private int _daysRented;

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
}
