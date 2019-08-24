package dstructure;

/**
 * Copyright Ionate 2018-2019
 * Created by Sujatha
 */
public class StrProbs {

    /**
     * Lower case string without assigning new memory
     * @param str
     * @return
     */
    public String toLowerCase(String str) {
        if (str == null) {
            return null;
        }
        char[] charArr = str.toCharArray();

        for (int i = 0 ; i < charArr.length ; i++) {
            //Lower case of a char
            charArr[i] = Character.toLowerCase(charArr[i]);
            System.out.println(charArr[i]);
        }
        //Convert character array to string
        return String.valueOf(charArr);
    }


    /**
     * Leet Code problem #771
     * Get count of characters in S that exist in J
     * @param J -> jewel
     * @param S -> stone
     * @return
     */
        public int numJewelsInStones(String J, String S) {

            if ((J == null) ||( S == null) || (S.isEmpty()) || (J.isEmpty())) {
                return 0;
            }
            int numJewelsInStone = 0;

            for (int i = 0 ; i < S.length(); i++) {
                //Index Of returns the index of a char in a string . Returns -1 if it does not exist
                //str.charAt(8) will return char at 8th index in str
                if (J.indexOf(S.charAt(i)) >= 0) {
                    numJewelsInStone++;
                }
            }
            return numJewelsInStone;
        }

}
