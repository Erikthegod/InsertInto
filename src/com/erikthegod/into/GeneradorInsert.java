/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.into;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author dam
 */
public class GeneradorInsert {
    int aleatorioNomb;
    int aleatorioApellido;
    int aleatorioCategoria;
    PrintWriter fichero;
    public void generarInsert(Persona pers) {
        try {
            Connection c = null;//Conexión
            Statement stmt = null;//Sentencia
            String sql = null;//Cadena con la sentencia sql
            ResultSet rs = null;//Conjunto de resultados
            Class.forName("org.sqlite.JDBC");//Carga del driver
            c = DriverManager.getConnection("jdbc:sqlite:C:/insertIntoJava/InsertInto.db");
            stmt = c.createStatement();
            aleatorioNomb = (int) (Math.random()* pers.getNombre().length);
            aleatorioApellido = (int) (Math.random()* pers.getApellido().length);
            aleatorioCategoria = (int) (Math.random()* pers.getCategoria().length);
            pers.setSalario(((int) (Math.random()*142000)+1)+8000);
            pers.setFechaNacimiento(((int) (Math.random()*47)+1)+1951);
            sql = "insert into t_empleados values('" + pers.getNombre()[aleatorioNomb] + "','" + pers.getApellido()[aleatorioApellido]  + "','" +  pers.getCategoria()[aleatorioCategoria]+"','"+ pers.getSalario()+"','"+ pers.getFechaNacimiento()+"');";
            stmt.executeUpdate(sql);
            c.close();

        } catch (SQLException ex) {
            System.err.println("ERROR DE SQL EXCEPTION");
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            System.err.println("ERROR DE CLASS NOT FOUND");
            ex.printStackTrace();
        }
    }
    public void exportarTxt(Persona pers){
       try {
            fichero = new PrintWriter("inserts.sql");
            for(int x=0;x<1000;x++){
            aleatorioNomb = (int) (Math.random()* pers.getNombre().length);
            aleatorioApellido = (int) (Math.random()* pers.getApellido().length);
            aleatorioCategoria = (int) (Math.random()* pers.getCategoria().length);
            pers.setSalario(((int) (Math.random()*142000)+1)+8000);
            pers.setFechaNacimiento(((int) (Math.random()*47)+1)+1951);
            fichero.println("insert into t_empleados values('" + pers.getNombre()[aleatorioNomb] + "','" + pers.getApellido()[aleatorioApellido]  + "','" +  pers.getCategoria()[aleatorioCategoria]+"','"+ pers.getSalario()+"','"+ pers.getFechaNacimiento()+"');");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Fallo al exportar el juego");
        } finally {
            fichero.close();
        }
    }
}
