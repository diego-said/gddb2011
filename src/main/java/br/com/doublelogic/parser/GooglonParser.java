package br.com.doublelogic.parser;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.*;

/**
 * Created by diegoalvessaidsimao on 18/09/15.
 */
public class GooglonParser {

    private final String[] words;
    private final static String ALPHABET = "tqjbnkgxrcdlfpzmvhsw";

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

    /**
     * Mas como os Googlons escrevem números? Bem, no Googlon, as palavras também são
     * números dados em base 20, onde cada letra é um dígito, e os dígitos são ordenados
     * do menos significativo para o mais significativo (o inverso do nosso sistema). Ou seja, a
     * primeira posição é a unidade, a segunda posição vale 20, a terceira vale 400, e assim por
     * diante. Os valores das letras são dados pela ordem em que elas aparecem no alfabeto
     * Googlon (que é diferente da nossa ordem, como vimos acima). Ou seja, a primeira letra do
     * alfabeto Googlon representa o dígito 0, a segunda representa o dígito 1, e assim por diante.
     * @param word palavra para ser transformada em um número
     * @return valor numérico da palvra convertida em base 20
     */
    public BigInteger getNumberBase20(String word) {
        long value;
        char c;
        BigInteger result = new BigInteger("0");
        BigInteger base = new BigInteger("20");

        for (int i = 0; i < word.length(); i++) {

            c = word.charAt(i);
            value = ALPHABET.indexOf(c);
            result = result.add(base.pow(i).multiply(BigInteger.valueOf(value)));
        }

        return result;
    }

    /**
     * Os Googlons consideram um número bonito se ele satisfaz essas duas propriedades:
     * - é maior ou igual a 444741
     * - é divisível por 3
     * @return total de números bonitos
     */
    public int countPrettyNumbers() {
        HashMap<BigInteger, BigInteger> prettyNumbers = new HashMap<>(words.length);
        for (String word : words) {
            if(word.matches("\\w+")) {
                final BigInteger value = getNumberBase20(word);
                if (value.compareTo(BigInteger.valueOf(444741)) >= 0 &&
                        value.mod(BigInteger.valueOf(3)).compareTo(BigInteger.valueOf(0)) == 0) {
                    prettyNumbers.put(value, value);
                }
            }
        }
        return prettyNumbers.size();
    }

}
