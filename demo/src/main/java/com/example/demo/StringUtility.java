package com.example.demo;

public class StringUtility {
    private String textToProcess;
    private int uppercaseLetter;
    private int lowerCaseCounter;
    private int digitCounter;
    private int whiteSpaceCounter;
    private int specialCharacterCounter;

    public StringUtility(String textToProcess) {
        this.textToProcess = textToProcess;
        this.uppercaseLetter = 0;
        this.lowerCaseCounter = 0;
        this.digitCounter = 0;
        this.whiteSpaceCounter = 0;
        this.specialCharacterCounter = 0;
    }

    public Response processTheString() {
        textToProcess.chars().forEach((character) -> {
            if (Character.isUpperCase(character)) {
                uppercaseLetter++;
            } else if (Character.isLowerCase(character)) {
                lowerCaseCounter++;
            } else if (Character.isDigit(character)) {
                digitCounter++;
            } else if (Character.isWhitespace(character)) {
                whiteSpaceCounter++;
            } else {
                specialCharacterCounter++;
            }
        });
        return new Response(textToProcess,uppercaseLetter, lowerCaseCounter,digitCounter,whiteSpaceCounter,specialCharacterCounter);
    }
}


