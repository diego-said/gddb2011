package br.com.doublelogic.parser;

/**
 * Created by diegoalvessaidsimao on 18/09/15.
 */
public class GooglonParser {

    private final String[] words;

    public GooglonParser(String input) {
        words = input.split("\\s");
    }

    public int countPrepositions() {
        int total = 0;
        for (String word : words) {
            if (isPreposition(word)) {
                System.out.println(word);
                total++;
            }
        }
        return total;
    }

    /**
     * Os linguistas descobriram que as preposições em Googlon são as palavras de 3 letras que
     * terminam numa letra tipo bar, mas onde não ocorre a letra d
     * @param word palavra para ser testada
     * @return <tt>true</tt> caso a palavra seja uma preposição
     */
    public boolean isPreposition(String word) {
        if(word != null) {
            return word.matches("[^d]{2}[^hckxbd]");

        }
        return false;
    }

}
