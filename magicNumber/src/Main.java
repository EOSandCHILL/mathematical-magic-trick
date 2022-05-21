public class Main {
    public static void main(String[] args) {

        /*In this project, I will become a mathemagician and write a small program
        that performs a mathematical magic trick! It will involve performing arithmetic
        operations on an integer that you choose.*/

        /*Create an int variable called myNumber.
        Set it equal to any integer other than 0.*/
        int myNumber = 20;
        //We will refer to myNumber as the original number from now on.

        /*Create an int variable called stepOne.
        Set it equal to the original number (myNumber)
        multiplied by itself.*/
        int stepOne = myNumber * myNumber;
        /*Create an int variable called stepTwo.
        Set it equal to the previous result (stepOne)
        plus the original number (myNumber).*/
        int stepTwo = stepOne + myNumber;
        /*Create an int variable called stepThree.
        Set it equal to the previous result (stepTwo)
        divided by the original number.*/
        int stepThree = stepTwo / myNumber;
        /*Create an int variable called stepFour.
        Set it equal to the previous result (stepThree)
        plus 17.*/
        int stepFour = stepThree + 17;
        /*Create an int variable called stepFive.
        Set it equal to the previous result (stepFour)
        minus the original number.*/
        int stepFive = stepFour - myNumber;
        /*Create an int variable called stepSix.Set it
        equal to the previous result (stepFive) divided
        by 6.*/
        int stepSix = stepFive / 6;
        // Print out the value of the last step.

        System.out.println(stepSix);

        /*Now, go back to the code and change myNumber to any other integer. Run the program
        again.*/

        // Is the output the same?

        // It’s math magic!

    }
}
