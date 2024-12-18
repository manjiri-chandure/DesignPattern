public class SingletonePattern{

    public static void main(String args[]){
        SingletoneSamosa samosa1 = SingletoneSamosa.getSingletoneSamosa();
        // samosa1.readyMessage();
        System.out.println(samosa1.hashCode());

        SingletoneSamosa samosa2 = SingletoneSamosa.getSingletoneSamosa();
        // samosa1.readyMessage();
        System.out.println(samosa2.hashCode());
        
        SingletoneJalebi jalebi = SingletoneJalebi.getJalebi();
        System.out.println(jalebi.hashCode());

        SingletoneJalebi jalebi2 = SingletoneJalebi.getJalebi();
        System.out.println(jalebi2.hashCode());
    }
}