/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoserpientesescaleras;

import java.util.Random;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Dado {
    public int GenerearAleatorio(){
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAleatorio = aleatorio.nextInt(6)+1;
        return intAleatorio;
    }
}
