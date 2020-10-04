/*#**********************************************************************************************************#
# Enrollment no - 12190085
# Name - Sourav Rai
# Course - Bsc.IT group B (Assignment 1)
#Level 1: 15 Marks
#Question2:
#	Complete the incomplete functions in the ArrayList(Dynamic array API) class. There are 5 incomplete 
#	functions inside the class which are:
#	1) add() - which takes a generic variable as a parameter and adds the element to the dynamic array. 
#			   Insert elements into a dynamic array which doubles in size when the array is 3/4th full 
#			   and halves in size when the array is 1/4th full
#	2) pop() - this function does not take a parameter.When called pop deletes the last element in the dynamic array.
#	3) resize() - this function takes one integer parameter. When called resize changes the size of the array
#				to the value of the parameter sent.
#	4) size() - Does not take any parameter and returns the number of elements present in the dynamic array.
#	5) toString() - Does not take any parameter and returns the string representation of the dynamic array.
#**********************************************************************************************************#*/



public class Array{
    //initilization and declearations of the requireds and the given
    double fullOf_1by4 = 0.25;
	double fullOf_3by4 = 0.75;
	static int size = 4;
	int a;
	int remove;
	int top = 0;
	double length;
    int array[] = new int[size];
    // Method for returning the int size of the method 
    public int size(){
        return size;
    }
    // Method for retruning the string
    public String toString()
	{
		String s = Integer.toString(size);
		return s;
    }
    // This method is mainly used for adding the element to the array
    public void add(int e){
        array[top]=e;
        top++;
        System.out.println("The elements you added is "+ e);

    }
    // This method is mainly used for poping out the elements from the array
    public void pop(){
        top--;
        remove = array[top];
        array[top]=0;
        int count = 0;
        int i = 0;
        while(i < array[i]){
            i++;
            count++;

        }
        a = count;
        length = (double)a/size;
        System.out.println("The removed the element "+ remove);

    }
    // This method is mainly for the resizing functions
    public void resize()
	{
		if(length == fullOf_1by4 ) {
			int newArray[] = new int[(size/2)*2];
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			array = newArray;
			size = size/2;
			for(int n : newArray) {
				System.out.print(n + " ");
				}	
		}
		else if(length == length*fullOf_3by4) {
			int newArray[] = new int[size*2];
			for(int i = 0; i < array.length; i++) {
				newArray[i] = array[i];
			}
			size = size * 2;
			array = newArray;
			for(int j : newArray) {
			System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}







 // This is the method which will call all the other methods here.
    public static void main(String[] args){
        // This is creation of objects
        Array obj = new Array();
		obj.add(1);
        obj.add(2);
        obj.add(3);
		//obj.pop();
		obj.resize();
		System.out.println("The array to String is " +obj.toString());
		System.out.println("The Size of new Array is " +obj.size());
      

    }
}


