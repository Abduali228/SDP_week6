package com.company;

public class Division extends Addition{

    public Division(Expression expressionl, Expression expressionr){
        super(expressionl, expressionr);
    }

    @Override
    public int interpretator(Expression expression) {
        return expressionl.interpretator(expression) / expressionr.interpretator(expression);
    }
}
