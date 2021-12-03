import java.io.InputStream;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
enum Command {
    ADD, LIST, SUM, SRTA, SRTD, QUIT, INVALID;

    public static Command getCommand(String str) {
        final String commandName = str;
        Command command;
        try {
            command = Command.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            command=Command.INVALID;
        }
        return command;
    }

}
public class
ArrayEnum {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrays = new ArrayList<>();
        while(true) {
            final Command command = Command.getCommand(scanner.next());
            int sum = 0;
            if(command==Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = scanner.nextInt();
                    arrays.add(newValue);
                    break;
                case LIST:
                    for(int i = 0 ; i < arrays.size(); i ++) {
                        System.out.printf("%d ",arrays.get(i));
                    }
                    System.out.println();
                    break;
                case SUM:
                    for(int i = 0 ; i < arrays.size(); i ++) {
                        sum+=arrays.get(i);
                    }
                    System.out.println(sum);
                    break;
                case SRTA:
                    Collections.sort(arrays);
                    for(int i = 0 ; i < arrays.size(); i ++) {
                        System.out.printf("%d ",arrays.get(i));
                    }
                    System.out.println();
                    break;
                case SRTD:
                    Collections.sort(arrays);
                    for(int i = arrays.size()-1 ; i >=0; i --) {
                        System.out.printf("%d ",arrays.get(i));
                    }
                    System.out.println();
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }
}

