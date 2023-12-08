public class ContactDetails
{
    private String name;
    private String homePhone;
    private String mobile;
    private String email;

    public ContactDetails()
    {
    }

    public ContactDetails(String name, String homePhone, String mobile, String email) {
        this.name = name;
        this.homePhone = homePhone;
        this.mobile = mobile;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
