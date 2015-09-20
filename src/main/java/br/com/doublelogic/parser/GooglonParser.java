package br.com.doublelogic.parser;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.*;

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

    public int countVerbs() {
        int total = 0;
        for (String word : words) {
            if (isVerb(word)) {
                total++;
            }
        }
        return total;
    }

    /**
     * Um outro fato interessante descoberto pelos linguistas é que, no Googlon, os verbos sempre
     * são palavras de 8 ou mais letras que terminam numa letra tipo foo.
     * @param word palavra para ser testada
     * @return <tt>true</tt> caso a plavra seja um verbo
     */
    public boolean isVerb(String word) {
        if(word != null) {
            return word.matches("\\w{7,}[hckxb]");
        }
        return false;
    }

    public int countFirstPersonVerbs() {
        int total = 0;
        for (String word : words) {
            if (isVerbFirstPerson(word)) {
                total++;
            }
        }
        return total;
    }

    /**
     * Um outro fato interessante descoberto pelos linguistas é que, no Googlon, os verbos sempre
     * são palavras de 8 ou mais letras que terminam numa letra tipo foo. Além disso, se um verbo
     * começa com uma letra tipo foo, o verbo está em primeira pessoa.
     * @param word palavra para ser testada
     * @return <tt>true</tt> caso a plavra seja um verbo em primeira pessoa
     */
    public boolean isVerbFirstPerson(String word) {
        if(word != null) {
            return word.matches("[hckxb]\\w{6,}[hckxb]");
        }
        return false;
    }

    /**
     * Um professor universitário utilizará os textos A e B para ensinar o Googlon aos alunos. Para
     * ajudar os alunos a compreender o texto, esse professor precisa criar uma lista de
     * vocabulário para cada texto, isto é, uma lista ordenada (e sem repetições) das palavras que
     * aparecem em cada um dos textos.
     * Essas listas devem estar ordenadas e não podem conter repetições de palavras. No
     * Googlon, assim como no nosso alfabeto, as palavras são ordenadas lexicograficamente, mas
     * o problema é que no Googlon, a ordem das letras no alfabeto é diferente da nossa. O
     * alfabeto Googlon, em ordem, é: tqjbnkgxrcdlfpzmvhsw. Assim, ao fazer essas listas, o
     * professor deve respeitar a ordem alfabética Googlon.
     * @return palavras ordenadas seguindo a ordem lexicográfica e sem repetição
     * @throws ParseException
     */
    public List<String> getVocabulary() throws ParseException {
        HashMap<String, String> map = new HashMap<>(words.length);
        for (String word : words) {
            if(word.matches("\\w+"))
                map.put(word, word);
        }

        List<String> list = new ArrayList<>();
        list.addAll(map.values());

        final String lexicographicOrder = "<t<q<j<b<n<k<g<x<r<c<d<l<f<p<z<m<v<h<s<w";
        Collections.sort(list, new RuleBasedCollator(lexicographicOrder));

        return list;
    }

}
