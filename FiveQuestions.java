import java.io.Console;
import java.util.concurrent.atomic.*;
import java.util.*;
import java.util.stream.*;

public class FiveQuestions {
    public static void main(String[] args) {
        Console console = System.console();
        if(console == null) {
           throw new RuntimeException("Can't find system console, you have to run the programme with console provider.");
        }
        String question;
        if(args.length == 0) {
            question = console.readLine("Enter your problem: ");
        } else {
            question = String.join(" ", args);
        }
        List<String> answears = Stream
            .generate(() -> console.readLine("Why? A:"))
            .limit(5)
            .toList();
        System.out.println("\u001B[31mROBLEM: " + question + "\u001B[0m");
        AtomicInteger i = new AtomicInteger(1);
        answears.forEach(c -> System.out.println("\t".repeat(i.getAndIncrement()) + "-" + c)); 
        System.out.println("\u001B[32mROOT CAUSE: " + answears.get(4) + "\u001B[0m");
    }
}
