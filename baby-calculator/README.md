# Baby Calculator
This project implements a simple calculator using stack in Java.

## What is Baby Calculator?
This project will make calculator called “BabyCalculator”, which only handles parenthesis and digits (0, 1, ..., 9) with only addition function using stack. Here are some examples.
- For input ‘123’, it means ‘1+2+3’.
- For input ‘(12(34)5)’, it means ‘(1+2+(3+4)+5)’.
- For input ‘12(2(02)2)’, it means ‘1+2+(2+(0+2)+2)

## Using Stack
**Stack** is one of the widely used data structures. It has two principle operations: push and pop. With these operations, the order of element come off a stack is also called LIFO (last in, first out).
- **Push**: Adds an element to the collection
- **Pop**: Removes the most recently added element that was not yet moved

Stack is useful when we calculate the sequence of numbers with parenthesis. For example, if we want to calculate (1 + 2 + 3) + (4 + 5), we need to evaluate (1 + 2 + 3) first then (4 + 5). Although the order of adding numbers does not affect the result, we need follow the order of operations anyway.

## Inputs and Outputs
Inputs consists of parentheses and digits, and you can assume inputs are always syntactically correct. BabyCalculator must follow LIFO order on adding numbers. BabyCalculator also holds a current value as previous result. It means the calculator add to the current value when a new polynomial is given.

This project has three java files, *LinkedList.java*, *LinkedStack.java*, *BabyCalculator.java*, and *Main.java*. 
The program accept inputs and print listed outputs. For example, when the example inputs are:
```
SET 5 // this sets the value of the calculator to 5
SHOW // this shows the current value of the calculator
ADD 134 // this adds 1, 3, and 4 to the calculator
CLEAR // this clears(sets the value to 0) the calculator
SET 2
EXIT // this shows the current value and exit the program
```
, the following outputs are:
```
VALUE SET TO 5
VALUE 5
5+4+3+1
RESULT 13
VALUE CLEARED
VALUE SET TO 2
FINAL VALUE 2
```
