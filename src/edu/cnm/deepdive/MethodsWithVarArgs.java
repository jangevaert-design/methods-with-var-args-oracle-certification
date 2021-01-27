package edu.cnm.deepdive;

import java.util.Arrays;

public class MethodsWithVarArgs {

//  public void jump (int ... numbers) {}

  public void jump2(int start, int ... numbers) {}//varargs has to be always at the end.
//public void jump3(int ... start, int ... numbers) {}//will not compile because you can only have
//one varargs parameter.

  public static void jump(int start, int ... numbers) {//although this method is called jump like
  //the method on line 5; it is allowed because this method has different parameters. Called overloading.
    System.out.println("start = " + start + "numbers.length = " + numbers.length);
  }

  public static void main(String[] args) {
      jump(1); //needed to comment out the method on line 5. If not the compiler does not know which
    // jump() to use. Since the jump() method on line 11 is static, we can use it throughout the class
    //and don't need an object to call it. The '1' as parameter refers to the first parameter
      jump(2, 3);//compiles!
      jump(4, 5, 6, 7);//compiles but careful. '4' refers to start while '5, 6, 7' refer to numbers.
      jump(1, new int[] {5, 6, 7});//compiles but warning that the array creation is redundant because
      //we are calling the varargs method.

    run();//prints [] because we have an empty array.
    run(11, 22, 33, 44);
  }

  public static void run(int ... numbers) {
    for (int number : numbers) {
      System.out.println("number = " + number);
    }
    System.out.println(Arrays.toString(numbers));
  }

}
