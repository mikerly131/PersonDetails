package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }
    
    public String whileLoop() {


        String result = "";
        // create a `counter`
        int countLoops = 0;

        // while `counter` is less than length of array
        while (countLoops < this.personArray.length) {

            // use `counter` to identify the `current Person` in the array
            Person currentPersonStr = this.personArray[countLoops];
            // append `stringRepresentation` to `result` variable
            result = String.format("%s%s", result, currentPersonStr);
            // end loop
            countLoops++;
        }
        return result;
    }



    public String forLoop() {

        String result = "";

        // identify initial value - 0
        // identify terminal condition - i < array length
        // identify increment - by 1

        // use the above clauses to declare for-loop signature
        for (int i = 0; i < this.personArray.length; i++) {

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = this.personArray[i];
            // get `string Representation` of `currentPerson`
            result = String.format("%s%s", result, currentPerson);
        }
        // end loop
        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type - Person
        // identify array's variable-name - person

        // use the above discoveries to declare for-each-loop signature
        for ( Person person : this.personArray ) {
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            result = String.format("%s%s", result, person);
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
