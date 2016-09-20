/**
 * Created by kyle on 9/20/16.
 */
public class gradeconverter {

    public static void main(String[] args)
    {

        int grade = readInt("Enter a grade:");
    //receiving user input

        //continuously comparing user input to grades determining letter grade
        if (grade >= 90 )
        {
            System.out.println("You received an A");
        }
        else
        {
            if (grade >= 80)
            {
                System.out.println("You received an B");
            }
            else
            {
                if (grade >= 70)
                {
                    System.out.println("You received an C");
                }
                else
                {
                    if (grade >= 60)
                    {
                        System.out.println("You received an D");
                    }
                    else
                    {
                        System.out.println("You received an F");
                    }
                }
            }
        }
    }
}

