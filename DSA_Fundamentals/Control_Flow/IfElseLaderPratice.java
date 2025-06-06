public class IfElseLaderPratice {
    public static void main(String[] args) {
        //Problem-1
        int result1 = findMaxNumber_approach1(10, 15, 20);
        System.out.println("Approach1 : Maximum among all three numbers is " + result1);

        int result2 = findMaxNumber_approach2(10, 15, 5);
        System.out.println("Approach2 : Maximum among all three numbers is " + result2);

        //Problem-2
        String str1 = checkCharacter_approach1('+');
        System.out.println(str1);

        String str2 = checkCharacter_approach2('6');
        System.out.println(str2);

        //Problem3
        minimumNumberOfNotes(567890);

        //Problem4
        String triangleShape = findTriangleShape(10, 2, 200);
        System.out.println(triangleShape);

        float electricityBill = calculateElectricityBill(50);
        System.out.println("Electricity Bill " + electricityBill);

    }
    //Problem - 1
    //Write a program to find maximum between three numbers.
    public static int findMaxNumber_approach1 (int num1, int num2, int num3) {
        int max;

        if(num1 > num2) {
            if(num1 > num3) {
                max = num1;
            } else{
                max = num3;
            }
        } else {
            if(num2 > num3) {
                max = num2;
            } else {
                max = num3;
            }
        }

        return max;
    }

    public static int findMaxNumber_approach2 (int num1, int num2, int num3) {
        int max;

        if(num1 > num2 && num1 > num3) {
            max = num1;
        } else if(num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }

        return max;
    }

    //Problem - 2
    //Write a Java program to input a character from user and check whether given character is alphabet, digit or special character.
    public static String checkCharacter_approach1 (char ch) {
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return "Character";
        } else if (ch >= '0' && ch <= '9') {
            return "Digit";
        } else {
            return "Special Character";
        }
    }

    public static String checkCharacter_approach2 (char ch) {
        //A - Z : 65 - 90, a - z : 97 - 122, 0 - 9 : 48 - 57 by ASCII Value.
        if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
            return "Character";
        } else if (ch >= 48 && ch <= 57) {
            return "Digit";
        } else {
            return "Special Character";
        }
    }

    //Problem - 3
    //Write a program to input amount from user and print minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1) required for the amount.
    public static void minimumNumberOfNotes (int amount) {
        int note500, note100, note50, note20, note10,  note5, note2, note1;
        note500 = note100 = note50 = note20 = note10 =  note5 = note2 = note1 = 0;

        if(amount >= 500) {
            note500 = amount / 500;
            amount -= note500 * 500;
        }
        if(amount >= 100) {
            note100 = amount / 100;
            amount -= note100 * 100;
        }
        if(amount >= 50) {
            note50 = amount / 50;
            amount -= note50 * 50;
        }
        if(amount >= 20) {
            note20 = amount / 20;
            amount -= note20 * 20;
        }
        if(amount >= 10) {
            note10 = amount / 10;
            amount -= note10 * 10;
        }
        if(amount >= 5) {
            note5 = amount / 5;
            amount -= note5 * 5;
        }
        if(amount >= 2) {
            note2 = amount / 2;
            amount -= note2 * 2;
        }
        if(amount >= 1) {
            note1 = amount / 1;
            amount -= note1 * 1;
        }

        System.out.println("Total Number of Notes :");
        System.out.println("500 : " + note500);
        System.out.println("100 : " + note100);
        System.out.println("50 : " + note50);
        System.out.println("20 : " + note20);
        System.out.println("10 : " + note10);
        System.out.println("5 : " + note5);
        System.out.println("2 : " + note2);
        System.out.println("1 : " + note1);
    }

    //Problem - 4
    //Write a C++ program to input sides of a triangle and check whether a triangle is equilateral, scalene or isosceles triangle.
    public static String findTriangleShape(int side1, int side2, int side3) {
        if(side1 == side2 && side2 == side3) {
            return "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    //Problem - 5
    //Write a program to input electricity unit charge and calculate the total electricity bill according to the given condition.
    public static float calculateElectricityBill(int unit) {
        float amount, totalAmount, surCharge;

        if(unit <= 50) {
            amount = unit * 0.50f;
        } else if (unit <= 150) {
            amount = 25 + ((unit - 50) * 0.75f);
        } else if (unit <= 250) {
            amount = 100 + ((unit - 150) * 1.20f);
        } else {
            amount = 220 + ((unit - 250) * 1.50f);
        }

        surCharge = amount * 0.20f;
        totalAmount = amount + surCharge;

        return totalAmount;
    }

}