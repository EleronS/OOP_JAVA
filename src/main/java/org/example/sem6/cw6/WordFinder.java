package org.example.sem6.cw6;

public class WordFinder {
    public Word wordFinder(Text text, Word word){
        String[] arr = text.getText().split(" ");
        for(String el:arr){
            if(el.equals(word)) return word;
        }
        return null;
    }
}
