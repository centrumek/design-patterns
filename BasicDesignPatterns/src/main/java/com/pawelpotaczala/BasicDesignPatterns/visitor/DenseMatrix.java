package com.pawelpotaczala.BasicDesignPatterns.visitor;

public class DenseMatrix extends Matrix implements IVisitable{
	
	private final int [][] theDenseMatrix;
	private static final int SCALE = 10;
	
	public DenseMatrix(final int rows, final int columns) {
		super(rows, columns);
		this.theDenseMatrix = new int [rows][columns];
		 for (int i = 0; i < getTheDenseMatrix().length; i++) {
		      for (int j = 0; j < getTheDenseMatrix()[i].length; j++)
		    	  getTheDenseMatrix()[i][j] = (int) (Math.random() * SCALE);
		 }
	}  
	
	public int[][] getTheDenseMatrix() {
		return theDenseMatrix;
	}

	public void accept(IVisitor visitor) {
		visitor.visit(this);	
	}
		
}
