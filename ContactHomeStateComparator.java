import java.util.Comparator;

public class ContactHomeStateComparator implements Comparator<Contact> {
    @Override
    public int compare(Contact hs1, Contact hs2) {
        return hs1.getHomestate().compareTo(hs2.getHomestate());
    }
}