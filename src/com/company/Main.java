package com.company;

public class Main {

    public static void main(String[] args) {
        /*ASager x = new ASager();
        BSager y = new BSager();

        Thread bsThread = new Thread(y); // kann dann run-Methode von B ausführen
        Thread csThread = new Thread(() -> {    // Lamdba Ausdruck, weil funktionales Interface
            for (int i = 0; i < 30; i++){
                System.out.print("c ");
            }
        });

        //x.run(); -> gibt erst die As an, dann das Main
        // startet die definierte run-Methode als neuen Thread (also nebenläufig)
        x.start();  // erst Main dann ASager
        bsThread.start();   //
        csThread.start();

        System.out.println("Ende von Main");
        // wenn man beide Threads parallel laufen lässt, dann werden die A und B einfach draufgeschrieben, keine Reihenfolge*/
        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++){

        }
    }
}
