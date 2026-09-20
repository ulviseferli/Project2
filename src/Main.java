import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //Task1
    System.out.print("enter the number: ");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    if(num % 2 == 0){
        System.out.println("number is even");
    }
    else {
        System.out.println("number is odd");
    }

    //Task2
    System.out.print("enter the first number: ");
    Scanner scanner = new Scanner(System.in);
    int num1 = scanner.nextInt();
    System.out.print("enter the second number: ");
    int num2 = scanner.nextInt();
    System.out.print("enter the third number: ");
    int num3 = scanner.nextInt();

    if(num1 >= num2 && num1 >= num3){
        System.out.println(num1);
    } else if (num2 >= num3 && num2 >= num1) {
        System.out.println(num2);
    }
    else{
        System.out.println(num3);
    }

    //Task3
    System.out.print("enter your score: ");
    Scanner scanner = new Scanner(System.in);
    int score = scanner.nextInt();
    if(score >= 91){
        System.out.println("A");
    }
    else if(score >= 81){
        System.out.println("B");
    }
    else if(score >= 71){
        System.out.println("C");
    }
    else if(score >=61){
        System.out.println("D");
    }
    else {
        System.out.println("E");
    }

    //Task4
    System.out.print("enter side a: ");
    Scanner scanner = new Scanner(System.in);
    double a = scanner.nextDouble();
    System.out.print("enter side b: ");
    double b = scanner.nextDouble();
    System.out.print("enter side c: ");
    double c = scanner.nextDouble();

    if(a+b>c && a+c>b && b+c>a){
        System.out.println("");
    }
    else {
        System.out.println("k");
    }

    //Task5
    System.out.print("enter first number: ");
    Scanner scanner = new Scanner(System.in);
    int num1= scanner.nextInt();
    System.out.print("enter second number: ");
    int num2= scanner.nextInt();
    System.out.println("enter operation symbol");
    char c = scanner.nextLine().charAt(0);
    if(c == '+')
        System.out.println(num1 + num2);
    else if (c == '-')
        System.out.println(num1 - num2);
    else if(c == '*')
        System.out.println(num1 * num2);
    else if(c == '/')
        System.out.println(num1 / num2);


    //Task6
    int a = 5;
    int b = 6;
    int c = 0;

    a = b;
    c = a;
    b = c;

    a = a + b;
    b = a - b;
    a = a - b;

    System.out.println("a: "+a+" b: "+b);


}
