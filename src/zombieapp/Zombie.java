/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieapp;

/**
 *
 * @author ferran
 */
public class Zombie {
    private String name;
    private int yearOfconversion;
    private int level;
    private int  conversions_1;
    private int  conversions_2;
    private int  conversions_3;
    private int  conversions_4;
    private int  conversions_5;

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

    @Override
    public String toString() {
        return "Zombie{" + "name=" + name + ", yearOfconversion=" + yearOfconversion + ", level=" + level + ", conversions_1=" + conversions_1 + ", conversions_2=" + conversions_2 + ", conversions_3=" + conversions_3 + ", conversions_4=" + conversions_4 + ", conversions_5=" + conversions_5 + '}';
    }

  
}
