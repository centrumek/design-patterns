package com.pawelpotaczala.BasicDesignPatterns.visitor;

public class PrintVisitor implements IVisitor{

	public void visit(DenseMatrix denseMatrix) {
		for (int i = 0; i < denseMatrix.getTheDenseMatrix().length; i++) {
			for (int j = 0; j < denseMatrix.getTheDenseMatrix()[i].length; j++) 
				System.out.print(denseMatrix.getTheDenseMatrix()[i][j]+" ");
			System.out.println();
		}		
	}

	public void visit(SparseMatrix sparseMatrix) {
		for (int i = 0; i < sparseMatrix.getTheSparseMatrix().length; i++) {
			System.out.print("c" + i + "| ");
			for (int j = 0; j < sparseMatrix.getTheSparseMatrix()[i].length; j++) 
				if(sparseMatrix.getTheSparseMatrix()[i][j] != 0) {
					System.out.print("r"+ j + ":" + sparseMatrix.getTheSparseMatrix()[i][j] + " ");
				}
			System.out.println("");
		}
	}

}
