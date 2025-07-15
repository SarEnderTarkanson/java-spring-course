import java.util.Scanner;

public class QuestionService {

    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What?", "Java", "JavaScript", "Python", "C#", "Python");
        questions[1] = new Question(2, "Where?", "Turkey", "Poland", "Germany", "France", "Poland");
        questions[2] = new Question(3, "Who?", "Beyza", "Alpy", "Endo", "Busra", "Beyza");
        questions[3] = new Question(4, "When?", "2015", "2018", "1987", "1986", "2015");
        questions[4] = new Question(5, "How much?", "11.99", "13.99", "15.99", "19.99", "13.99");

    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }

    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
