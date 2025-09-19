package POO35418HERENCIAMULTIPLE2;
import java.util.*;
import misClases.*;

public class POO35418HERENCIAMULTIPLE2 {
   public static void main(String[] args) {
     Cubo c1 = new Cubo();
     System.out.println("c1{area= "+c1.area()
               +" ,volumen="+c1.volumen()+"}");
     Cubo c2 = new Cubo(2);
     System.out.println("c2{area= "+c2.area()
               +" ,volumen="+c2.volumen()+"}");
 }
}
