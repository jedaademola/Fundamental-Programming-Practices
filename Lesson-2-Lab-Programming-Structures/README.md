Problem - 1

Create a class called Prog1. In the main method of the class, output to the console the result of doing the following two computations:
1. get a random number x in the range 1 .. 9 and compute πx.
2. get a random number y in the range 3 .. 14 and compute yπ.
Use the RandomNumbers.java class that has been provided for you as an attachment. (Do not use the Random class directly.) Use Math API to solve πx and yπ.

Problem – 2

Create a class Prog2. Inside its main method, create float variables to store each of the following numbers:

1.27, 3.881, 9.6
Output to the console the following two values:
1. the sum of the floats as an integer, obtained by casting the sum to type int
2. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the Math.round function

Problem – 3

The records of a database table Product have been stored in text format as s string in your given
program using delimiters “:” and “,” in the following way: Different rows are separated by “:” and,
within a particular record, different column entries are separated by “,”. In each record, the first column
is always productId.
Write a program (called Prog3) that will read from the string records and extract all the product id’s that
occur in the String. Here records works as text file. Your program should then output ALL the product id
these values to the console in the following form: (this is a typical example)
231A
113D
521W
009G

public class Prog3 {
public static void main(String[] args){
//column names: productId, name,numInStock,provider,pricePerUnit
 String records = "231A,Light Bulb,123,Wilco,1.75:"+
 "113D,Hairbrush,19,Aamco,3.75:"+
 "521W,Shampoo,24,Acme,6.95:"+
 "440Q,Dishwashing Detergent,20,Wilco,1.75:"+
"009G,Toothbrush,77,Wilco,0.85:"+
"336C,Comb,34,Wilco,0.99:"+
"523E,Paper Pad Set,109,Congdon and Chrome,2.45:"+
"888A,Fake Diamond Ring,111,AmericusDiamond,3.95:"+
"176A,Romance Nove1 1,20,Barnes and Noble,3.50:"+
"176B,Romance Nove1 2,20,Barnes and Noble,3.50:"+
"176C,Romance Nove1 3,20,Barnes and Noble,3.50:"+
"500D,Floss,44,Wilco,1.25:"+
"135B,Ant Farm,5,Wilco,8.00:"+
"211Q,Bicycle,9,Schwinn,75.95:"+
"932V,Pen Set,50,Congdon and Chrome,9.95:"+
"678Q,Pencil 50,123,Congdon and Chrome,9.95:"+
"239A,Colored Pencils,25,Congdon and Chrome,4.75:"+
"975B,Shower Curtain,25,Wilco,6.50:"+
"870K,Dog Bowl,15,Wilco,4.75:"+
"231S,Cat Bowl,15,Wilco,4.75:"+
"562M,Kitty Litter,15,Wilco,3.25:"+
"777X,Dog Bone,15,Wilco,4.15:"+
"933W,Cat Toy,15,Wilco,2.35:"+
"215A,Hair Ball,0,Little Jimmy,0.00:";
// Implement the code
}
}

Problem – 4

Write a program (called Prog4) that asks the user to input a String. The output is the characters
of this String in reverse order, which should be written to the console. (For example, if the input
string is "Hello", the ouptut string would be "olleH") (Do not use arrays and do not create a
new String object. In particular, you may not use Java API library functions that peform the
reverse operation for you, such as the reverse functions found in StringBuilder and
StringBuffer.)Implement your own logic, NO API.

Problem – 5

Write a program that generates a random set of 8 addition problems (intended for a child in
elementary school). Numbers to be added should be randomly chosen from the range 1..99 [Use
the RandomNumbers.java class to produce random number in the range of 1..99]. Each run of
the program should result in a different set of problems (actually, there is a tiny probability that
two runs of the program will produce the same set of problems, but I don’t expect anyone will
encounter this). Console output should be formatted like this:

8 23 31 99
 + 10 + 17 + 9 + 42
 _____ ____ ____ ____
 83 67 39 5
 + 17 + 7 + 19 + 49
 _____ ____ ____ ____
Hint : Use Multi-Dimensional array to store the random numbers in [4 x 4 ] matrix. 


Problem – 6

Write a program called RemoveDups. Create an array which accepts an array of
Strings only. Creates a new array in which all duplicate Strings in the original input array have
been removed.
For example, if the input array is
["horse", "dog", "cat", "horse","dog"]
then the output would be the following array:
["horse","dog","cat"]

Problem – 7

Write a program to accept the string inputs from Command line arguments and perform the
following.
a. Print the length of each string input.
b. Count the string inputs starts with ‘A’.

