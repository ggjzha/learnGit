package test;

import com.gzj.five.domain.User;
import com.gzj.test.UserService;
import com.gzj.test.UserServiceImpl;

import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {
        User user = new User();
        System.out.println(user);
        UserService userService = new UserServiceImpl();

        ServiceLoader<UserService> load = ServiceLoader.load(UserService.class);
        System.out.println(load);

    }
}
