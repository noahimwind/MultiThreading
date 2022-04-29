package com.company;

// hat ein Runnable-Objekt mitgegeben bekommen
public class BSager implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 30; i++){
            System.out.print("b ");
        }
    }
}
