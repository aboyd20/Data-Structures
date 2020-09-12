import java.util.ArrayList;
import java.util.Scanner;

/**
   A quiz contains a list of questions.
*/
public class Quiz {
   private ArrayList<Question> questions;
   
   /**
      Constructs a quiz with no questions.
   */
   public Quiz() {
      questions = new ArrayList<Question>();
   }

   /**
      Adds a question to this quiz.
      @param q the question
   */
   public void addQuestion(Question q) {
      questions.add(q);
   }

   /**
      Presents the questions to the user and checks the response.
    */
   public void presentQuestions() {

	   // scanner input code
	   Scanner input = new Scanner(System.in); 
	   for (Question i : questions){
		   i.display();
		   System.out.print("Your answer: ");
		   String answer =  input.nextLine();
		   System.out.println(i.checkAnswer(answer));
	   }
	   input.close();

   }
}

