
package figurasmvc;

import Controller.Controlador;
import Model.Cls_Cuadrado;
import Model.Cls_Rectangulo;
import Model.Cls_Triangulo;
import View.FrmFiguras;



public class FigurasMVC {

    public static void main(String[] args) {
        Cls_Cuadrado cuadrado = new Cls_Cuadrado();
        Cls_Rectangulo rectangulo = new Cls_Rectangulo();
        Cls_Triangulo triangulo = new Cls_Triangulo();
        FrmFiguras figuras = new FrmFiguras();
        Controlador Controller = new Controlador(cuadrado, rectangulo, triangulo, figuras);
        Controller.iniciar();
        figuras.setVisible(true);
    }
    
}
