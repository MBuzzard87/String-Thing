package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {

        String[] inArr = input.split(" ");
        Integer expected = 0;

        for (String inLast : inArr) {
            char lastChar = input.charAt(input.length() - 1);
            if (lastChar == 'y' || lastChar == 'z') {
                expected += 1;
            } else {
                expected += 0;
            }
        }

        return expected;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {


        String expected = base.replaceAll(remove, "");

        return expected;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {


        boolean expected;
        Integer is = 0;
        Integer not = 0;
        char[] isNot = input.replaceAll(" ", "").toCharArray();

        for (int i = 0; i < isNot.length - 1; i++) {
                if (isNot[i] == 'i' && isNot[i + 1] == 's') {
                    is += 1;
                } else if (isNot[i] == 'n' && isNot[i + 1] == 'o' && isNot[i + 2] == 't') {
                    not += 1;
                } else {
                    is += 0;
                }
        }

        if (is == not) {
            expected = true;
        } else  {
            expected = false;
        }

        return expected;

    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

        Boolean expected = true;
        Integer happy = 0;

        for (int i = 0; i < input.length(); i++) {

            if (i == input.indexOf("gg")) {
                happy += 1;
            } else if (i == input.indexOf("g")) {
                happy -= 1;
            }
        }

        if (happy > 0) {
            expected = true;
        } else {
            expected = false;
        }

        return expected;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {

        Integer count3 = 0;
        char[] tripleChar = input.toCharArray();



        for (int i = 0; i < tripleChar.length - 2; i++) {
            if (tripleChar[i] == tripleChar[i + 1] && tripleChar[i] == tripleChar[i + 2]) {
                count3 += 1;
            } else {
            }
        }

        return count3;
    }

}

