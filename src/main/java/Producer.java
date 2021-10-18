public class Producer {
    private Shop shop;

    public synchronized void produceCar(int time) {
        try {
            Thread.sleep(time);
            shop.getCars().add(new Car());
            System.out.println("Производитель " + Thread.currentThread().getName() + " выпустил 1 авто");
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized Car sellCar(int time) {
        try {
            System.out.println(Thread.currentThread().getName() + " пришел в магазин");
            while (shop.getCars().size() == 0) {
                System.out.println("Машин нет");
                wait();
            }
            Thread.sleep(time);
            System.out.println(Thread.currentThread().getName() + " уехал на новеньком авто");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return shop.getCars().remove(0);
    }

    public Producer(Shop shop) {
        this.shop = shop;
    }
}
