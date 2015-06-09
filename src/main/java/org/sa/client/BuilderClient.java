package org.sa.client;

import org.sa.builder.User;

/**
 * Created with IntelliJ IDEA.
 * User: Shai Amar
 * Date: 6/8/15
 * Time: 6:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class BuilderClient
{
    public static void main(String[] args)
    {
        User user = new User.UserBuilder("Clark", "Kent").age(28).phone("054-6644889").address("Smallvile P.O box 999").build();

        System.out.println("The new User... " + user);
    }
    
}
