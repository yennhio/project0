

public class Difficult extends Intermediate {

   private String answer4;

   public Difficult(String inputQuestion, String input1, String input2,
                       String input3, String input4, int inputCorrect){
      super(inputQuestion, input1, input2, input3, inputCorrect);
      answer4 = input4;
   }

   public void setAnswer4(String input4){
     answer4 = input4;
   }

   public String getAnswer4(){
     return answer4;
   }

   @Override
   public void win(){
     System.out.println("Spectacular! You are so smart.");
   }

   @Override
   public void lose(){
     System.out.println("You lost.. practice makes perfect.");
   }

}
