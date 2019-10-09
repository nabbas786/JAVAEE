package com.nad.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;

public class ForkJoinSumCalculator extends RecursiveTask<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9009211898824915247L;
	private long[] numbers;
	private int start;
	private int end;
	private static final long THRESHHOLD=10l;

	public ForkJoinSumCalculator(long[] numbers) {
			this(numbers, 0, numbers.length);
	}

	private ForkJoinSumCalculator(long[] numbers2, int start, int end) {
		this.numbers = numbers2;
		this.start = start;
		this.end = end;
	}

	@Override
	protected Long compute() {
		int length=end-start;
		if(length<=THRESHHOLD) {
			return computeSequencialy();
		}
		ForkJoinSumCalculator lefttask= new ForkJoinSumCalculator(numbers, start, length/2);
		lefttask.fork();
		ForkJoinSumCalculator rightTask=new ForkJoinSumCalculator(numbers,start+length/2,end);
		Long rightResult=rightTask.compute();
		Long leftResult=lefttask.join();
		return leftResult+rightResult;
	}
	private long computeSequencialy() {
		long sum=0;
		for (int i = start; i < end; i++) {
			sum+=numbers[i];
		}
		return sum;
	}
	public static long forkJoinSum(long n) {
		 long[] numbers =  LongStream.rangeClosed(1, n).toArray();
		 ForkJoinTask<Long> task = new ForkJoinSumCalculator(numbers);
		 return new ForkJoinPool().invoke(task);
		}
	public static void main(String[] args) {
		System.out.println(forkJoinSum(2000000));
	}
}
