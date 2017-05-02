
package zombieapp;

/**
 *
 * @author ferran
 */
 import tools.InputData;
 import zombieapp.Zombie;
public class ZombieAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zombie z1=new Zombie("paco",1994);
        System.out.println("nuevo zombie "+ z1.toString());
    }
    
}
