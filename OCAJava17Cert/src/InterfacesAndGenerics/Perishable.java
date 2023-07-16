package InterfacesAndGenerics;

import java.time.Period;

public interface Perishable {
	
	public static final Period MAX_PERIOD = Period.ofDays(5);
	
	//Instance methods by default public and abstract
	void perish();
	boolean isPerished();
	
	//Can only contain concrete methods only of they are either default,or private, or static.
	//They can contain constants, but not variables
	//Interfaces resembles an abstract class, except no variables or regular concrete methods are allowed.
	//private methods only accessed within interface might contain sensitive info
	//static can be called from class name
	//can override default method
	
	public default boolean verifyPeriod(Period p) {
		return comparePeriod(p) < 0;
	}
	
	private int comparePeriod(Period p) {
		return p.getDays() - MAX_PERIOD.getDays();
	}
	
	public static int getMaxPeriodDays() {
		return MAX_PERIOD.getDays();
	}
}
