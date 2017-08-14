package com.pawelpotaczala.BasicDesignPatterns.visitor;

public abstract class Matrix {
	
	private final int rows;
	private final int columns;
	
	public Matrix (final int rows, final int columns) {
		this.rows = rows;
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}
}