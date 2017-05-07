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
        int yeara = 2017;
        Zombie z1 = new Zombie("paco", 2014);
        System.out.println("nuevo zombie " + z1.toString());
        String nzombie = "";
        nzombie = tools.InputData.pedirCadena("nombre del zombie: ");
        int yearofc = 0;
        int year1 = 0;
        int year2 = 0;
        int year3 = 0;
        int year4 = 0;
        int year5 = 0;
        int level;
        do{
        yearofc = tools.InputData.pedirEntero("¿que año se convirtio?");
        }while(yearofc<2012||yearofc>2017);
        do {
            level = tools.InputData.pedirEntero("¿que nivel tiene?");
        } while (level < 0 || level > 10);

        year1 = tools.InputData.pedirEntero("¿cuantos convirtio el año 1?");
        year2 = tools.InputData.pedirEntero("¿cuantos convirtio el año 2?");
        year3 = tools.InputData.pedirEntero("¿cuantos convirtio el año 3?");
        year4 = tools.InputData.pedirEntero("¿cuantos convirtio el año 4?");
        year5 = tools.InputData.pedirEntero("¿cuantos convirtio el año 5?");
        Zombie z2 = new Zombie(nzombie, yearofc,level, year1, year2, year3, year4, year5);
        System.out.println("nuevo zombie " + z2.toString());

        System.out.println(" Hola, soy "+z1.getName()+", tengo " + (yeara - z1.getYearOfconversion()) + "  años de conversión y me quedan " + (5 - (yeara - z1.getYearOfconversion())) + " años para convertirme en una bonita flor.");
        //System.out.println("el mejor anyo del Zombie2 es:"+z2.mejorAnyo()+" i el numero de conversiones es "+z2.maxConversiones());
        //System.out.println("es jefe: "+z2.esJefe());
        //System.out.println("es ha convertido: "+z2.haconvertido());
        
        System.out.println("Mi nombre: "+ z2.getName());

        System.out.println("Mi mejor año: "+ z2.mejorAnyo());

        System.out.println("Máximo de conversiones en un año: "+ z2.maxConversiones());

        System.out.println("Media de conversiones por año: "+ z2.mediaConvesiones());

        System.out.println("Total de conversiones a lo largo de mi vida: "+ z2.totalConversions());

        System.out.println("¿He convertido alguna vez? "+ z2.haconvertido());

        System.out.println("¿Soy un jefe? "+ z2.esJefe());
    }

}
