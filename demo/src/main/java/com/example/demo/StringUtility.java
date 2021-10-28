package com.example.demo;

public class StringUtility {
    private String textToProcess;
    private int upperCaseLettersCounter;
    private int lowerCaseLettersCounter;
    private int digitCounter;
    private int whiteSpaceCounter;
    private int specialCharacterCounter;

    public StringUtility(String textToProcess) {
        this.textToProcess = textToProcess;
        this.upperCaseLettersCounter = 0;
        this.lowerCaseLettersCounter = 0;
        this.digitCounter = 0;
        this.whiteSpaceCounter = 0;
        this.specialCharacterCounter = 0;
    }

    public Response processTheString() {
        textToProcess.chars().forEach((character) -> {
            if (Character.isUpperCase(character)) {
                upperCaseLettersCounter++;
            } else if (Character.isLowerCase(character)) {
                lowerCaseLettersCounter++;
            } else if (Character.isDigit(character)) {
                digitCounter++;
            } else if (Character.isWhitespace(character)) {
                whiteSpaceCounter++;
            } else {
                specialCharacterCounter++;
            }
        });
        return new Response(textToProcess,upperCaseLettersCounter,lowerCaseLettersCounter,digitCounter,whiteSpaceCounter,specialCharacterCounter);
    }
}


