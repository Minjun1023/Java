package ch04;

import java.io.IOException;

public class ContinueExample {
    public static void main(String[] args) throws Exception {
        for (int i =1; i<=10; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}