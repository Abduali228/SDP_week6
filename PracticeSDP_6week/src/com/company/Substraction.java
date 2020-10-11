package com.company;

public class Substraction extends Addition{

    public Substraction(Expression expressionl, Expression expressionr){
        super(expressionl, expressionr);
    }

    @Override
    public int interpretator(Expression expression) {
        return expressionl.interpretator(expression) - expressionr.interpretator(expression);
    }
}
