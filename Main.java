import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  
  Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome to Calculator program");
    System.out.print("Type first number \n");
  int first = Integer.parseInt(scanner.nextLine());
    System.out.print("Type second number \n");
  int second = Integer.parseInt(scanner.nextLine());
    System.out.print("What would you like to do? +,-,%,*,/ \n"); 
  String sign = scanner.nextLine();
  if (sign.equals("+")) { // addition operation
    System.out.printf("The result for %d %s %d is equal to %d\n", first, sign, second, (first + second));
  }
  else if (sign.equals("-")) { // subtraction operation
    System.out.printf("The result for %d %s %d is equal to %d\n", first, sign, second, (first - second));
  }
  else if (sign.equals("/")) { // division operation
    System.out.printf("The result for %d %s %d is equal to %d\n", first, sign, second, (first / second));
  }
  else if (sign.equals("*")) { // multiplication operation
    System.out.printf("The result for %d %s %d is equal to %d\n", first, sign, second, (first * second));
  }
  else if (sign.equals("%")) { // modulus operation
    System.out.printf("The result for %d %s %d is equal to %d\n", first, sign, second, (first % second));
  }
  else{ //check for invalid input
    System.out.println("Please type a valid operator");
    main(args); //restart the program
    }

    

  scanner.close();
  }
}