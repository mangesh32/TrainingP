package day_2;
import java.util.Date;
import java.util.regex.*;
public class Contact {
	private String firstName,
		middleName,
		lastName,
		gender,
		address,
		area,
		pincode,
		mobile,
		email,
		website,
		telephone,
		state,
		country; 
	
	private Date dateOfBirth,anniversary;
	
	public boolean validate() throws Exception{
		if(this.firstName.isEmpty() || this.lastName.isEmpty() || this.dateOfBirth==null || this.email.isEmpty()){
			throw new Exception("Please Specify Required Details.");
		}
		Pattern p=Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
		Matcher m=p.matcher(this.email);
		if(!m.find()){
			throw new Exception("Provide Valid Email.");
		}
		return false;
		
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		Pattern p=Pattern.compile("\\d{10}");
		Matcher m=p.matcher(mobile);
		if(m.find())
		{this.mobile = mobile;System.out.println("done");}
		else
			System.err.print("Invalid Mobile");
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}
	
	
}
