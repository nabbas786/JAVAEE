package com.nad.concurrent.producerConsumer;

public class ProducerConsumerTest {

	public static void main(String[] args) throws InterruptedException {
		SharedResource resource=new SharedResource();
		Thread producer=new Thread(()-> {
			resource.put();
		});
		Thread consumer=new Thread(() -> {
			resource.get();
		});
		producer.setName("Producer Thread");
		consumer.setName("Consumer Thread");
		
		producer.start();
		consumer.start();
	}
}
