import java.io.Serializable;


public class Employee implements Serializable {
private String name;
private String address;
private transient String SSN;
private long number;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public String getSSN() {
	return SSN;
}
public void setSSN(String sSN) {
	SSN = sSN;
}
public void setAddress(String address) {
	this.address = address;
}
public long getNumber() {
	return number;
}
public void setNumber(long number) {
	this.number = number;
}

}
