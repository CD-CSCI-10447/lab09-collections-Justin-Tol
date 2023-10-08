package edu.desu.collections.partA;
import java.util.ArrayList;

public class ArrayListBasics {
    // HINT: Initialize and return an empty ArrayList of integers.
    public ArrayList<Integer> createArrayList() {
        return new ArrayList<Integer>();
    }

    // HINT: Utilize the 'addAll' method of the ArrayList or a loop to add
    // the provided elements to the given list.
    // Return the updated list after adding the elements.
    public ArrayList<Integer> addElements(ArrayList<Integer> list, int... elements) {
        for (int element: elements) {
            list.add(element);
        }
        return list;
    }

    // HINT: Traverse through all elements in the list and build a string
    // representation using spaces between numbers.
    // Consider using StringBuilder or a loop for this.
    // The format should be like: "1 2 3 " (Note the trailing space).
    public String printArrayList(ArrayList<Integer> list) {
        String output = "";
        for (int element = 0; element < list.size(); element++){
            output += list.get(element).toString();
        }
        StringBuilder answer = new StringBuilder(output);
        for (int i = 1; i <= output.length()*2; i = i + 2){
            answer.insert(i, ' ');
        }
        return answer + "";
    }

    // HINT: Use the 'remove' method of the ArrayList to remove the element
    // at the given index from the list.
    // Return the updated list after removing the element.
    public ArrayList<Integer> removeElement(ArrayList<Integer> list, int index) {
        list.remove(index); return list;
    }
}
