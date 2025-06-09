package package_person_homework;

public class PersonDetailshomework {


    public static void main(String[] args) {

        Person firstPerson;

        Person secondPerson;

        Person thirdPerson;

// creating an object from my Person class
        firstPerson = new Person();

        secondPerson = new Person();

        thirdPerson = new Person();


//assigning values to our fields

        firstPerson.name = "Marcia";
        firstPerson.age = 36;
        firstPerson.gender = 'F';
        firstPerson.carYear = 2023;
        firstPerson.car = "Toyota";
        firstPerson.violations = false;
        firstPerson.creditScore = 713;


        secondPerson.name = "Mila";
        secondPerson.age = 29;
        secondPerson.gender = 'F';
        secondPerson.carYear = 2011;
        secondPerson.car = "Hyundai";
        secondPerson.violations = false;
        secondPerson.creditScore = 690;


        thirdPerson.name = "Sarionel";
        thirdPerson.age = 50;
        thirdPerson.gender = 'M';
        thirdPerson.carYear = 2015;
        thirdPerson.car = "Ranger Rover";
        thirdPerson.violations = true;
        thirdPerson.creditScore = 790;


        double monthlyRate = 0;
        double adjustedRate = 0;


        firstPerson.display();
        System.out.print("Preliminary Rate for " + firstPerson.name + ": " + firstPerson.getRate(monthlyRate) + " dollars ");
        System.out.println();
        System.out.println("Adjustments: " + (adjustedRate) + " $");
        System.out.print("Here is " + firstPerson.name + "'s total monthly premium: $ ");
        System.out.printf("%.2f", firstPerson.assumeCarYear(adjustedRate) + firstPerson.getRate(monthlyRate));
        System.out.println();

        System.out.println();

        secondPerson.display();
        System.out.print("Preliminary Rate for " + secondPerson.name + ": " + secondPerson.getRate(monthlyRate) + " dollars ");
        System.out.println();
        System.out.print("Adjustments: " + (adjustedRate) + " $");
        System.out.println();
        System.out.print("Here is " + secondPerson.name + "'s total monthly premium: $ ");
        System.out.printf("%.2f", secondPerson.assumeCarYear(adjustedRate) + secondPerson.getRate(monthlyRate));
        System.out.println();

        System.out.println();

        thirdPerson.display();
        System.out.print("Preliminary Rate for " + thirdPerson.name + ": " + thirdPerson.getRate(monthlyRate) + " dollars ");
        System.out.println();
        System.out.print("Adjustments: " + (adjustedRate) + " $");
        System.out.println();
        System.out.print("Here is " + thirdPerson.name + "'s total monthly premium: $ ");
        System.out.printf("%.2f", thirdPerson.assumeCarYear(adjustedRate) + thirdPerson.getRate(monthlyRate));
        System.out.println();
    }
}
