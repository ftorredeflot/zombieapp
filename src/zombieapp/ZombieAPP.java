
package zombieapp;

/**
 *
 * @author ferran
 */
 import tools.InputData.*;
 import zombieapp.Zombie;
public class ZombieAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zombie z1=new Zombie("paco",1994);
        System.out.println("nuevo zombie "+ z1.toString());
        String nzombie="";
        nzombie=tools.InputData.pedirCadena("nombre del zombie: ");
        int yearofc=0;
        int year1=0;
        int year2=0;
        int year3=0;
        int year4=0;
        int year5=0;
        int level;
        yearofc=tools.InputData.pedirEntero("¿que año se convirtio?");
        level=tools.InputData.pedirEntero("¿que nivel tiene?");
        year1=tools.InputData.pedirEntero("¿cuantos convirtio el año 1?");
        year2=tools.InputData.pedirEntero("¿cuantos convirtio el año 2?");
       year3=tools.InputData.pedirEntero("¿cuantos convirtio el año 3?");
        year4=tools.InputData.pedirEntero("¿cuantos convirtio el año 4?");
        year5=tools.InputData.pedirEntero("¿cuantos convirtio el año 5?");
        Zombie z2=new Zombie(nzombie,level,yearofc,year1,year2,year3,year4,year5);
         System.out.println("nuevo zombie "+ z2.toString());
        
    }
    
}
