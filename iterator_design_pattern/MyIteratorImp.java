import java.util.*;

public class MyIteratorImp implements MyIterator {
    
    private List<User> users;
    private int size;
    private int position;
    
    public MyIteratorImp(List<User> users){
        this.users = users;
        this.size = users.size();
        this.position = 0; // initially
    }

    public boolean hasNext(){
         if(position >= size)
            return false;
         return true;
    }

    public Object next(){
        Object user = users.get(position);
        position++;
        return user;  // user Object type not User type
    }
    
}
