package com.Open_Bootcamp;

public class Encapsulacion {
    public static void main(String[] args) {
        Persona edad = new Persona();
        edad.setTipoEdad(20);

        Persona nombre = new Persona();
        nombre.setNombre("Nia");

        Persona telefono = new Persona();
        telefono.setTelefono(623456789);

        System.out.println(edad.getTipoEdad());
        System.out.println(nombre.getNombre());
        System.out.println(telefono.getTelefono());
    }
}

class Persona {
    private int TipoEdad;
    private String nombre;
    private int telefono;

    public void setTipoEdad(int Edad) {
        this.TipoEdad = Edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public int getTipoEdad() {
        return this.TipoEdad;
    }

    public String getNombre() {
        return this.nombre;
    }

   public int getTelefono() {
        return this.telefono;
   }
}
