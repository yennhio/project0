
public class Easy {
   private String question;
   private String answer1;
   private String answer2;
   private int correct;

   public Easy (String inputQuestion, String input1, String input2, int inputCorrect) {
     question = inputQuestion;
     answer1 = input1;
     answer2 = input2;
     correct = inputCorrect;
   }

   public void setQuestion (String inputQuestion) {
     question = inputQuestion;
   }

   public void setAnswer1 (String input1) {
     answer1 = input1;
   }

   public void setAnswer2 (String input2) {
     answer2 = input2;
   }

   public void setCorrect (int inputCorrect) {
     correct = inputCorrect;
   }

   public String getQuestion(){
     return question;
   }

   public String getAnswer1 (){
     return answer1;
   }

   public String getAnswer2 (){
     return answer2;
   }

   public int getCorrect(){
     return correct;
   }

   public void win(){
     System.out.println("You got everything right!");
   }

   public void lose(){
     System.out.println("Oh no, you lost.");
   }
}
