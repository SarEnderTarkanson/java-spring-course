public class QuestionService {

    Question[] questions = new Question[5];

    public QuestionService() {
        questions[0] = new Question(1, "What?", "Java", "JavaScript", "Python", "C#", "Python");
        questions[1] = new Question(2, "Where?", "Turkey", "Poland", "Germany", "France", "Poland");
        questions[2] = new Question(3, "Who?", "Beyza", "Alpy", "Endo", "Busra", "Beyza");
        questions[3] = new Question(4, "When?", "2015", "2018", "1987", "1986", "2015");
        questions[4] = new Question(5, "How much?", "11.99", "13.99", "15.99", "19.99", "13.99");

    }

    public void displayQuestions() {

        for (Question q : questions) {
            System.out.println(q);
        }

    }

}
