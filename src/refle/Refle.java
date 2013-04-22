package refle;

/**
 * Created by bungubbang
 * Email: bungubbang57@gmail.com
 */
public class Refle {

    // Field
    private Integer id;
    public String name;
    public Integer age;
    public String address;

    // Constructor
    public Refle() {}
    public Refle(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    @Override
    public String toString() {
        return "Refle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
