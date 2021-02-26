/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoserpientesescaleras;
import static java.lang.Thread.yield;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
/**
 *
 * @author m825
 */
public class Objeto extends Thread{
    private int x=0;
    private int y=0;
    private String nombre;
    private int limite=530;
    public JLabel label;
    private boolean pause;
    private boolean detenido;
    private  int contador=0;
    private int dado;
    private int casilla=0;
    int c=0;
    public Objeto(JLabel label){
        this.label=label;
        this.pause=false;
        this.casilla=0;
    }
    
    @Override
    public void run(){
        this.x= this.label.getX();
        this.y= this.label.getY();
        
        this.pause=false;
        int slp=1;
        int subir=70; 
        int dadoaux=this.dado;
        filas();
        while(x>=0 && y>=0){
            filas();
            
            if(x>=530 && (contador==1||contador==3||contador==5)){//arriba 1
                
                this.x=label.getX();
                this.y=label.getY();
                int pos=y-subir;
                for (int i=this.y;pos<=i;i--){
                    Pausar();
                        while(this.pause==true){
                            this.pause=pausado();
                            
                        }
                        System.out.println("fuera del while");
                   System.out.println(contador+"");
                              try {
                                  y=i;
                                  this.label.setLocation(x,y);
                                  Thread.sleep(slp);
                              } catch (InterruptedException ex) {
                                  Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                              }
                     filas();
                     c++;
                }
                
                
                
           }else if(x<=0 && (contador==2||contador==4||contador==6)){
                this.x=label.getX();
                this.y=label.getY();
                int pos=y-subir;
                for (int i=this.y;pos<=i;i--){
                   Pausar();
                        while(this.pause==true){
                            this.pause=pausado();
                            System.out.println("dentro del while");
                        }
                        System.out.println("fuera del while");
                              try {
                                  y=i;
                                  this.label.setLocation(x,y);
                                  Thread.sleep(slp);
                              } catch (InterruptedException ex) {
                                  Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                              }
                     filas();   
                     c++;
                }
           
           }else if(contador==1||contador==3||contador==5){//derecha
               
               
                for (int i=x;i<=this.limite;i++){
                        Pausar();
                        while(this.pause==true){
                            this.pause=pausado();
                         
                                if(this.casilla==3){
                                    this.x=label.getX();
                                    this.y=label.getY();
                                    int pos=y-2*subir;
                                    for (int j=this.y;pos<=j;j--){
                                                  try {
                                                      y=j;
                                                      this.label.setLocation(x,y);
                                                      Thread.sleep(slp);
                                                  } catch (InterruptedException ex) {
                                                      Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                                  }
                                         filas();   
                                         
                                    }
                                    
                                    
                                    this.casilla=19;
                                    this.c=casilla*75;
            
                                }else if(casilla==21){
                                    int pos=y-2*subir;
                                    for (int j=this.y;pos<=j;j--){
                                                  try {
                                                      y=j;
                                                      
                                                      this.label.setLocation(x,y);
                                                      Thread.sleep(slp);
                                                  } catch (InterruptedException ex) {
                                                      Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                                  }
                                         filas();   
                                         
                                    }
                                    int posicionx=x+75;
                                    for(int j=x;j<=posicionx;j++){
                                        x=j;
                                        this.label.setLocation(x, y);
                                        try {
                                            Thread.sleep(slp);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    this.casilla=38;
                                    this.c=casilla*75;
                                
                                }else if(this.casilla==17 ||this.casilla==23){
                                    int posicionx=x-75;
                                    for(int j=x;posicionx<=j;j--){
                                        x=j;
                                        this.label.setLocation(x, y);
                                        try {
                                            Thread.sleep(slp);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    int pos=y+2*subir;
                                    for (int j=this.y;j<=pos;j++){
                                                  try {
                                                      y=j;
                                                      
                                                      this.label.setLocation(x,y);
                                                      Thread.sleep(slp);
                                                  } catch (InterruptedException ex) {
                                                      Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                                  }
                                         filas();   
                                         
                                    }
                                    
                                    if(this.casilla==17){
                                        this.casilla=0;
                                        this.c=casilla*75;
                                    }else if(this.casilla==23){
                                        this.casilla=7;
                                        this.c=casilla*75;
                                    }
                                    
                                }
                            
                            System.out.println("dentro del while");
                        }
                        System.out.println("fuera del while");
                    
                     try {
                         this.x=i;
                         this.label.setLocation(x,y);
                         sleep(slp);
                     } catch (InterruptedException ex) {
                         Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                     }
                     c++;
                 }
            }else if(contador==2||contador==4||contador==6){//izquierda
                
                 int pos=x -this.dado*75;
                    for (int i=x;0<=i;i--){
                        Pausar();
                        while(this.pause==true){
                            this.pause=pausado();
                            if(casilla==28){
                                    int posy=y-2*subir;
                                    for (int j=this.y;posy<=j;j--){
                                                  try {
                                                      y=j;
                                                      
                                                      this.label.setLocation(x,y);
                                                      Thread.sleep(slp);
                                                  } catch (InterruptedException ex) {
                                                      Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                                  }
                                         filas();   
                                         
                                    }
                                    int posicionx=x+75;
                                    for(int j=x;j<=posicionx;j++){
                                        x=j;
                                        this.label.setLocation(x, y);
                                        try {
                                            Thread.sleep(slp);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    this.casilla=43;
                                    this.c=casilla*75;
                                
                                }else if (casilla==46){
                                    int posicionx=x+75;
                                    for(int j=x;j<=posicionx;j++){
                                        x=j;
                                        this.label.setLocation(x, y);
                                        try {
                                            Thread.sleep(slp);
                                        } catch (InterruptedException ex) {
                                            Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                    int posy=y+3*subir;
                                    for (int j=this.y;j<=posy;j++){
                                                  try {
                                                      y=j;
                                                      
                                                      this.label.setLocation(x,y);
                                                      Thread.sleep(slp);
                                                  } catch (InterruptedException ex) {
                                                      Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                                                  }
                                         filas();   
                                         
                                    }
                                    this.casilla=18;
                                    this.c=casilla*75;
                                }
                            System.out.println("dentro del while");
                        }
                        System.out.println("fuera del while");
                        try {
                            this.x=i;
                            this.label.setLocation(x,y);
                            Thread.sleep(slp);
                           
                        } catch (InterruptedException ex) {
                             Logger.getLogger(Objeto.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
                     c++;
                 }
                    
            }
            

           yield();
                x=label.getX();
                y=label.getY();
            
            
        }
    
    
   }
    
    
    public void Setdado(int random){
        this.dado=random;
        this.casilla=this.casilla+random;
    }
   
    public void filas(){
        switch (label.getY()) {
            case 0:
                contador=6;
                break;
            case 70:
                contador=5;
                break;
            case 140:
                contador=4;
                break;
            case 210:
                contador=3;
                break;
            case 280:
                contador=2;
                break;
            case 350:
                contador=1;
                break;
            default:
                break;
        }
    }
    
    public void Pausar(){
        
            if(c>=casilla*75.25){
                pause=true;
            }
            
        
    }
    public void Setpause(boolean vf){
        this.pause=vf;
    }
    public boolean pausado(){
       return this.pause;
    }
    public void escalera1(){
        
    }
}
