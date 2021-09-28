/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;

import java.util.ArrayList;

/**
 *
 * @author ericm
 */
public class Grupo {
    String nombre;
    String descripcion;
    
    public void mostrar(){
        System.out.println(" "+nombre+ " y "+descripcion);
    }
    
    public static void main(String[] args) {
    //Creo 5 objetos de tipo GRupo    
        Grupo grupo1 = new Grupo();
        Grupo grupo2 = new Grupo();
        Grupo grupo3 = new Grupo();
        Grupo grupo4 = new Grupo();
        Grupo grupo5= new Grupo();
    //Creo el vector para guardar los objetos
        Grupo [] vector = new Grupo [5];
        
    //Doy valores a los objetos 
        grupo1.nombre="Eric";
        grupo1.descripcion = "Programar";
        grupo2.nombre="Luis";
        grupo2.descripcion="Tecnico";
        grupo3.nombre="Enzo";
        grupo3.descripcion="Reparaciones";
        grupo4.nombre="Ruben";
        grupo4.descripcion="Dibujar";
        grupo5.nombre="Esteban";
        grupo5.descripcion="Seguridad";        
        
        vector[0] = grupo1;
        vector[1] = grupo2;
        vector[2] = grupo3;
        vector[3] = grupo4;
        vector[4] = grupo5;
        
    //Muestro los objetos
        System.out.println("Los objetos son: ");
        for(Grupo g : vector){
            g.mostrar();
        }
        
    //Realizo modificaciones a los objetos
        grupo1.nombre="Franco";
        grupo3.descripcion="Arte";
        grupo4.nombre="Milena";
        grupo4.descripcion="Karate";
        grupo5.nombre="Belen";
        
    //Muestro los objetos modificados
        System.out.println("\nLos objetos modificados son: ");
        for(Grupo t : vector){
            t.mostrar();
        }
        
    //Defino un ArrayList y guardo los objetos anteriores en él
        ArrayList<Grupo> grupos = new ArrayList<>();
        grupos.add(grupo1);
        grupos.add(grupo2);
        grupos.add(grupo3);
        grupos.add(grupo4);
        grupos.add(grupo5);
        
    //Recorro el ArrayList
        System.out.println("\nEl contenido del ArrayList es:");
        for(Grupo p : grupos){
            p.mostrar();
        }
        
    //Realizo modificaciones en los objetos    
        grupo1.nombre="Gabriel";
        grupo2.descripcion="Planificar";
        grupo5.nombre="Matias";
        
    //Vuelvo a recorrer el ArrayList modificado
        System.out.println("\nEl ArrayList modificado queda: ");
        for(Grupo t : grupos){
            t.mostrar();
        }
        
    }
    
}
