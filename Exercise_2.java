/**
Modify the following program so it prints 1 tab between each word and 2 blank line between each line of text

class MyPrintingProgram
{
public static void main(String[] args)
 {
    System.out.println("L1 Word1 Word2 Word3"); System.out.print("L2 Word4 Word5 Word6"); System.out.print("\n L3 Word7 Word8 Word9");
 }
}
 */
public class Exercise_2 {
    public static void main(String[] args) {
        System.out.println("L1\t Word1\t Word2\t Word3 \n\nL2\t Word4\t Word5\t Word6\n\nL3\t Word7\t Word8\t Word9");
    }
}

/*
    Changes that I’ve made to the original program:

    Added a tab character (\t) between each word to print them with a tab space.
    Added two new line characters (\n\n) after each line to print two blank lines between them.
 */