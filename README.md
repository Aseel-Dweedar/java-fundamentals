# **java-fundamentals**

## **Files contained within the repo:**

## 1. Basics.

### methods contained within the file:

#### **Main :**

- **_pluralize_** : Method that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.

- **_flipNHeads_**: Method that accepts an integer n and flips coins until n heads are flipped in a row. flipping a coin by choosing a random number between 0 and 1. Numbers below `.5` are considered tails. Numbers at and above `.5` are considered heads.

- **_clock_**: Method that print out the current time to the console, second by second.

## 2. Basicslibrary.

### methods contained within the file:

#### **Main :**

- **_roll_**: method called roll that accepts an integer n and rolls a six-sided dice n times. return an array with the values.

- **_containsDuplicates_**: Method returns true or false depending on whether the array contains duplicate values.

- **_average_**: Method that accepts an array of integers and calculates and returns the average of all the values in the array.

- **_lowAverage_** : Method that accept array of arrays and calculate the average value for each array and return the array with the lowest average.

- **_analyzingWeatherData_**: Method that find the min and max values of array of arrays input. keep track of all the unique temperatures seen. create a String containing any temperature not seen during the month. Return that String.

- **_tally_** : Method that accepts a List of Strings representing votes and returns one string to show what got the most votes.

## 3. linter.

### methods contained within the file:

#### **Main :**

- **_linter_**: method that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon. with some exceptional cases:
  - if the line is empty.
  - if the line ends with an opening .curly brace {.
  - if the line ends with an closing curly brace }.
  - if the line contains if or else.

## 3. inheritance.

### Classes contained within the file:

#### **Restaurant :**

- **_Fields_**: name , stars, price , review.

- **_methods_**:
  - Restaurant: constructor to assign the name.
  - setPrice : calculate the price (number of dollar sing).
  - setStars : calculate rating.
  - addReview : add the new review to the restaurant and calculate the new rating.
  - getter methods : to get the values of the restaurant.

#### **Review :**

- **_Fields_**: body , author, numberOfStars.

- **_methods_**:
  - Review: constructor to assign the values.
  - getter methods : to get the values of the restaurant.
