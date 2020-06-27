
package Model;

public class Cls_Triangulo {
    private float lado1;
    private float base;
    private float altura;
    private float res;

    public float getRes() {
        return res;
    }

    public void setRes(float res) {
        this.res = res;
    }

    public float getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    public float area_triangulo(){
        res=base*altura/2;
        return res;
    }
    
    public float perimetro_triangulo(){
        res=lado1*3;
        return res;
    }

}
