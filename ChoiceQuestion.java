import java.util.ArrayList;

/**
   A question with multiple choices.
*/
public class ChoiceQuestion extends Question {
   private ArrayList<String> choices;
   private int num = 1;

   /**
      Constructs a choice question with no choices.
   */
   public ChoiceQuestion() {
      choices = new ArrayList<String>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct) {
	   choices.add(choice);
	   if (correct){
		   this.setAnswer(Integer.toString(num));
	   }
	   num ++;	 
   }
   
   public void display() {
       // Display the question text
	   super.display();
	   
	   int questionnumber = 1;
	   for (String i : choices){
		   System.out.println(questionnumber + ": " + i);
		   questionnumber++;
	   }
	   
	   

   }
}

