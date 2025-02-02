public class MixMatch{
    public static void main(String[] args) {
    int x = 3;
    System.out.println(x + " Stores whole numbers from -2,147,483,648 to 2,147,483,647");
    short smallNum = 6;
    System.out.println(smallNum + " Stores whole numbers from -32,768 to 32,767");
    byte n = 9;
    System.out.println(n + " Stores whole numbers from -128 to 127");
    long l = 13;
    System.out.println(l + " Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
    float pi = 3.14159f;
    System.out.println(pi + " Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits");
    double d = 1.618033988749894;
    System.out.println(d + " Stores fractional numbers. Sufficient for storing 15 to 16 decimal digits");
    boolean istrue = true;
    System.out.println(" Stores true or false values" + istrue);
    char myLetter = 'L';
    System.out.println(myLetter + " Stores a single character/letter or ASCII values");
        System.err.println();
    System.out.println("I have to practice putting diff data types like this intger: " + x + " or this short: " + smallNum + ". it looks like a int but there is a difference. this byte also looks no different: " + n + ". there is a difference especially if you read what I typed. I don't really know what else to type so this is a long: " + l + ". Here's the digit of pi: " + pi + "... here's the golden ration number: " + d + ". is Java a programming language? " + istrue + ". I guess it is. lastly, this sentence is such an " + myLetter + ". The end.");
  }
}