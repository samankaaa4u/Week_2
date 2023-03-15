/*
    a. "This shows the wrong current year: " + (20 +22)
    Output: This shows the wrong current year: 42

    In this expression, 20 and 22 are added first within the parenthesis, resulting in 42. Then, the string "This shows the wrong current year: " is concatenated with the result of the addition, resulting in the output "This shows the wrong current year: 42".

    b. "This is the correct year: " + 20 + 22
    Output: This is the correct year: 2022

    In this expression, the string "This is the correct year: " is concatenated with 20, resulting in "This is the correct year: 20". Then, the string "22" is concatenated to the end of the resulting string, resulting in the output "This is the correct year: 2022". This is because in Java, when a string is concatenated with a numeric value, the numeric value is first converted to a string.

    c. 20+22+ " The wrong year again "
    Output: 42 The wrong year again

    In this expression, 20 and 22 are added first, resulting in 42. Then, the string " The wrong year again " is concatenated to the end of the result of the addition, resulting in the output "42 The wrong year again".

    The outputs are different because the order of operations in each expression is different, and the way that strings and numeric values are concatenated in Java can affect the final result. In expression (a), the addition is performed first, and then the string concatenation is performed. In expression (b), the string concatenation is performed first with 20, and then the string "22" is concatenated to the resulting string. In expression (c), the addition is performed first, and then the string " The wrong year again " is concatenated to the result of the addition.
    
    Down below is an example that demonstrates the three expressions and their outputs:
*/

public class Exercise_1 {
    public static void main(String[] args) {
        // Expression (a)
        System.out.println("This shows the wrong current year: " + (20 + 22));

        // Expression (b)
        System.out.println("This is the correct year: " + 20 + 22);

        // Expression (c)
        System.out.println(20 + 22 + " The wrong year again ");
    }
}



