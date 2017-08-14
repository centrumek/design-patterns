package com.pawelpotaczala.BasicDesignPatterns.visitor;

public class SparseMatrix extends Matrix implements IVisitable{
	
	private final int [][] theSparseMatrix;
	private static final int SPARSENESS = 5;
	private static final int SCALE = 10;
	
	protected SparseMatrix(final int rows, final int columns) {
		super(rows, columns);
		this.theSparseMatrix = new int [rows][columns];
		int full = (rows*columns) / SPARSENESS;
		for (int i = 0; i < full; i++) {
			int row = (int) (Math.random()*(columns-1));
			int column = (int) (Math.random()*(columns-1));
			if (getTheSparseMatrix()[row][column] == 0) {
				getTheSparseMatrix()[row][column] = (int) (Math.random() * SCALE);
			}
		}
	}

	public int[][] getTheSparseMatrix() {
		return theSparseMatrix;
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);	
	}
}
