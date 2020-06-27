
package Controller;

import Model.Cls_Cuadrado;
import Model.Cls_Rectangulo;
import Model.Cls_Triangulo;
import View.FrmFiguras;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    private Cls_Cuadrado cuadrado;
    private Cls_Rectangulo rectangulo;
    private Cls_Triangulo triangulo;
    private FrmFiguras figuras;

    public Controlador(Cls_Cuadrado cuadrado, Cls_Rectangulo rectangulo, Cls_Triangulo triangulo, FrmFiguras figuras) {
        this.cuadrado = cuadrado;
        this.rectangulo = rectangulo;
        this.triangulo = triangulo;
        this.figuras = figuras;
      
        this.figuras.btntriangulo.addActionListener(this);
    }
    
    public void iniciar(){
        figuras.setTitle("Figuras");
        figuras.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        cuadrado.setLado(Float.parseFloat(figuras.txtladocuadrado.getText()));
        cuadrado.area_cuadrado();
        cuadrado.perimetro_cuadrado();
        figuras.txtareacuadra.setText(cuadrado.area_cuadrado()+"");
        figuras.txtpericuadra.setText(cuadrado.perimetro_cuadrado()+"");
        
        rectangulo.setLargo(Float.parseFloat(figuras.txtlargo.getText()));
        rectangulo.setAncho(Float.parseFloat(figuras.txtancho.getText()));
        rectangulo.area_rectangulo();
        rectangulo.perimetro_rectangulo();
        figuras.txtarearectan.setText(rectangulo.area_rectangulo()+"");
        figuras.txtperirectan.setText(rectangulo.perimetro_rectangulo()+"");
        
        triangulo.setBase(Float.parseFloat(figuras.txtlado1.getText()));
        triangulo.setAltura(Float.parseFloat(figuras.txtlado2.getText()));
        triangulo.setLado1(Float.parseFloat(figuras.txtlado3.getText()));
        triangulo.area_triangulo();
        triangulo.perimetro_triangulo();
        figuras.txtareatri.setText(triangulo.area_triangulo()+"");
        figuras.txtperitrian.setText(triangulo.perimetro_triangulo()+"");
        
   }  
}
