/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.into;

/**
 *
 * @author dam
 */
public class Persona {
    private String nombre[]={"Erik","Arturo","Cesar","Lucia","Javier","Sergio","Daniel","Alejandro","Adrian","Kinton","Isaias","Mario","Moira","Jessica","Raul","Victor","Laura","Natalia","Raquel"};
    private String apellido[]={"Martin","Galan","Rodriguez","Pena","Sanz","Porras","Sanchez","Ronaldo","Nazario","Gonzalez","Navas","Reyes","Casillas","Alberca"};
    private int salario;
    private int fechaNacimiento;
    private String categoria[]={"Becario","Administrativo","Subalterno","Jefe Sector","Comunity Manager","Bedel"};

    Persona() {
        
    }

    public String[] getNombre() {
        return nombre;
    }

    public String[] getApellido() {
        return apellido;
    }

    public int getSalario() {
        return salario;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String[] getCategoria() {
        return categoria;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
    
    
}
