package synchronizers.semaphore;

import java.util.concurrent.Semaphore;



public class SemaphoreTest {
    /**
     *
     * @param args Основные методы класса Semaphore:
     *         Semaphore.acquire() - запрос на выполнение
     *         Semaphore.release() - освобождение ресураса
     */
    public static void main(String[] args) {

        Semaphore sem = new Semaphore(2);
        for (int i = 1; i < 6; i++)
            new Philosopher(sem, i);
    }
}

class Philosopher extends Thread {
    //Класс Философ хранит объект семафора который передается в конструктор
    Semaphore sem; // семафор. ограничивающий число философов
    // кол-во приемов пищи
    int num = 0;
    // условный номер философа
    int id;

    // в качестве параметров конструктора передаем идентификатор философа и семафор
    Philosopher(Semaphore sem, int id) {
        this.sem = sem;
        this.id = id;
        this.start();
    }

    public void run() {
        try {
            while (num < 3)// пока количество приемов пищи не достигнет 3
            {
                //Запрашиваем у семафора разрешение на выполнение
                sem.acquire();
                System.out.println("Философ " + id + " садится за стол");
                // философ ест
                sleep(500);
                num++;

                System.out.println("Философ " + id + " выходит из-за стола");
                sem.release();

                // философ гуляет
                sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("у философа " + id + " проблемы со здоровьем");
        }
    }
}