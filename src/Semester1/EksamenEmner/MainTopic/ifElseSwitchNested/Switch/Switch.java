package Semester1.EksamenEmner.MainTopic.ifElseSwitchNested.Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Giv me rate from 1 to 10, rate about how good I am forward you.");
        int result = input.nextInt();

        switch (result) {
            case 1:
                System.out.println("Oh no, why??!");
                break;
            case 2:
                System.out.println("I did something wrong? Did I?");
                break;
            case 3:
                System.out.println("I did my best...! *CRIES*");
                break;
            case 4:
                System.out.println("I did pretty bad, huh? Sorry about that.");
                break;
            case 5:
                System.out.println("I did ok, did I? What can I do better at?");
                break;
            case 6:
                System.out.println("Yay, I did my best and I even get a okay score I believed I could do it!");
                break;
            case 7:
                System.out.println("Woah, I did good, huh?");
                break;
            case 8:
                System.out.println("I am the best! I could do it I thought!");
                break;
            case 9:
                System.out.println("Awesome, I am so close! But I am happy about it!");
                break;
            case 10:
                System.out.println("I did it...? Really? I.... *Faints*");
                break;
        }

    }

}
