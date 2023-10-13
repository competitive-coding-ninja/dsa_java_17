package com.quantum_adrenaline_1.dsa_java_17.problems.string.I_textwrap;

import java.util.List;
import java.util.ArrayList;

public final class TextWrap {
    private static String textWrap(String userInput, int wrapLength) {
        // text to list
        List<String> userInputArray = new ArrayList<>();
        for (String line : userInput.split("\n")) {
            userInputArray.addAll(List.of(line.trim().split(" ")));
        }

        // storing the current line within wrap-length limit
        StringBuilder currentLine = new StringBuilder();

        // storing each line as array element
        List<String> wrappedText = new ArrayList<>();

        // wrapping the text
        for (String word : userInputArray) {
            if (currentLine.length() + word.length() + 1 <= wrapLength) {
                currentLine.append(" ").append(word);
            } else {
                wrappedText.add(currentLine.toString());
                currentLine = new StringBuilder(word);
            }
        }

        // add the last unsuccessful line
        wrappedText.add(currentLine.toString());

        // string result of the wrapped text list
        return String.join("\n", wrappedText);
    }

    public static void main(String[] args) {
        String singleLineText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

        String multiLineString = """
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.
                It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged.
                It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                """;

        String wrappedTextResult = textWrap(singleLineText, 20);

        System.out.println(wrappedTextResult);
    }
}
