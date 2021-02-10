import java.util.Scanner;

public class Trivia {
  public static void main(String[] args){

    Easy[] easyLvl = new Easy[3];
    Intermediate[] normalLvl = new Intermediate[3];
    Difficult[] hardLvl = new Difficult[3];
    Easy result1 = new Easy("","","",0);
    Intermediate result2 = new Intermediate("","","","",0);
    Difficult result3 = new Difficult("","","","","",0);

    easyLvl[0] = new Easy("How many legs does a spider have",
                           "1. six", "2. eight", 2);
    easyLvl[1] = new Easy("What's the color of emerald?",
                          "1. green", "2. blue", 1);
    easyLvl[2] = new Easy("What's frozen water",
                          "1. snow", "2. ice", 2);

    normalLvl[0] = new Intermediate("What ocean is off the California coast?",
                                    "1. Atlantic", "2. Pacific", "3. Indian", 2);
    normalLvl[1] = new Intermediate("When do leaves die?", "1. Spring",
                                    "2. Winter", "3. Fall", 3);
    normalLvl[2] = new Intermediate("The fastest land animal:", "1. Cheetah",
                                    "2. Lion", "3. Eagle", 1);

    hardLvl[0] = new Difficult("Who wrote Hamlet?", "1. Anna Wintour",
                               "2. Shakespeare", "3. Da Vinci", "4. Mozart", 2);
    hardLvl[1] = new Difficult("What's a doe?", "1. Money", "2. Bread",
                               "3. Female deer", "4. Slippers", 3);
    hardLvl[2] = new Difficult("Who was the first on the moon?", "1. Lance Armstrong",
                              "2. Neil Armstrong", "3. Jake Armstrong", "4. Nile Armstrong",
                              2);

    int score = 0;
    int lvl;
    int userInput;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Welcome to Trivia! Type 1 for easy, 2 for normal, or 3 for difficult.");
    lvl = keyboard.nextInt();

    if (lvl == 1){
      System.out.println("Type 1 or 2 to answer.");
      for (int i=0; i<3; i++) {
      System.out.println(easyLvl[i].getQuestion());
      System.out.println(easyLvl[i].getAnswer1());
      System.out.println(easyLvl[i].getAnswer2());
      System.out.print("Your answer is: ");
      userInput = keyboard.nextInt();

      if (easyLvl[i].getCorrect() == userInput)
      score++;
    }
      if (score == 3)
      result1.win();
      else
      result1.lose();
    }

    else if (lvl == 2) {
      System.out.println("Type 1, 2, or 3 to answer.");
      for (int i=0; i<3; i++){
        System.out.println(normalLvl[i].getQuestion());
        System.out.println(normalLvl[i].getAnswer1());
        System.out.println(normalLvl[i].getAnswer2());
        System.out.println(normalLvl[i].getAnswer3());
        System.out.print("Your answer is: ");
        userInput = keyboard.nextInt();

        if (normalLvl[i].getCorrect() == userInput)
        score++;
      }
      //calling overridden methods
        if (score == 3)
        result2.win();
        else
        result2.lose();
    }

    else if (lvl == 3){
      System.out.println("Type 1, 2, 3 or 4 to answer.");
      for (int i=0; i<3; i++){
        System.out.println(hardLvl[i].getQuestion());
        System.out.println(hardLvl[i].getAnswer1());
        System.out.println(hardLvl[i].getAnswer2());
        System.out.println(hardLvl[i].getAnswer3());
        System.out.println(hardLvl[i].getAnswer4());
        System.out.print("Your answer is: ");
        userInput = keyboard.nextInt();

        if (hardLvl[i].getCorrect() == userInput)
        score++;
      }
      //calling overridden methods
        if (score == 3)
        result3.win();
        else
        result3.lose();
    }

    Scanner last = new Scanner(System.in);
    String choice;
    System.out.println("Do you want your bonus fun facts? Type 'yes' or 'no'.");
    choice = last.nextLine();

    if (choice.equals("yes")){
    fact();
    fact("North Korea", "Cuba");
  }
    else
    System.out.println("Thanks for playing!");

}
//Overload methods
    private static void fact(){
      System.out.println("Japan is very earthquake-prone.");
}

    private static void fact(String country1, String country2){
      System.out.println(country1 + " and " + country2 + " are the only two places where you cannot buy Coca Cola.");
}

}
