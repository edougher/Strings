package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int score = 0;


        System.out.println("What is the capital of Illinois?");
        String cap = in.next();
        if (cap.equalsIgnoreCase("Springfield")) {
            System.out.println("That is correct");
            score++;
            } else {
                System.out.println("That is incorrect");
            }

            System.out.println("What is the largest city in Illinois?");
            String city = in.next();
            if (city.equalsIgnoreCase("Chicago")) {
                System.out.println("That is correct");
                score++;
                } else {
                    System.out.println("That is incorrect");
                }

                System.out.println("Which of the Great Lakes does Illinois touch?");
                String lake = in.next();
                if (lake.equalsIgnoreCase("Michigan")) {
                    System.out.println("That is correct");
                    score++;
                } else {
                        System.out.println("That is incorrect");
                    }

                    System.out.println("Which time zone is Illinois in?");
                    String zone = in.next();
                    if (zone.equalsIgnoreCase("Central")) {
                        System.out.println("That is correct");
                        score++;
                        } else {
                            System.out.println("That is incorrect");
                        }

                        System.out.println("Who is the current Governor of Illinois?");
                        String gov = in.next();
                        if (gov.equalsIgnoreCase("Bruce Rauner")) {
                            System.out.println("That is correct");
                            score++;
                            } else {
                                System.out.println("That is incorrect");
                            }

                            System.out.println("You got " + score + " answers right.");

    }
}