package com.company;

public class Main {

    public static void main(String[] args) {
        String expression = "1+2+3-4";
        Expression parser = new Parser(expression);
        System.out.println(parser.interpretator(parser));
    }

    /* I need help with this pattern. I don't understand it. Could we make something like office hours? or explain this pattern.
    * I've read about 15 web-sites about this pattern, but it didn't help me.
    * Вроде как правильно сделал все, но не могу никак закончить. Не понимаю обязанностей Парсера.*/
}
