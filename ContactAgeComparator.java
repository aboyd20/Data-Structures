import java.util.Comparator;

public class ContactAgeComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact age1, Contact age2) {
    	if (age1.getAge() > age2.getAge()) {return 1;}
    	else if (age1.getAge() < age2.getAge()) {return -1;}
    	else { return 0;}
    }
}