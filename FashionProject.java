import java.util.Scanner;
//Allows for input.

public class FashionProject {

        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            //New input.
            System.out.println("Enter a number from 1-5 to learn about how you can help the environment by using sustainability in fashion. If you would like to the program stop, please type 0.");
            int num = in.nextInt();
            //Begins the input.

            while (1==1)
            //Starts the loop.
            {
                if (num == 1)
                {
                    System.out.println("One way you can help the environment is by buying used or recycled clothes, instead of buying new ones, in order to stop more clothes from being manufactured.");
                    System.out.println("Enter a number from 1-5 to learn about how why you should buy sustainable clothes. If you would like to the program stop, please type 0.");
                    num = in.nextInt();
                    //Input again.

                }
                else if (num == 2)
                {
                    System.out.println("Another way of helping the environment is by buying clothes made of sustainable materials such as organic cottons, as they uses less toxic wastes when being manufactured. ");
                    System.out.println("Enter a number from 1-5 to learn about how you can help the environment by using sustainability in fashion. If you would like to the program stop, please type 0.");
                    num = in.nextInt();
                    //Input again.

                }
                else if (num == 3)
                {
                    System.out.println("Another way of helping the environment is by buying only natural fibers and single file garments. ");
                    System.out.println("Enter a number from 1-5 to learn about how you can help the environment by using sustainability in fashion. If you would like to the program stop, please type 0.");
                    num = in.nextInt();
                    //Input again.

                }
                else if (num == 4)
                {
                    System.out.println("Another way of helping the environment is by not buying microplastics, because they pollute the environment and harm the animals that accidentally eat them. ");
                    System.out.println("Enter a number from 1-5 to learn about how you can help the environment by using sustainability in fashion. If you would like to the program stop, please type 0.");
                    num = in.nextInt();
                    //Input again.

                }
                else if (num == 5)
                {
                    System.out.println("Another way of helping the environment is by telling others ways to be sustainable in fashion, such as telling them to recycle their clothes. ");
                    System.out.println("Enter a number from 1-5 to learn about how you can help the environment by using sustainability in fashion. If you would like to the program stop, please type 0.");
                    num = in.nextInt();
                    //Input again.

                }
                else if (num == 0)
                {
                    break;
                    //Stops the loop.
                }
                else
                {
                    System.out.println("Please enter a valid number between the range. If you would like the program to stop, please press 0.");
                    num = in.nextInt();
                    //Input again.
                }
            }
            System.out.println("Thank you for your time. I hope you learned something new.");
            //Ends program.
    }

}
