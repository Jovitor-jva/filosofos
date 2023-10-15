package Jantar;

import java.util.concurrent.locks.ReentrantLock;

import Filosofos.filosofos;

public class jantar extends Thread {

    protected static int tamanhoMesa = 5;
    static filosofos[] filosofo = new filosofos[tamanhoMesa];
    protected static ReentrantLock[] thread = new ReentrantLock[tamanhoMesa];

    public static void main(String[] args) {
        for (int i = 0; i < tamanhoMesa; i++) {
            thread[i] = new ReentrantLock();
        }

        for (int i = 0; i <= tamanhoMesa; i++) {
            filosofo[i] = new filosofos(i);
            filosofo[i].start();
        }
    }

}