package org.example.sem6.cw6;

public class WordReplacer {
    public Text replaceWordInText(Text text, Word wordToReplace, Word newWord){
        String imputText = text.getText();
        if(text.getText().contains(wordToReplace.getWord())){
            imputText = imputText.replace(wordToReplace.getWord(), newWord.getWord());
        }
        return new Text(imputText);

    }
}
