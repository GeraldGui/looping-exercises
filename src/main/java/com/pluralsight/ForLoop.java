package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {

        // Start for loop to print 10 to 1 then Launch with a delay by 1 second
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);

            if (i == 1) {
                System.out.println("Launch!");
            }
        }
    }
}
