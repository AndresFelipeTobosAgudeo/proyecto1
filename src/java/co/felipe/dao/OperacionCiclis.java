/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.felipe.dao;


import co.felipe.dato.Ciclista;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Sala 30
 */
public class OperacionCiclis {
    
    public int crear(Ciclista dato){
        Conexion c = new Conexion();
        Connection con = c.conectarse();
        // SQL
        // Statement
        // PreparedStatement
        // CallableStatement  
        
        return 0;
    }
    public int editar(Ciclista dato){
        return 0;
    }
    public int borrar(Ciclista dato){
        return 0;
    }
    public int borrar(String pk){
        return 0;
    }
    public Ciclista consulta(String pk){
        return null;
    }
    public List<Ciclista> consulta(){
        return null;
    }
    
}
