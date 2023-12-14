
package com.mycompany.trasporte;

public class Trasporte {

    public static void main(String[] args) {
        Moto motouno= new Moto("mototaxi", 3, "tornado");
        Auto autouno= new Auto("carro", 5, "Chevrolet");
        
        motouno.conducir();
        System.out.println(motouno.marca);
       
        autouno.conducir();
        System.out.println(autouno.marca);
       
    }
}
