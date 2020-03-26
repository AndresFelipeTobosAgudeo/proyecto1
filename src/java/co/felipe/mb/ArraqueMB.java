/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.felipe.mb;


import co.felipe.dao.OperacionCiclis;
import co.felipe.dato.Ciclista;
import javax.inject.Named;

@Named(value = "arraqueMB")
public class ArraqueMB {

    /**
     * Creates a new instance of ArraqueMB
     */
    public ArraqueMB() {
        
    }
    public String mensaje() {
        System.out.println(" Ingreso- - - - - - - - ");
        OperacionCiclis oper = new OperacionCiclis();
        int x = oper.crear(new Ciclista());
        System.out.println(" Guuardo - - - - - - - - "+x);
        return "";
    }
}
