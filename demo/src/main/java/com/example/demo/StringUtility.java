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

    public void processTheString() {
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
        System.out.printf("litery male: %d duze: %d cyfry: %d biale: %d specjalne: %d",
                lowerCaseLettersCounter,upperCaseLettersCounter,digitCounter,whiteSpaceCounter,specialCharacterCounter);
    }


}
