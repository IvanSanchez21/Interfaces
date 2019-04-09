/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import ec.edu.ups.clases.Ave;
import ec.edu.ups.clases.Perro;
import ec.edu.ups.clases.Pez;

/**
 *
 * @author ivan
 */
public class Prueba {

    public static void main(String args[]) {

        Perro perro = new Perro("firulais", 5, 30, "M");
        perro.comer();
        perro.dormir();
        perro.jugar();
        perro.moverse();
        perro.reproducirse();

        Ave ave = new Ave("lorito", 1, 0.1, "H");
        ave.comer();
        ave.dormir();
        ave.jugar();
        ave.moverse();
        ave.reproducirse();

        Pez pez = new Pez("memo", 1, 0.1, "M");
        pez.comer();
        pez.dormir();
        pez.jugar();
        pez.moverse();
        pez.reproducirse();
    }

}
