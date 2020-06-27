
package Model;

public class Cls_Cuadrado {
    private float lado;
    private float res;

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }
    
    public float area_cuadrado(){
        res=lado*lado;
        return res;
    }
    
    public float perimetro_cuadrado(){
        res=lado*4;
        return res;
    }
   
}
