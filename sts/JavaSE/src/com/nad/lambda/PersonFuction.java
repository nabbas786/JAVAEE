package com.nad.lambda;
@FunctionalInterface
public interface PersonFuction<A,B,C,D> {

	public D getPerson(A a,B b,C c);
}
