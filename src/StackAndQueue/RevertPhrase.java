package StackAndQueue;

public class RevertPhrase {
    public RevertPhrase(String phrase) {
        char[] strArr = phrase.toCharArray();
        int top = strArr.length - 1;

        System.out.println(strArr);
        for (char i: strArr) {
            System.out.print(strArr[top]);
            top --;
        }
        System.out.println();
    }
}
