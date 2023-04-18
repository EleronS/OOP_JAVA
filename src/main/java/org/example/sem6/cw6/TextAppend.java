package org.example.sem6.cw6;

public class TextAppend {
    public Text appendText(Text correntText, Text newText){
        return new Text(correntText.getText() + newText.getText());
    }
}
