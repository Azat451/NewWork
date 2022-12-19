package Classwork.Lesson17;

public abstract class User {
    private String name;
    private String user;
    private String lastname;
    private String password;
    private int age;
    private String year_of_birth;
    private Address address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(String year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", lastname='" + lastname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", year_of_birth='" + year_of_birth + '\'' +
                ", address=" + address +
                '}';
    }
}
