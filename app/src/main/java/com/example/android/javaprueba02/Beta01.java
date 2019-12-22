package com.example.android.javaprueba02;

import java.util.ArrayList;
import java.util.List;

public class Beta01 {

  private  int ruedas;
  private  String marca;


    public Beta01(int ruedas, String marca) {
        this.ruedas = ruedas;
        this.marca = marca;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Beta01{" +
                "ruedas=" + ruedas +
                ", marca='" + marca + '\'' +
                '}';
    }
}
