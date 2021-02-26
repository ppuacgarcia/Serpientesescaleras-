/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoserpientesescaleras;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Jugador {
    private int posx;
    private int posy;
    private int Cuad;
    public Jugador(){
        Cuad = 0;
    }
    public void setCuad(){
        int aux;
        Dado dadito = new Dado();
        aux = this.Cuad + dadito.GenerearAleatorio();
        if(aux >= 47){
            aux = 47;
        }
        this.Cuad=aux;
        if(this.Cuad == 3){
            this.Cuad = 19;
        }
        if(this.Cuad == 21){
            this.Cuad = 38;
        }
        if(this.Cuad == 28){
            this.Cuad = 43;
        }
        if(this.Cuad == 17){
            this.Cuad = 0;
        }
        if(this.Cuad == 23){
            this.Cuad = 6;
        }
        if(this.Cuad == 46){
            this.Cuad = 18;
        }
    }
    public int Obtenercuadro(){
        return this.Cuad;
    }
    public void setPosx() {
        PosTab Tablero = new PosTab();
        this.posx = Tablero.vx(this.Cuad);
    }

    public void setPosy() {
        PosTab Tablero = new PosTab();
        this.posy = Tablero.vy(this.Cuad);
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }
    
    public boolean gana(){
        boolean resul= false;
        if(this.Cuad >= 47){
            resul = true;
        }
        return resul;
    }
}
