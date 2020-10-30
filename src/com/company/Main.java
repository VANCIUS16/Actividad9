package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    private JButton Shuffle, Head, Pick, Hand;
    private JEditorPane Resp;
    private JLabel msn, bi, op;
    private Deck d;

    public static void main(String[] args) {
        Main frame = new Main();
        frame.setSize(350, 300);
        frame.createGUI();
        frame.setVisible(true);
        frame.createDeck();
    }

    private void createDeck(){
        d = new Deck();
    }
    private void createGUI()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout());

        bi = new JLabel("Bienvenido \n Seleccione una Opcion:");
        window.add(bi);
        Shuffle = new JButton("1. Mezclar deck");
        window.add(Shuffle);
        Shuffle.addActionListener(this);
        Head = new JButton("2. Sacar una carta");
        window.add(Head);
        Head.addActionListener(this);
        Pick = new JButton("3. Carta al azar");
        window.add(Pick);
        Pick.addActionListener(this);
        Hand = new JButton("4. Una mano de 5 cartas");
        window.add(Hand);
        Hand.addActionListener(this);
        msn = new JLabel("Resultado: ");
        window.add(msn);
        Resp = new JEditorPane();
        //Resp.setContentType("text/html"); :D
        Resp.setSize(new Dimension(250,100));
        //Resp.setBounds(new Rectangle(25, 15, 250, 100));
        window.add(Resp);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Resp.setText("");

        if(event.getSource() == Shuffle){
            Resp.setText(d.Suffle());
        }
        if(event.getSource() == Head){
            Resp.setText(d.Head());
        }
        if(event.getSource() == Pick){
            Resp.setText(d.Pick());
        }
        if(event.getSource() == Hand){
            Resp.setText(d.Hand());
        }
    }
}
