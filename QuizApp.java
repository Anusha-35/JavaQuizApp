import java.util.*;

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create quiz questions
        List<QuizQuestion> questions = new ArrayList<>();
        questions.add(new QuizQuestion(
                "What are Java loops?",
                List.of("Structures for repeated execution", "A type of variable", "Java library", "Keyword for classes"),
                1));

        questions.add(new QuizQuestion(
                "What is an enhanced for-loop?",
                List.of("A loop without initialization", "A loop optimized for arrays/collections", "A loop for errors", "None of these"),
                2));

        questions.add(new QuizQuestion(
                "How do you handle multiple user inputs?",
                List.of("Using multiple Scanner objects", "Using Scanner or BufferedReader with loops", "Using print statements only", "It is not possible"),
                2));

        questions.add(new QuizQuestion(
                "How is a switch-case different from if-else?",
                List.of("Switch supports strings; if-else doesn’t", "Switch uses expressions for multiple cases; if-else uses conditions", "There is no difference", "If-else only works for integers"),
                2));

        questions.add(new QuizQuestion(
                "What are collections in Java?",
                List.of("Interfaces for handling groups of objects", "A type of Java loop", "Variable for storing one value", "Data types for numbers"),
                1));

        questions.add(new QuizQuestion(
                "What is an ArrayList?",
                List.of("A fixed-size array", "A dynamic list implementation in Java Collections", "A Java library", "A loop type"),
                2));

        questions.add(new QuizQuestion(
                "How to iterate using iterators?",
                List.of("Use next() in a while loop with hasNext()", "Use int i = 0 loop only", "Using print statements repeatedly", "Iterators cannot be used for loops"),
                1));

        questions.add(new QuizQuestion(
                "What is a Map?",
                List.of("Collection that stores key-value pairs", "A type of array", "A loop control statement", "A Java keyword"),
                1));

        questions.add(new QuizQuestion(
                "How to sort a list?",
                List.of("Collections.sort(list)", "list.sortArray()", "sort(list) without library", "Sorting not possible in Java"),
                1));

        questions.add(new QuizQuestion(
                "How to shuffle elements?",
                List.of("Collections.shuffle(list)", "list.random()", "Shuffle not possible in Java", "list.mix()"),
                1));

        int score = 0;

        System.out.println("Welcome to the Java Quiz!\n");

        for (int i = 0; i < questions.size(); i++) {
            QuizQuestion q = questions.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.getQuestion());

            List<String> options = q.getOptions();
            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Your answer (1-" + options.size() + "): ");
            int userAnswer;
            try {
                userAnswer = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Skipping question.\n");
                continue;
            }

            if (userAnswer == q.getCorrectOption()) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong. Correct answer: Option " + q.getCorrectOption() + "\n");
            }
        }

        System.out.println("Quiz completed! Your score: " + score + "/" + questions.size());
        scanner.close();
    }
}
