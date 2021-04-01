package br.com.axur;

import org.apache.commons.lang3.StringUtils;

public class CheckSuspiciousCode {

    private static String[] words = new String[]{"black friday", "promoção", "senha"};

    public boolean checkPage(String code){
        boolean hasWord = false;

        for(String word : words){
            hasWord = hasWord(code, word);
            if(hasWord) {
                break;
            }
        }

        if (hasWord) {
            System.out.println("Suspicious");
        } else {
            System.out.println("Safe");
        }

        return hasWord;
    }

    private boolean hasWord(String code, String word){
        boolean hasWord = StringUtils.containsIgnoreCase(code, word);
        System.out.println("Tem a a palavra " + word + ": " + hasWord);
        return hasWord;
    }

}
