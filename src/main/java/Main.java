public class Main {
    public static void main(String[] args) {
        final int timeToSellCar = 1000;
        final int timeToProduceCar = 3000;
        final Shop shop = new Shop();

        new Thread(null, () -> shop.sellCar(timeToSellCar), "Покупатель 1").start();
        new Thread(null, () -> shop.sellCar(timeToSellCar), "Покупатель 2").start();
        new Thread(null, () -> shop.sellCar(timeToSellCar), "Покупатель 3").start();

        new Thread(null, () -> shop.produceCar(timeToProduceCar), "Toyota").start();
        new Thread(null, () -> shop.produceCar(timeToProduceCar), "Mercedes").start();
        new Thread(null, () -> shop.produceCar(timeToProduceCar), "BNW").start();

    }
}
