package com.acme;

public record PersonaRegistro(String nombre, String apellidos) {

    @Override
    public String toString() {
        //Alejandro comenté la linea de codigo que considero se puede eliminar
        //System.out.println("Esta instruccion es inservible");
        return "%s $s".formatted(nombre, apellidos);


    }
}

