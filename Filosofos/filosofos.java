package Filosofos;

import java.util.concurrent.locks.ReentrantLock;

import Jantar.jantar;

public class filosofos extends jantar {
    int id;
    ReentrantLock esquerda;
    ReentrantLock direita;

    public filosofos(int id) {
        this.id = id + 1;
        esquerda = thread[id];
        direita = thread[(id + 1) % tamanhoMesa];
    }

    public void comer() throws Exception {
        System.out.println("Filosofos " + id + " está pensando");
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
        System.out.println("Filosofo " + id + " está comendo seu prato de macarrão");
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