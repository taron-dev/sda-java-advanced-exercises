# Comparator

1. Create the `Person` class:
   - The class should have three attributes:
       - String name
       - int age
       - double height

   - Include a constructor to initialize these attributes.
   - Add `toString()` to print the `Person` in a readable format, e.g., `Person{name='John', age=25, height=175.5}`.

2. Create Comparators:
   - Write three different Comparator classes to sort a list of Person objects:
     - `NameComparator`: Sort by name in alphabetical order.
     - `AgeComparator`: Sort by age in ascending order.
     - `HeightComparator`: Sort by height in ascending order.
3. Test the Code
   - create list of Persons and sort them using comparator

4. Use lambda expressions:
   - Use lambda expressions to perform the same sorting (by name, age, and height) without explicitly implementing Comparator classes.