package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck{
    List<Card> list1= new ArrayList();

    public Deck (){
        //Agrego los tréboles
        fillDeck("Negro","Tréboles");
        //Agrego las Picas
        fillDeck("Negro","Picas");
        //Agrego las Corazónes
        fillDeck("Rojo","Corazónes");
        //Agrego las Diamante
        fillDeck("Rojo","Diamante");
    }
    public void fillDeck(String color,String palo){
        String valor;
        for (int i = 0; i<13;i++){
            switch (i){
                case 0:
                    valor = "A";
                    break;
                case 10:
                    valor = "J";
                    break;
                case 11:
                    valor = "Q";
                    break;
                case 12:
                    valor = "K";
                    break;
                default:
                    valor = (i+1)+"" ;
            }
            Card c = new Card(color,valor,palo);
            list1.add(c);
        }
    }

    public String Suffle(){
        if(list1.isEmpty()){
            try {
                JOptionPane.showMessageDialog(null, "El deck esta vaciío");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else{
            System.out.println("\nShuffle");
            Collections.shuffle(list1);
            System.out.println("El deck a sido mezclado");
            return "El deck a sido mezclado";
        }
        return "El deck a sido mezclado";
    }

    public String Head(){
        Card c = null;
        if(list1.isEmpty()){
            try {
                JOptionPane.showMessageDialog(null, "El deck esta vaciío");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else {
            System.out.println("\nHead");
            c = list1.get(1);
            System.out.println(c);
            list1.remove(1);
            System.out.println(String.format("Quedan %s cartas en el Deck", list1.toArray().length));
            return String.format("%s \n Quedan %s cartas en el Deck", c, list1.toArray().length);
        }
        return String.format("%s \n Quedan %s cartas en el Deck", c, list1.toArray().length);
    }

    public String Pick(){
        Card c = null;
        if(list1.isEmpty()){
            try {
                JOptionPane.showMessageDialog(null, "El deck esta vaciío");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else {
            System.out.println("\nPick");
            int aleatorio = (int) Math.floor(Math.random() * (0 - 53 + 1) + 53);
            System.out.println(aleatorio);
            if (list1.toArray().length < aleatorio) {
                aleatorio = list1.toArray().length;
            }
            c = list1.get(aleatorio);
            System.out.println(c);
            list1.remove(aleatorio);
            System.out.println("Quedan" + list1.toArray().length + " cartas en el Deck");
            String.format("Quedan %s cartas en el Deck", list1.toArray().length);
            return String.format("%s \n Quedan %s cartas en el Deck", c, list1.toArray().length);
        }
        return String.format("%s \n Quedan %s cartas en el Deck", c, list1.toArray().length);
    }

    public String Hand(){
        String msg = "";
        if(list1.isEmpty()){
            try {
                JOptionPane.showMessageDialog(null, "El deck esta vaciío");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }else {
            System.out.println("\nHand");

            for (int x = 0; x < 5; x++) {
                Card c = list1.get(x);
                msg += c.toString() + "\n";
                System.out.println();
                list1.remove(x);
            }
            System.out.println(String.format("%s Quedan %s", msg, list1.toArray().length));
            return String.format("%s Quedan %s cartas en el Deck", msg, list1.toArray().length);
        }
        return String.format("%s Quedan %s cartas en el Deck", msg, list1.toArray().length);
    }
}
