import java.util.Comparator;

public class ContactLastnameComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact last1, Contact last2) {
        return last1.getLastname().compareTo(last2.getLastname());
    }
}