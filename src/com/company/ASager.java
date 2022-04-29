package com.company;

// Klasse die von Thread ableiten
public class ASager extends Thread{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 30; i++) {
                System.out.print("a ");
                Thread.sleep(200);
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
}
