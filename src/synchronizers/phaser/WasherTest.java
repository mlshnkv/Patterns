package synchronizers.phaser;

import java.util.concurrent.Phaser;

public class WasherTest {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(2);
        new Washer(phaser);
        new Washer(phaser);

    }
    static class Washer extends Thread{
        Phaser phaser;

        public Washer(Phaser phaser) {
            this.phaser = phaser;
            start();
        }

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println(getName() + " start washing car number " + i);


                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                phaser.arriveAndAwaitAdvance();

                System.out.println(getName() + " finished washing car number " + i);
                phaser.arriveAndAwaitAdvance();
                System.out.println("Car number " + "Поехала домой");
            }
        }
    }
}
