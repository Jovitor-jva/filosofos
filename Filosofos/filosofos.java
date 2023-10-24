package Filosofos;

import java.util.concurrent.locks.ReentrantLock;

import Jantar.jantar;

public class filosofos extends jantar {
    int id;
    ReentrantLock esquerda;
    ReentrantLock direita;

    public filosofos(int id) {
        this.id = id + 1;
        esquerda = threadPersistente[id];
        direita = threadPersistente[(id + 1) % tamanhoMesa];
    }

    public void comer() throws Exception {
        String iniciar = "Filosofos " + id +
                " está pensando";
        String message = "Filosofo " + id +
                " está comendo seu prato de macarrão";
        System.out.println(iniciar);
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (id % 2 == 0) {
            esquerda.lock();
            direita.lock();
        } else {
            direita.lock();
            esquerda.lock();
        }
        System.out.println(message);
        try {
            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            esquerda.unlock();
            direita.unlock();
        }
    }

    public void run() {
        while (true) {
            try {
                comer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}