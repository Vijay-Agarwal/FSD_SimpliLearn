package com;
import org.springframework.stereotype.Component;
@Component						//<bean class="com.Address"></bean>
											// bydefault id is class name using camelNaming rules ie address here
public class Address {
private String city;
private String state;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + "]";
}

}
