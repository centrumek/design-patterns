package com.pawelpotaczala.BasicDesignPatterns.visitor;

public class App {
	public static void main(String[] args) {
		IVisitable matrix1 = new SparseMatrix(8,8);
		IVisitable matrix2 = new DenseMatrix(8,8);
		matrix1.accept(new PrintVisitor());
		System.out.println("---------------");
		matrix2.accept(new PrintVisitor());
		}
}
