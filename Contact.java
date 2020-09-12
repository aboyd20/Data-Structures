
/*
 * The Contact class will have 3 properties:
 * 		firstname   - String
 * 		lastname    - String
 * 		homestate   - String
 * 		age         - Integer
 */

public class Contact  {
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getHomestate() {
		return homestate;
	}
	public void setHomestate(String homestate) {
		this.homestate = homestate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String firstname;
	private String lastname;
	private String homestate;
	private int age;

	public Contact(String firstname, String lastname, String homestate, int age) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.homestate = homestate;
		this.age = age;
	}
	public String toString(){
		return "[firstname="+ firstname + ", lastname=" + lastname + ", homestate=" + homestate + ", age=" + age +"]";
	}

}


