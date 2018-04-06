package medialecture8;

import java.io.FileInputStream;
import java.io.IOException;

//é possível usar o try sem o catch com: 1) exception e 2) com finally, finally sempre finaliza um try

// JAVA ERROR HANDLING É LECTURE 8 !!!!
public class Main {
    public static void main(String[] args) {

        Main myApp = new Main();

        try {
            myApp.tryWithoutCatch();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(myApp.tryFinally(1));

    }

    private void tryWithoutCatch() throws IOException {

        try (FileInputStream fIn = new FileInputStream("text.txt")){

        }
    }

    private String tryFinally(int value){
        try
        {


            switch (value)
            {
                case 1:
                case 2:
                    return String.format("The value is %d.", value);
                default:
                    return "Not a valid value";

            }

        }finally {
            System.out.println("This is written to a lof file...");
        }
    }

}
