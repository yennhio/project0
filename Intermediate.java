

public class Intermediate extends Easy {
    private String answer3;

    public Intermediate (String inputQuestion, String input1, String input2,
                         String input3, int inputCorrect){
       super(inputQuestion, input1, input2, inputCorrect);
       answer3 = input3;
     }

    public void setAnswer3(String input3) {
    answer3 = input3;
    }

    public String getAnswer3(){
    return answer3;
    }

    @Override
    public void win(){
      System.out.println("Great job! You are correct.");
    }

    @Override
    public void lose(){
      System.out.println("You lost. Better luck next time.");
    }

}
