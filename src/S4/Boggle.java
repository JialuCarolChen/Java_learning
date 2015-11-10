package S4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by carolchen on 24/08/2015.
 */
public class Boggle {
    static String[] dice = {"AJBBOO", "AFFPSK", "QNUMHI", "FESFES",
            "SEFGTH", "GRQOMN", "ASDFEW", "DFESEF",
            "ZNHRLN", "APSHCQ", "SEFGTH", "GRQOMN",
            "ASDFEW", "TDSTYI", "SFEFES", "TLRYET"};
    static final int SIDE = (int) Math.sqrt(dice.length);
    static final List<HashSet<Integer>> neighbours = new ArrayList<HashSet<Integer>>(dice.length);
    static Set<String> boggleWords = new HashSet<>();
    static {
        for(int i=0; i< dice.length; i++) {
           neighbours.add(i, new HashSet<Integer>());
            int [] distance = {-(SIDE +1), -SIDE, -(SIDE -1),
                               -1,                       1,
                                SIDE-1, SIDE, SIDE+1};
            for(int d: distance) {
                int n = i+d;
                int ncol = n % SIDE;
                int icol = i % SIDE;
                if(n >= 0 && n < dice.length && Math.abs(ncol - icol) <=1)
                neighbours.get(i).add(n);

            }

        }
    }
    static Set<String> words = new HashSet<String>();
    static Set<String> prefixes = new HashSet<String>();
    static boolean[] used = new boolean[dice.length];

    static boolean boggleble(String word, List<Character> usable) {
        if(word.length() < 3) return false;
        List<Character> letters = new ArrayList<Character>(usable);
        for (int i = 0; i< word.length(); i++) {
        if(letters.contains(word.charAt(i))) {
            letters.remove(letters.indexOf(word.charAt(i)));
        } else {
            return false;
        }
        }
     return true;
    }

    static void processDictionary(String filename, char[] boogle) {
        List<Character> usable = new ArrayList<>();
        for (char c: boogle) {
            usable.add(c);
        }

        int allWords = 0;
        try {
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNext()) {
                allWords++;
                String word = scanner.next().toUpperCase();
                if(boggleble(word, usable)) {
                    words.add(word);
                    for (int ssl = 0; ssl < word.length(); ssl++) {
                        prefixes.add(word.substring(0, ssl));
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Read in "+allWords+"words, "+words.size() + " of which were potential boggle words");
        System.out.println("and found " + prefixes.size()+" potential boggle prefixes");

    }




    static char[] shake() {
        char[] result = new char[dice.length];
        boolean[] used = new boolean[dice.length];
        Random r = new Random(500);

        for(int i = 0; i<dice.length; i++) {
            int die = r.nextInt(dice.length);
            while (used[die]) {
                die = (die + 1) % dice.length;
            }
            used[die] = true;

            int face = r.nextInt(6);
            result[i] = dice[die].charAt(face);

        }
        return result;
    }


    static char[] boggle;
    static void printBoogle(char[] boggle) {
        boggle = shake();
        for(int i = 0; i<dice.length;i++) {
            System.out.print(boggle[i]);
            if (i % 4 == 3) System.out.println();
        }

    }

    static void findwords(int start, String prefix) {
          used[start] = true;
        String candidate = prefix + boggle[start];
        if(words.contains(candidate)) {
            boggleWords.add(candidate);
        }
        if(prefixes.contains(candidate)) {
            for(int n: neighbours.get(start)) {
                if(!used[n]) {
                    findwords(n, candidate);
                }
            }
        }

        used[start] = false;
    }

    static void sovleBoggle() {
        for(int i = 0; i < used.length; i++) {
            findwords(i,"");
        }
        System.out.println("Found "+boggleWords.size()+" words:");
        for(String w : boggleWords) {
            System.out.println(w);
        }
    }



    public static void main(String[] args) {
        boggle = shake();
        printBoogle(boggle);
        processDictionary("resources/dictionary.txt", boggle);
    }
}
