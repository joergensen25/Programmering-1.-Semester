package main.java.semester2.lektion16.opgave2;

public class Palindrom {

    public boolean palindrom(String tekst) {
        return true;
    }

    private boolean palindrom(String tekst, int start, int end) {
        char[] tekstArr = tekst.toCharArray();
        boolean retVal = false;

        if (tekstArr[start] == tekstArr[end]) {
            retVal = palindrom(tekst, start + 1, end - 1);
        }

        return retVal;
    }


}
