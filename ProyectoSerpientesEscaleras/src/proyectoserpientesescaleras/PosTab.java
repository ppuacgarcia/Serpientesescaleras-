/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoserpientesescaleras;


public class PosTab {
    private int vectorx[] = {0,75,150,225,300,375,450,525,525,450,375,300,225,150,75,0};
    private int[] vectory = {350,280,210,140,70,0};
    public int vx(int cuad){
        int extra=cuad/16;
        int posx = cuad-(extra*16);
        return this.vectorx[posx];
    }
    public int vy(int cuad){
        int extra = cuad/8;
        return this.vectory[extra];
    }
}
