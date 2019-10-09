package com.nad.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamTradetest {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		List<Trader> tradors = transactions.stream().filter(t -> t.getYear() == 2011)
				.sorted(Comparator.comparing(Transaction::getAmount)).map(Transaction::getTrader)
				.collect(Collectors.toList());
		tradors.forEach(System.out::println);
		List<String> cities = transactions.stream().map(Transaction::getTrader).map(Trader::getCity).distinct()
				.collect(Collectors.toList());
		List<String> cities1 = transactions.stream().map(t -> t.getTrader().getCity()).distinct()
				.collect(Collectors.toList());
		System.out.println(cities1);

		// find all traders from cambridge and sort by name
		List<Trader> tradersCambride = transactions.stream()
				.filter(t -> t.getTrader().getCity().equalsIgnoreCase("Cambridge")).map(t -> t.getTrader())
				.sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
		System.out.println(tradersCambride);

		// Returns a string of all traders’ names sorted alphabetically
		String tradersSortedByName = transactions.stream().map(t -> t.getTrader().getName()).distinct().sorted().reduce("",(name1,name2)->name1+" "+name2);
				
		System.out.println(tradersSortedByName);
		//Are any trader based in Milan
		Transaction tr=transactions.stream().filter(t->t.getTrader().getCity().equalsIgnoreCase("Milan")).findAny().get();
		if(transactions.stream().filter(t->t.getTrader().getCity().equalsIgnoreCase("Milan")).findAny() != null) {
			System.out.println("Found trader in milan");
		}
		//or
		if(transactions.stream().anyMatch(t->t.getTrader().getCity().equalsIgnoreCase("Milan"))){
			System.out.println("Found trader in milan");
		}
		//Prints all transactions’ values from the traders living in Cambridge
		
		List<Integer> transactionValue=transactions.stream().filter(t->t.getTrader().getCity().equals("Cambridge")).map(Transaction:: getAmount).collect(Collectors.toList());
		System.out.println(transactionValue);
		
		//What’s the highest value of all the transactions?
			Transaction	maxTrans=transactions.stream().max(Comparator.comparing(Transaction::getAmount)).get();
			System.out.println(maxTrans);
	
		//or
			Optional<Integer>	maxTrans1=transactions.stream().map(Transaction:: getAmount).reduce(Integer:: max);
			System.out.println(maxTrans1.get());
		// Finds the transaction with the smallest value
			Optional<Integer>	minTrans=transactions.stream().map(Transaction:: getAmount).reduce(Integer:: min);
			System.out.println(minTrans.get());
			//or
			System.out.println(transactions.stream().min(Comparator.comparing(Transaction::getAmount)).get());
			System.out.println(transactions.stream().reduce((t1,t2)-> t1.getAmount() < t2.getAmount()?t1:t2).get());
	
		// Group by transactions based on corrency
			//using loop
		/*
		 * for (Transaction transaction : transactions) { transaction. }
		 */
	}
	
		
}
