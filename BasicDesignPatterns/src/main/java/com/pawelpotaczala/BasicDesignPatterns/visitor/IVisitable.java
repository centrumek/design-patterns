package com.pawelpotaczala.BasicDesignPatterns.visitor;

public interface IVisitable {
	void accept(IVisitor visitor);
}