package practice_1_8.practice_2;

import java.util.Scanner;
import java.util.Random;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String[] suits = {"Пик", "Бубен", "Черв", "Треф"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"};

        int card_amount = suits.length * ranks.length;
        int player_cards_amount = 5;

        System.out.print("Enter the number of players: ");
        int players = input.nextInt();

        if (players * player_cards_amount > card_amount) {
            System.out.println("Too many players.");
            System.exit(0);
        }

        if (players <= 0) {
            System.out.println("Sorry, you can't play alone.");
            System.exit(0);
        }

        String[] deck = new String[card_amount];
        for (int i = 0; i < suits.length; ++i){
            for (int j = 0; j < ranks.length; ++j){
                deck[i * ranks.length + j] = ranks[j] + " " + suits[i];
            }
        }

        String temp;
        int index;
        for (int i = 0; i < deck.length; ++i){
            index = random.nextInt(0, card_amount);
            temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        String[][] players_cards = new String[players][player_cards_amount];
        for (int i = 0; i < players; ++i){
            for (int j = 0; j < player_cards_amount; ++j){
                players_cards[i][j] = deck[player_cards_amount * i + j];
            }
        }

        for (int i = 0; i < players; ++i){
            print_deck(players_cards[i]);
        }
    }

    public static void print_deck(String[] deck){
        for (String card : deck) {
            System.out.print(card + "\t");
        }
        System.out.print("\n\n");
    }
}