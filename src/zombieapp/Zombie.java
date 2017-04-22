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
    private int[] conversions;

    public Zombie(String name, int yearOfconversion, int level, int[] conversions) {
        this.name = name;
        this.yearOfconversion = yearOfconversion;
        this.level = level;
        this.conversions = conversions;
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

    public int[] getConversions() {
        return conversions;
    }

    public void setConversions(int[] conversions) {
        this.conversions = conversions;
    }

    @Override
    public String toString() {
        return "Zombie{" + "name=" + name + ", yearOfconversion=" + yearOfconversion + ", level=" + level + ", conversions=" + conversions + '}';
    }
    
    
}
