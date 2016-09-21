/**
 * 
 */
package Chapter1.version5;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

	private String _name;
	private Vector<Rental> _rentals = new Vector<Rental>();

	public Customer (String name){
		_name = name;
	};

	public void addRental(Rental arg) {
		_rentals.addElement(arg);
	}

	public String getName (){
		return _name;
	};

	public String statement() {

		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";

		while (rentals.hasMoreElements()) {
			
			
			Rental each = (Rental) rentals.nextElement();
			int daysRented = each.getDaysRented();
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getMovie()._price.getCharge(daysRented)) + "\n";
		
		}
		
		
		result += "Amount owed is " + String.valueOf(getTotalCharge()) +"\n";
		result += "You earned " + String.valueOf(getTotalFrequentRenterPoints())
					+" frequent renter points";
		return result;
	}
	
	private double getTotalCharge(){
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getCharge();
		}
		
		return result;
	}
	
	private int getTotalFrequentRenterPoints(){
		int result = 0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			result += each.getFrequentRenterPoints();
		}
		
		return result;
	}
}	
