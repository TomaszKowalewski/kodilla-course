import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);




    PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Print PoemDecorator to use beautify");
    poemBeautifier.beautify("If not now, then when?", "The spoon does not exist",(firstText, secondText) -> "ABC"+" "+firstText+" "+"ABC"+" "+"ABC"+" "+secondText+" "+"ABC");
    poemBeautifier.beautify("If not now, then when?", "The spoon does not exist",(firstText, secondText) -> firstText.toUpperCase()+" "+secondText.toUpperCase());
    poemBeautifier.beautify("If not now, then when?", "The spoon does not exist",(firstText, secondText) -> "***"+" "+secondText+" "+"***"+" "+"***"+" "+firstText+" "+"***");

    System.out.println("Using stream to generate even numbers from 1 to 20");
    NumbersGenerator.generateEven(20);
    }
}
