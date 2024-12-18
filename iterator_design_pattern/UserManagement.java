import java.util.List;
import java.util.ArrayList;

public class UserManagement {
    
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

    public MyIterator getIterator(){
        return new MyIteratorImp(this.users);
    }

}
