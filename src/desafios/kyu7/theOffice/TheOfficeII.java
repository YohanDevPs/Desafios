package desafios.kyu7.theOffice;

import java.util.HashMap;
import java.util.Map;

/**
 * Every now and then people in the office moves teams or departments.
 * Depending what people are doing with their time they can become more or less boring.
 * Time to assess the current team.
 *
 * You will be provided with an array of Person objects with each instance containing the name and department for a staff member.
 *
 * public class Person {
 *   public final String name;        // name of the staff member
 *   public final String department;  // department they work in
 * }
 * Each department has a different boredom assessment score, as follows:
 *
 * accounts = 1
 * finance = 2
 * canteen = 10
 * regulation = 3
 * trading = 6
 * change = 6
 * IS = 8
 * retail = 5
 * cleaning = 4
 * pissing about = 25
 *
 * Depending on the cumulative score of the team, return the appropriate sentiment:
 *
 * <=80: 'kill me now'
 * < 100 & > 80: 'i can handle this'
 * 100 or over: 'party time!!'
 *
 * **/


public class TheOfficeII {
    public static String boredom(Person[] staff) {
        Map<String, Integer> staffMapped = new HashMap<>();
        staffMapped.put("accounts", 1);
        staffMapped.put("finance", 2);
        staffMapped.put("canteen", 10);
        staffMapped.put("regulation", 3);
        staffMapped.put("trading", 6);
        staffMapped.put("change", 6);
        staffMapped.put("IS", 8);
        staffMapped.put("retail", 5);
        staffMapped.put("cleaning", 4);
        staffMapped.put("pissing about", 25);

        var sum = 0;
        for (Person person: staff) {
            sum += staffMapped.get(person.department);
        }

        if (sum <= 80) return "kill me now";
        if (sum < 100 && sum > 80) return "i can handle this";
        return "party time!!";
    }

    public class Person {
        final String name;    // team memnber's name
        final String department;  // happiness rating out of 10

        public Person(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }
}
