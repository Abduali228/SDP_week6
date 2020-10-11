package com.company;

public class Addition implements Expression{
    Expression expressionl;
    Expression expressionr;

    public Addition(Expression expressionl, Expression expressionr){
        this.expressionl = expressionl;
        this.expressionr = expressionr;
    }

    @Override
    public int interpretator(Expression expression) {
        return expressionl.interpretator(expression) + expressionr.interpretator(expression);
    }
}
