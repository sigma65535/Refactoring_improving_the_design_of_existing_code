/**
 * 
 */
package Chapter1.version4;

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

		//double totalAmount = 0;
		
		//----/int frequentRenterPoints = 0;
		Enumeration<Rental> rentals = _rentals.elements();
		String result = "Rental Record for " + getName() + "\n";

		while (rentals.hasMoreElements()) {
			
			
			Rental each = (Rental) rentals.nextElement();
			//determine amounts for each line
			int daysRented = each.getDaysRented();
			
			// add frequent renter points
			
			//---/frequentRenterPoints += each.getFrequentRenterPoints();
			
			//show figures for this rental
			result += "\t" + each.getMovie().getTitle()+ "\t" +
			String.valueOf(each.getMovie().getCharge(daysRented)) + "\n";
			//totalAmount += thisAmount;
		}
		
		//add footer lines
		result += "Amount owed is " + String.valueOf(/*totalAmount*/getTotalCharge()) +"\n";
		result += "You earned " + String.valueOf(/*/----/frequentRenterPoints//*/getTotalFrequentRenterPoints())
					+" frequent renter points";
		return result;
	}
	
	private double getTotalCharge(){
		double result = 0;
		Enumeration<Rental> rentals = _rentals.elements();

		while (rentals.hasMoreElements()) {
			Rental each = (Rental) rentals.nextElement();
			//result += each.getCharge();
			int daysRented = each.getDaysRented();
			result += each.getMovie().getCharge(daysRented);
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
