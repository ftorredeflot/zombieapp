package zombieapp;

/**
 *
 * @author ferran
 */
public class Zombie {

    private String name;
    private int yearOfconversion;
    private int level;
    private int conversions_1;
    private int conversions_2;
    private int conversions_3;
    private int conversions_4;
    private int conversions_5;

    public Zombie(String name, int yearOfconversion, int level, int conversions_1, int conversions_2, int conversions_3, int conversions_4, int conversions_5) {
        this.name = name;
        this.yearOfconversion = yearOfconversion;
        this.level = level;
        this.conversions_1 = conversions_1;
        this.conversions_2 = conversions_2;
        this.conversions_3 = conversions_3;
        this.conversions_4 = conversions_4;
        this.conversions_5 = conversions_5;
    }

    public Zombie(String name, int yearOfconversion) {
        this.name = name;
        this.yearOfconversion = yearOfconversion;
        this.level = 0;
        this.conversions_1 = 0;
        this.conversions_2 = 0;
        this.conversions_3 = 0;
        this.conversions_4 = 0;
        this.conversions_5 = 0;
    }

    public Zombie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfconversion() {
        return yearOfconversion;
    }

    public void setYearOfconversion(int yearOfconversion) {
        this.yearOfconversion = yearOfconversion;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getConversions_1() {
        return conversions_1;
    }

    public void setConversions_1(int conversions_1) {
        this.conversions_1 = conversions_1;
    }

    public int getConversions_2() {
        return conversions_2;
    }

    public void setConversions_2(int conversions_2) {
        this.conversions_2 = conversions_2;
    }

    public int getConversions_3() {
        return conversions_3;
    }

    public void setConversions_3(int conversions_3) {
        this.conversions_3 = conversions_3;
    }

    public int getConversions_4() {
        return conversions_4;
    }

    public void setConversions_4(int conversions_4) {
        this.conversions_4 = conversions_4;
    }

    public int getConversions_5() {
        return conversions_5;
    }

    public void setConversions_5(int conversions_5) {
        this.conversions_5 = conversions_5;
    }

    public int mejorAnyo() {

        int min = 0;
        int year = 0;

        if (conversions_1 > min) {
            min = conversions_1;
            year = 1;
        }
        if (conversions_2 > min) {
            min = conversions_2;
            year = 2;
        }
        if (conversions_3 > min) {
            min = conversions_3;
            year = 3;
        }
        if (conversions_4 > min) {
            min = conversions_4;
            year = 4;
        }
        if (conversions_5 > min) {
            min = conversions_5;
            year = 5;
        }
        return year;
    }

    public int maxConversiones() {
        int a = this.mejorAnyo();
        int nc = 0;
        switch (a) {
            case 1:
                nc = conversions_1;
                break;
            case 2:
                nc = conversions_2;
                break;
            case 3:
                nc = conversions_3;
                break;
            case 4:
                nc = conversions_4;
                break;
            case 5:
                nc = conversions_5;
                break;
            default:
                nc = 0;
                break;
        }
        return nc;

    }
    
    public String esJefe(){
        String es="N"
                + "o";
        //System.out.println(this.level);
        if(this.level>=7){es="Si";}
        return es;
    }

    @Override
    public String toString() {
        return "Zombie{" + "name=" + name + ", yearOfconversion=" + yearOfconversion + ", level=" + level + ", conversions_1=" + conversions_1 + ", conversions_2=" + conversions_2 + ", conversions_3=" + conversions_3 + ", conversions_4=" + conversions_4 + ", conversions_5=" + conversions_5 + '}';
    }

}
