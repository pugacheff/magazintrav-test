package testdata;

public class TestUser {

    private String name;
    private String email;
    private String phone;
    private String order;

    public static TestUser setDataUserRequestCall() {

        TestUser testUser = new TestUser();
        testUser.setName("Василий");
        testUser.setEmail("test@email.com");
        testUser.setPhone("(927) 634-28-61");
        testUser.setOrder("289764");

        return testUser;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getOrder() {
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TestUser testUser = (TestUser) o;

        if (!name.equals(testUser.name)) return false;
        if (!email.equals(testUser.email)) return false;
        if (!phone.equals(testUser.phone)) return false;
        return order.equals(testUser.order);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + phone.hashCode();
        result = 31 * result + order.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", order='" + order + '\'' +
                '}';
    }

}
