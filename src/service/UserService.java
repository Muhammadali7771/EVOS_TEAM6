package service;

import model.User;

public class UserService {
    private User[] users = new User[100];
    private int index = 0;

    public boolean addUser(User user) {
        if (user == null) {
            return false; // Cannot add null user
        }

        if (!hasUser(user.getUsername())) {
            if (index < users.length) {
                users[index++] = user;
                return true;
            } else {
                return false; // Array is full
            }
        } else {
            return false; // User already exists
        }
    }

    private boolean hasUser(String userName) {
        for (User user : users) {
            if (user != null && user.getUsername().equals(userName)) {
                return true;
            }
        }
        return false;
    }

}
