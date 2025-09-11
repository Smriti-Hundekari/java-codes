public class Array {
    public static void main(String a[]){
        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 9;
        nums[3] = 7;

        for(int i=0;i<4;i++){
            System.out.println(nums[i]);
            
        }
    }
}


/*
What is an Array ?
-- An array is collection of similar type of data and store  in contagious memory.
-- e.g marks is collection of different marks obtained by 4 student then {24,25,26,27} is that marks then 
this marks store in contagious manner in memory.

1)How many way to create array in java?
Ways to create array in java
a)Literal notation
Literal notation: int[] arr = {1, 2, 3};
b)Object notation
Array constructor: int[] arr = new int[]{1, 2, 3}; // this is not literal notation ,this is object notation with assignment of value
Array constructor with size: int[] arr = new int[3]; arr[0] = 1; arr[1] = 2; arr[2] = 3; //in this we manually assign value but by default 0 is assign in this case 

default value which store array when we create using object notation for primitive datatype.

-- When you create an array of primitive data types in Java using the object notation, the default value stored in the array depends on the data type:

 -- int arrays: default value is 0
 -- boolean arrays: default value is false
 -- char arrays: default value is '\u0000' (null character)
 -- byte, short, long arrays: default value is 0
 -- float arrays: default value is 0.0f
 -- double arrays: default value is 0.0d

 fetching the element of array :
-- for traversing whole array, you need to know either length of array or know length property of array
-- using length property we get length of array
-- using index we can fetch all value of array
 */
