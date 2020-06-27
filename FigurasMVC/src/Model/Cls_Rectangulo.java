
package Model;

public class Cls_Rectangulo {
    private float largo;
    private float ancho;
    private float res;

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }
    
    public float area_rectangulo(){
        res=largo*ancho;
        return res;
    }
    
    public float perimetro_rectangulo(){
        res=2*largo+2*ancho;
        return res;
    }
    
}
