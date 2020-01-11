package TxtUppercase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderNew extends BufferedReader {

    char[] chars;
    char temp;

    public BufferedReaderNew(Reader in, int sz) {
        super(in, sz);
    }

    public BufferedReaderNew(Reader in) {
        super(in);
    }

    @Override
    public String readLine() throws IOException {

        chars = super.readLine().toCharArray();

        for (int i = 0; i < chars.length ; i++) {

            if (chars[i] >= 'a' && chars[i] <= 'z'){

             temp = (char) (chars[i]-('a'-'A'));
                chars[i]=temp;

            }

        }

        return new String(chars);
    }
}
