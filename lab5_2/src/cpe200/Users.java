package cpe200;


import java.util.ArrayList;

/**
 * Created by pruet on 12/9/2559.
 */
public class Users {
    public ArrayList<User> userList;
    public Users(){

        userList = new ArrayList<User>();
    }


    public void addUser(User user)
    {
        userList.add(user);
    }

    public void addUser(String userName, String password)
    {
        userList.add(new User(userName,password));
    }

    public void deleteUser(User user)
    {
        if(!exists(user))
           throw new RuntimeException("ERROR");
        userList.remove(user);
    }

    public boolean exists(User user)

    {
        return userList.contains(user);
    }

    public boolean usernameExists(String username)
    {

        return username.contains(username);
    }

    /* This method should return null when the user with username is not in the list */
    public User getUserByUsername(String userName)
    {for(int i=0;i<userList.size();i++){
        if (userList.get(i).equals(userName)) {
        }return userList.get(i);
    }
    return  new User();
    }


    public int count()

    {
         return userList.size();
    }

    public User[] getUserArray()

    {
        User[] userArray = new User[userList.size()];
        for(int i=0;i<userList.size();i++){
            userArray[i] = userList.get(i);
        }
        return userArray;
    }

}
