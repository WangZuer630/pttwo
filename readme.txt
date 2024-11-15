
# COMP2026/COMP2046 Practical Test

Quiz Date: 18/11/2023, 2:00pm-4:00pm





* Save all your work in one project. 
* For submission, zip the src folder and rename the zip file to "XXXXXXXX.zip" where "XXXXXXXX" is your student ID.  
  Submit this zip file to Moodle. 
* You should ensure that all your answers are included in the zip file you have submitted. 
  No submissions would be accepted after the end of the Practical Test. 
* The duration for this Practical Test is 2 hours. 
* This is an open-book, open-notes test. However only printed materials are allowed. No iPad/computer. 
  No sharing of notes.
* You are not supposed to make any communication with other people or open any webpage during the test. 
  Therefore, it is considered as violating an exam regulation if you are using a phone or opening a Chrome/Edge/Firefox.
* Total marks: 80 (no bonus this time) 
* ArrayList is allowed unless stated otherwise. 
* API that has been taught at Lab/Lecture can be used in all questions.
* You are allowed to add additional methods if you wish.
* Follow the output of the program as given by the sample.
* Warning: cheating in practical test fail the course directly and your case will be recorded by the University.


---


## Q1. Basic class and inheritance (30%)

Create a package q1 and put all the following classes inside this package.

Write a class name A1. This class should:
- have a private String called x.
- have one other constructor that takes a string as a parameter and set the value of it to x;
- have one copy constructor which copies all content from the parameter.
- have a toString method that returns x.


Write a class name A2. This class should:
- inherit from A1
- have a private static int called y, initially as 0.
- y will increase when each A2 object is created
- have a getter of y
- have one default constructor that sets x to your student name.
- have a toString method that returns "A2" followed by the value of x.


Write a class Main. This class has a public static void main that:
- create an array of A1 objects of size 3. Name this array as arr.
- the first element of arr is an A1 object with x = "A1-1".
- the second and third elements of arr are A2 objects constructed by default constructor.
- use a for-loop to print these objects. 


## Q2. Plant (20%)

We model how plants grow in this question. Plants can grow. Its length increases by 1 unit by default
when it grows. Each plant has a unique ID. RedBean and Cabbage are two different types of plant.

A RedBean grows faster. It increases its length by 2 units for each time it grows. However, when its length is 
more than 8 units, it dies and stops growing. When it dies, its length is 0 unit.

A Cabbage grows like a plant but it stops growing when it reaches length 5.

By studying the file Plant.java, add Cabbage.java and RedBean.java


## Q3. Rework for Picture (30%) 

By referring to Picture.java in the folder Ptest1, we want to recreate this task using OOP.

In PTest1, Picture is a program that reads a text file that contains a framed picture.

A frame is a one-character width border on all four-sides of a picture. The picture is read and placed 
inside a 2D array. The program also supports printing the picture with different frames. 

There is a Picture class, a Frame class, and a Q3 class. Look at the code in Q3.java. 

Create the classes in Picture.java and Frame.java. The expected output is given in Q3.java
