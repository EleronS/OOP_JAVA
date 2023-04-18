package org.example.sem6.cw6;

public class WordDeleter {
    public Text deleteWordInText(Text text, Word wordToDelete){
        String imputText = text.getText();
        if(text.getText().contains(wordToDelete.getWord())){
            imputText = imputText.replace(wordToDelete.getWord(), "");
        }
        return new Text(imputText);

    }
}
