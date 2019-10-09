package com.nad.concurrent;

import java.io.IOException;
import java.io.UncheckedIOException;

public class WorkerExceptionHandler extends Thread{

	
	
	public static void main(String[] args) {
		Thread worker= new Thread(()-> {
			throw new RuntimeException("Thread exception");
		});
		worker.setName("Worker Thread");
		worker.setUncaughtExceptionHandler((t,e)->{
			System.out.println("Handling exception thrown by thread "+t.getName()+" Exception is "+e.getMessage());
		}
		);
		worker.start();
	}
}
