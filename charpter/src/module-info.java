import com.gzj.test.UserService;
import com.gzj.test.UserServiceImpl;

module charpter {
    exports com.gzj.five.domain;
    exports com.gzj.test;
    provides UserService with UserServiceImpl;
}