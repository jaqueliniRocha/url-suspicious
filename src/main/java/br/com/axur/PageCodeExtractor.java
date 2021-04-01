package br.com.axur;

import org.jsoup.Jsoup;
import java.io.IOException;

public class PageCodeExtractor {

    public String getFrom(String url) throws IOException {
        return Jsoup.connect(url).get().html();
    }
}
