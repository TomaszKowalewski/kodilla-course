package com.kodilla.stream.beautifier;

public class PoemBeautifier {

    public void beautify(String firstText, String secondText, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(firstText, secondText);
        System.out.println("To use beautify result is: " + result);
    }
}
