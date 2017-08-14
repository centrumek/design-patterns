package com.pawelpotaczala.BasicDesignPatterns.visitor;

public interface IVisitor {
	void visit(DenseMatrix denseMatrix);
	void visit(SparseMatrix sparseMatrix);
}
