package pratice.springSecurity.service;

import pratice.springSecurity.model.Role;
import pratice.springSecurity.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
