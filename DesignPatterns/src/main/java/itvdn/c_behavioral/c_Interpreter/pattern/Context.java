package itvdn.c_behavioral.c_Interpreter.pattern;

/**
 * Created by Sergey on 11/29/2015.
 */
public class Context {

    // Контекст распознающей грамматики языка:
    // V = {a}; L = V*;
    // Правильные цепочки: a, aa, aaa, ...
    // Неправильные цепочки: b, ab, aba, ...

    public String source;
    public char vocabulary;
    public boolean result;
    public int position;

    public Context(char vocabulary, String source) {
        this.vocabulary = vocabulary;
        this.source = source;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public char getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(char vocabulary) {
        this.vocabulary = vocabulary;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
