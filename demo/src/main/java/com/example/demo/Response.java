package com.example.demo;

import java.io.Serializable;

public  class Response {
    private String textToProcess;
    private int upperCaseLettersCounter;
    private int lowerCaseLettersCounter;
    private int digitCounter;
    private int whiteSpaceCounter;
    private int specialCharacterCounter;

    public Response(String textToProcess, int upperCaseLettersCounter, int lowerCaseLettersCounter, int digitCounter, int whiteSpaceCounter, int specialCharacterCounter) {
        this.textToProcess = textToProcess;
        this.upperCaseLettersCounter = upperCaseLettersCounter;
        this.lowerCaseLettersCounter = lowerCaseLettersCounter;
        this.digitCounter = digitCounter;
        this.whiteSpaceCounter = whiteSpaceCounter;
        this.specialCharacterCounter = specialCharacterCounter;
    }

    @Override
    public String toString() {
        return "Response{" +
                "textToProcess='" + textToProcess + '\'' +
                ", upperCaseLettersCounter=" + upperCaseLettersCounter +
                ", lowerCaseLettersCounter=" + lowerCaseLettersCounter +
                ", digitCounter=" + digitCounter +
                ", whiteSpaceCounter=" + whiteSpaceCounter +
                ", specialCharacterCounter=" + specialCharacterCounter +
                '}';
    }
}