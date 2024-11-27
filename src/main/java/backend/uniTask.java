package backend;

import java.util.*;

public class uniTask {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Mətni daxil edin:");
                String text = scanner.nextLine();

                method(text);
    }

    public static void method(String text){
        int initialCapacity = 10;
        String[] sentences = new String[initialCapacity];
        int sentenceCount = 0;
        StringBuilder currentSentence = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            if(currentChar == '.' || currentChar == '!' || currentChar == '?') {
                if (i + 1 < text.length() && text.charAt(i + 1) == currentChar) {
                    continue;
                }
                currentSentence.append(currentChar);

                if (sentenceCount == sentences.length) {
                    sentences = Arrays.copyOf(sentences, sentences.length * 2);
                }
                sentences[sentenceCount++] = currentSentence.toString().trim();
                currentSentence.setLength(0);
            } else {
                currentSentence.append(currentChar);
            }
        }

        System.out.println("Cümlə sayı: " + sentences.length);
        System.out.println("\nCümlələr:");
        for (int i = 0; i < sentenceCount; i++) {
            System.out.println(sentences[i]);
        }
    }
}