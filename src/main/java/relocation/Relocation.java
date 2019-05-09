package main.java.relocation;


public class Relocation {
    int ancienbat = 34;
    int newbat = 0;
    int camion = 0;
    int placecamion = 9;

    public void remplissage() {
        while (placecamion != camion && ancienbat > 0) {
            camion = camion + 1;
            ancienbat = ancienbat - 1;
        }
    }

    public void vidage() {
        while (camion > 0) {
            camion = camion - 1;
            newbat = newbat + 1;
        }
    }

    public void deplacementcamion() {
        while (ancienbat > 0) {
            remplissage();
            vidage();
        }
    }

    public void setup() {
        deplacementcamion();
        System.out.println(newbat);
    }

}