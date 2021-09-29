package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD cd = new CD("Hybrid Theory", 700, "CD-R", 350);
        DVD dvd = new DVD("Little Mermaid", 4700, "DVD-R", 1450);
        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
        cd.spinDisc();
        dvd.spinDisc();

        cd.readData();
        dvd.readData();

        System.out.println(cd.writeData(275));
        System.out.println(dvd.writeData(8000));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());

    }
}
