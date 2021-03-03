package eg2;

public class Address {

private int aid;
private String street;
private int zipcode;
public Address(int aid, String street, int zipcode) {
	this.aid = aid;
	this.street = street;
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "Address [aid=" + aid + ", street=" + street + ", zipcode=" + zipcode + "]";
}


}
