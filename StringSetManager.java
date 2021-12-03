import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
enum StringCommand {
    ADD, REMOVE, CLEAN, QUIT, SORT, INVALID;

    public static StringCommand getCommand(String str) {
        final String commandName = str;
        StringCommand command;
        try {
            command = StringCommand.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            command=StringCommand.INVALID;
        }
        return command;
    }

}
public class StringSetManager {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrays = new ArrayList<>();
        while(true) {
            final StringCommand command = StringCommand.getCommand(scanner.next());
            final String str;
            if(command==StringCommand.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    str = scanner.next();
                    if(arrays.indexOf(str)==-1) {
                        arrays.add(str);
                    }
                        System.out.println("Element Size: " + arrays.size() + ", Values = " + arrays);
                    break;
                case REMOVE:
                    str = scanner.next();
                    arrays.remove(str);
                    System.out.println("Element Size: " + arrays.size() + ", Values = " + arrays);
                    break;
                case CLEAN:
                    for(int i = arrays.size()-1; i >=0; i--) {
                        arrays.remove(i);
                    }
                    System.out.println("Element Size: " + arrays.size() + ", Values = " + arrays);
                    break;
                case SORT:
                    str = scanner.next();
                    final String str1=str.toUpperCase();
                    Collections.sort(arrays);
                    switch (str1) {
                        case "ASC":
                        System.out.println("Element Size: " + arrays.size() + ", Values = " + arrays);
                        break;
                        case "DESC":
                        final ArrayList<String> arrays1 = new ArrayList<>();
                        for(int i = 0 ; i < arrays.size(); i++) {
                            arrays1.add(arrays.get(arrays.size()-i-1));
                        }
                        for(int i = 0 ; i < arrays.size(); i++) {
                            arrays.set(i, arrays1.get(i));
                        }
                        System.out.println("Element Size: " + arrays.size() + ", Values = " + arrays);
                        break;
                        default:
                        System.out.println("Invalid Command");
                        break;
                    }
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }
}

