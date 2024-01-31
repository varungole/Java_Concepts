class SharedResource
{
private int data;
private boolean produced = false;

//producer method

public synchronized void produce(int newData)
{
    while(produced)
    {
        try{
            wait();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    data = newData;
    System.out.println("Produced" + data);
    produced = true;
    notify();
}

public synchronized int consume()
{
     while(!produced)
     {
        try {
            wait();
        }
        catch( InterruptedException e)
        {
            e.printStackTrace();
        }
     }

     System.out.println("Consumed" + data);
     produced = false;
     notify();
     return data;
}
}

class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.produce(i);
            try {
                Thread.sleep(1); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            sharedResource.consume();
            try {
                Thread.sleep(1500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadExample
{
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Creating producer and consumer threads
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        // Starting the threads
        producerThread.start();
        consumerThread.start();
    }
}