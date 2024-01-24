import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class  Vizsga3 {
    static List<String> line = new ArrayList<>();
    public static void main(String[] args) {
        try {
             line = Files.readAllLines(Path.of("src/text.txt"));
        } catch (IOException ex) {
            System.out.println("Error");
        }

        for(String lines:line){
            System.out.println(lines);
        }

    }
}