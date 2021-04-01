package br.com.axur;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {
        PageCodeExtractor pageCodeExtractor = new PageCodeExtractor();
        CheckSuspiciousCode checkPageSuspiciousCode = new CheckSuspiciousCode();

        String urlPage = args[0];
        String code = pageCodeExtractor.getFrom(urlPage);
        boolean isSuspicious = checkPageSuspiciousCode.checkPage(code);

    }
}
