package org.sa.builder;

/**
 * Created with IntelliJ IDEA.
 * User: Shai Amar
 * Date: 6/8/15
 * Time: 6:55 PM
 * This class shows the Builder design pattern
 * Builder design pattern is meant to solve a situation where a class has many parameters, some of them mandatory and
 * some of them are optional.
 * It allows the client to relate to all the mandatory parameters and yet set only the necessary optional parameters
 * intuitively.
 *
 * To change this template use File | Settings | File Templates.
 */
public class User
{
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    private User(UserBuilder ub)
    {
        this.firstName = ub.firstName;
        this.lastName  = ub.lastName;
        this.age       = ub.age;
        this.phone     = ub.phone;
        this.address   = ub.address;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getAge()
    {
        return age;
    }

    public String getPhone()
    {
        return phone;
    }

    public String getAddress()
    {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder
    {
        //  mandatory field
        private final String firstName;

        //  mandatory field
        private final String lastName;

        //  Optional fields
        private int age;
        private String phone;
        private String address;

       public UserBuilder(String firstName, String lastName)
       {
           this.firstName = firstName;
           this.lastName  = lastName;
       }

        public UserBuilder age(int age)
        {
            this.age = age;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build()
        {
            return new User(this);
        }

    }

}
