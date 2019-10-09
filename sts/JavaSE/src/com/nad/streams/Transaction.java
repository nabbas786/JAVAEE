package com.nad.streams;

public class Transaction {
	Trader trader;
	int amount;
	int year;
	public Transaction(Trader trader, int year, int amount) {
		super();
		this.trader = trader;
		this.amount = amount;
		this.year = year;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", amount=" + amount + ", yea=" + year + "]";
	};
	
}
