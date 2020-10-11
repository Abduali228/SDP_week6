package com.company;



public class Parser implements Expression{
    Expression parser;

    public Parser(String expression){

    }
    @Override
    public int interpretator(Expression expression) {
        return parser.interpretator(expression);
    }
}
