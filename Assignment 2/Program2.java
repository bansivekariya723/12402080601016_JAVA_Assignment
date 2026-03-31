class Buffer {
    int data;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) wait();
        data = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized void consume() throws InterruptedException {
        while (!available) wait();
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

 class Main2 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++)
                    buffer.produce(i);
            } catch (Exception e) {}
        });

        Thread consumer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++)
                    buffer.consume();
            } catch (Exception e) {}
        });

        producer.start();
        consumer.start();
    }
}