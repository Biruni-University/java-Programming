**Programming Language – II**

**Project-1**

** **

**Due Date: 09/03/2022 23:59**

** **

**Mastermind Game using Java**



Given the present generation’s acquaintance with gaming and its highly
demanded technology, many aspire to pursue the idea of developing and
advancing it further. Eventually, everyone starts at the beginning. Mastermind
is an old code-breaking game played by two players. The game goes back to the
19th century and can be played with paper and pencil.

**Rules of the game**

Two players play the game against each other; let’s assume Player 1 and Player
2.

·        **Player 1**  plays first by setting a multi-digit number.

·        **Player 2**  now tries his first attempt at guessing the number.

·        If Player 2 succeeds in his first attempt (despite odds which are
highly unlikely) he wins the game and is crowned Mastermind! If not, then
Player 1 hints by revealing which digits or numbers Player 2 got correct.

·        The game continues till Player 2 eventually is able to guess the
number entirely.

·        Now,  **Player 2**  gets to set the number and Player 1 plays the
part of guessing the number.

·        If Player 1 is able to guess the number within a lesser number of
tries than Player 2 took, then Player 1 wins the game and is crowned
Mastermind.

·        If not, then Player 2 wins the game.

·        The real game, however, has proved aesthetics since the numbers are
represented by color-coded buttons.

For example:

** **

**Input:**

Player 1, set the number: 5672

Player 2, guess the number: 6502

**Output:**

+1            // For correct place of “2”

-2            // For incorrect places of “5” and “6”



Enter your next choice of numbers:

*

*

**Project Description**



Write a Java program which finds (and display them in the screen) the All
four-digit numbers which obeys the rule of the game.

For Completing the Whole Project please follows the ongoing tasks

1)     Generate a 1 dimentional array which has 10000 items in it.



2)     İf the index of the array obey the rules, then assign it “true” (as
boolean), otherwise false.



3)     For example



Array[12] should be false because it contains 2 digits.

Array[1291] should be false because there are two same digits.

Array[1209] should be true. Because all digits are different.



4)     Display the True values on the screen