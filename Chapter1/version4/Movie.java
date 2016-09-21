/*
 *  ��ȡ��Price�࣬����Price������� _priceCode
 */
package Chapter1.version4;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String _title;
   /* private int _priceCode;*/
    Price _price;
    
    public Movie(String title, int priceCode) {
      _title = title;
      /*_priceCode = priceCode;--->*/
      setPriceCode(priceCode);
    }
    
    public int getPriceCode() {
      return _price.getPriceCode();
    }
    
    public void setPriceCode(int arg) {
      /*_priceCode = arg;*/
    	switch (arg) {
		case REGULAR:
				_price = new RegularPrice();
			break;
		case CHILDRENS:
			_price = new ChildrensPrice();
		break;

		case NEW_RELEASE:
			_price = new NewReleasePrice();
		break;
		
		default:
			throw new IllegalArgumentException("Incoreect Price Code");
		}
    }
    
    public String getTitle (){
      return _title;
    }
    /***************move to Rental.java***************************/
    double getCharge(int daysRented) {
    	return _price.getCharge(daysRented);
    }
    
	int getFrequentRenterPoints(int daysRented) {
		
		if ((getPriceCode() == Movie.NEW_RELEASE)
			&& daysRented > 1)     return 2;
		else return 1;
	}

	
}
