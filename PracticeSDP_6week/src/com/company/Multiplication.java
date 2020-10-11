package com.company;

public class Multiplication extends Addition{

    public Multiplication(Expression expressionl, Expression expressionr){
        super(expressionl, expressionr);
    }

    @Override
    public int interpretator(Expression expression) {
        return expressionl.interpretator(expression) * expressionr.interpretator(expression);
    }
}
