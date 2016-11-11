package recyclerview.com.icoderslab.recyclerviewtutorial;

/**
 * Created by Faizan Abbas on 11/11/2016.
 */
public class EmployeeInfo {
    private String FirstName;
    private String LastName;
    private String CompanyName;
    private String City;
    private String Country;
    private String PhoneNo;

    public EmployeeInfo(){}

    public EmployeeInfo(String firstName, String lastName, String companyName, String city, String country, String phoneNo) {
        FirstName = firstName;
        LastName = lastName;
        CompanyName = companyName;
        City = city;
        Country = country;
        PhoneNo = phoneNo;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }
}

