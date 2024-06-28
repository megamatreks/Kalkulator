package kalkulator;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Informacja o przeznaczeniu programu
        System.out.println("Prosty kalkulator - pozwala na dodawanie, odejmowanie, mnożenie i dzielenie dwóch liczb rzeczywistych.");
        
        // Wczytywanie pierwszej liczby
        System.out.print("Podaj pierwszą liczbę: ");
        double firstNumber = scanner.nextDouble();
        
        // Wczytywanie symbolu operacji arytmetycznej
        System.out.print("Podaj operację arytmetyczną (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        
        // Wczytywanie drugiej liczby
        System.out.print("Podaj drugą liczbę: ");
        double secondNumber = scanner.nextDouble();
        
        // Zmienna do przechowywania wyniku
        double result = 0;
        boolean validOperation = true;
        
        // Wykonywanie operacji arytmetycznej
        switch (operation) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Błąd: Dzielenie przez zero jest niemożliwe.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Błąd: Nieprawidłowy symbol operacji.");
                validOperation = false;
        }
        
        // Wyświetlanie wyniku lub informacji o błędzie
        if (validOperation) {
            System.out.println("Wynik: " + result);
        }
        
        // Oczekiwanie na naciśnięcie klawisza Enter
        System.out.println("Naciśnij Enter, aby zakończyć działanie programu.");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Zamknięcie skanera
        scanner.close();
    }
}
