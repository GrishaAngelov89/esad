package esad.chapter2.task4;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.Vector;

/**
 * @author: grisha_angelov
 */
public class TokenStream {
    Vector parsedTokens;
    int currentTokenIndex;
    BufferedReader reader;
    int previousChar;

    TokenStream(Reader reader) {
        this.reader = new BufferedReader(reader);
        takeChar();
        parsedTokens = parseTokens();
        currentTokenIndex = 0;
    }

    private void takeChar() {
    }

    Vector parseTokens() {
        Vector parsedTokens = null;
        return parsedTokens;
    }
}
