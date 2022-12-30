package com.exercise;

public class PrecioIva {

    public static void main(String[] args) {
        int precio= 300;
        double precioTotal = sumaIva(precio);
        System.out.println("El precio total es: " + precioTotal);
    }
    static double sumaIva(int precio){
        return precio + (precio * 0.16);
            }
    }



