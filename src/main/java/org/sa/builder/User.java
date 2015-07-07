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
    private final String FIRST_NAME;
    private final String LAST_NAME;
    private final int AGE;
    private final String PHONE;
    private final String ADDRESS;

    private User(UserBuilder ub)
    {
        this.FIRST_NAME = ub.FIRST_NAME;
        this.LAST_NAME = ub.LAST_NAME;
        this.AGE = ub.age;
        this.PHONE = ub.phone;
        this.ADDRESS = ub.address;
    }

    public String getFirstName()
    {
        return FIRST_NAME;
    }

    public String getLastName()
    {
        return LAST_NAME;
    }

    public int getAge()
    {
        return AGE;
    }

    public String getPhone()
    {
        return PHONE;
    }

    public String getAddress()
    {
        return ADDRESS;
    }

    @Override
    public String toString() {
        return "User{" +
                "FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", AGE=" + AGE +
                ", PHONE='" + PHONE + '\'' +
                ", ADDRESS='" + ADDRESS + '\'' +
                '}';
    }

    public static class UserBuilder
    {
        //  mandatory field
        private final String FIRST_NAME;

        //  mandatory field
        private final String LAST_NAME;

        //  Optional fields
        private int age;
        private String phone;
        private String address;

       public UserBuilder(String firstName, String lastName)
       {
           this.FIRST_NAME = firstName;
           this.LAST_NAME = lastName;
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
