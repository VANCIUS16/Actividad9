package com.company;

import javax.swing.*;

public class Card {

    public String Color;
    public String Valor;
    public String Palo;

    public Card(String Color, String Valor, String Palo){
        this.Color = Color;
        this.Valor = Valor;
        this.Palo = Palo;
    }

    @Override
    public String toString(){
        return String.format("{%s},{%s},{%s}",Color,Valor,Palo);
    }
}