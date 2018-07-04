# Grading Program

## What is grading program?
Mr. Jun works as a teacher at a university. He organizes student’s midterm grades. He needs to put student’s grades when he completes grading. Also, grades can be discarded if the students drop the course. He wants to find the grade of the students when some students ask for their grades. To manage midterm grades of students efficiently, he wrote down the information such as the student’s name and the grade of a student on a paper.

However, he is suffering from maintaining the student list and searching for grades based on the list as the number of students increases. Hence, he decided to hire you to resolve this problem using a computer. Your main mission is to help him by constructing a search system, which is called **GradeSearch** supporting tasks related to students in the system. The basic requirements of GradeSearch are as follows:
- In GardeSearch, the information of the grade is stored in forms of a key- value pair. The key is the student’s name, and the value is the grade of the student.
- For a student, Mr. Jun needs to be able to find the grade of the student using GradeSearch with the student name.
- Mr. Jun needs to be able to add or delete the information of students using GradeSearch.
- If Mr. Jun tries to search for or delete a student, and there is no student with the name, GradeSearch should print the message “GradeSearch cannot find the student”.
- The operations of GradeSearch should be fast to cover a lot of students in the system.

He also requested special types of search as follows:
- Order search: GradeSearch should list all students’ names and grades in lexicographical order.
- First/Last search: GradeSearch needs to be able to find the first or last 4
student in lexicographical order.
- Range search: when two student names are given such as “bob” and “harry”, it should search for all students whose names are between “bob” and “harry” in lexicographical order. If GradeSearch contains “bob” and “harry”, it also needs to find those students in the range.

Here are several assumptions for clarity.
- In the system, the student names are distinct. There is no duplicate of a student name.
- All student names are in lower case. Also, the student names do not have a white space.
- GradeSearch should be based on Binary Search Tree.
- Of course, you need to consider that the system contains a lot of students.

## Inputs and outputs

This project consists of three files, *GradeSearch.java*, *BinaryTree.java*, and *Main.java*. 
Inputs follow these rules: 
```add (name) (grade) ``` adds the name and grade in the grading system.
```remove (name) ``` removes the person (name) from the system.
```get (name)``` prints the name and grade of the person.
```size``` prints the size of the list(or the number of the students in the system).
```order``` prints the list of students' name and grade, sorted by the grade.
```first``` prints the name and grade of the person who's got the highest score.
```last``` operates in the opposite way, it prints the name and grade of the person who's got the lowest point.
```range (from) (to)``` prints the number of students got the grade between ```(from)```'s score to ```(to)```'s score.
