public class SingletoneJalebi {  // eager implementation of java
       
    private static final SingletoneJalebi jalebi = new SingletoneJalebi(); // step2

    private SingletoneJalebi(){ // step1 
            System.out.println("Jelebi created!");
    }

    public static SingletoneJalebi getJalebi(){
        return jalebi;
    }
    
}
