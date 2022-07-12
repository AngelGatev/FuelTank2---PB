package JavaBasics.ConditionalStatements.MoreExercise;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //•	Бензин – 2.22 лева за един литър,
        //•	Дизел – 2.33 лева за един литър
        //•	Газ – 0.93 лева за литър
        double priceGasoline = 2.22;
        double priceDiesel = 2.33;
        double priceGas = 0.93;
        String fuelType = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String discountCard = scanner.nextLine();
        double sum = 0.00;

        if (fuelType.equals("Diesel")) {
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                if ((discountCard.equals("Yes"))) {
                    sum = (priceDiesel - 0.12) * quantityFuel * 0.92;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = (priceDiesel * quantityFuel * 0.92);
                    System.out.printf("%.02f lv.", sum);
                }
            } else if (quantityFuel > 25) {
                if ((discountCard.equals("Yes"))) {
                    sum = (priceDiesel - 0.12) * quantityFuel * 0.90;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = (priceDiesel * quantityFuel * 0.90);
                    System.out.printf("%.02f lv.", sum);
                }
            } else if (quantityFuel < 20) {
                if (discountCard.equals("Yes")) {
                    sum = (priceDiesel - 0.12) * quantityFuel;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = quantityFuel * priceDiesel;
                    System.out.printf("%.02f lv.", sum);
                }
            }
        }
        if (fuelType.equals("Gasoline")) {
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                if ((discountCard.equals("Yes"))) {
                    sum = (priceGasoline - 0.18) * quantityFuel * 0.92;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = (priceGasoline * quantityFuel * 0.92);
                    System.out.printf("%.02f lv.", sum);
                }
            } else if (quantityFuel > 25) {
                if ((discountCard.equals("Yes"))) {
                    sum = (priceGasoline - 0.18) * quantityFuel * 0.90;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = (priceGasoline * quantityFuel * 0.90);
                    System.out.printf("%.02f lv.", sum);
                }
            } else if (quantityFuel < 20) {
                if (discountCard.equals("Yes")) {
                    sum = (priceGasoline - 0.18) * quantityFuel;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = quantityFuel * priceGasoline;
                    System.out.printf("%.02f lv.", sum);
                }
            }
        }
        if (fuelType.equals("Gas")) {
            if (quantityFuel >= 20 && quantityFuel <= 25) {
                if ((discountCard.equals("Yes"))) {
                    sum = (priceGas - 0.08) * quantityFuel * 0.92;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = (priceGas * quantityFuel * 0.92);
                    System.out.printf("%.02f lv.", sum);
                }
            } else if (quantityFuel > 25) {
                if ((discountCard.equals("Yes"))) {
                    sum = (priceGas - 0.08) * quantityFuel * 0.90;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = (priceGas * quantityFuel * 0.90);
                    System.out.printf("%.02f lv.", sum);
                }
            } else if (quantityFuel < 20) {
                if (discountCard.equals("Yes")) {
                    sum = (priceGas - 0.08) * quantityFuel;
                    System.out.printf("%.02f lv.", sum);
                } else {
                    sum = quantityFuel * priceGas;
                    System.out.printf("%.02f lv.", sum);
                }
            }
        }
    }
}
