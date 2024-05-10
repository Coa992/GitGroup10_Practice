package Zulfiya.week06;

public class task02 {
    public static void main(String[] args) {


                System.out.println(getword("aaaabbcccdda"));
    }
            public static String getword(String word) {
                int count = 1;
                String ret = "";
                for (int i = 0; i < word.length() - 1; i++) {
                    if (word.charAt(i) == word.charAt(i + 1)) {
                        count++;
                        continue;
                    } else {
                        ret = ret + word.charAt(i) + count;
                    }
                    count = 1;
                }
                ret = ret + word.charAt(word.length() - 1);
                return ret;
            }

    /*
    Array - N unique integers that sum up to 0
Write a function that given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function can return any such array.
For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).

Array - Move Zeros to the End
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0, 0]
     */



    }

