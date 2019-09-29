# Lab1 Assignment
Lab assignments for the Software Engineering Management class

## Getting Started
*To run this program, open your terminal and type the following commands:*

**From within phase1 directory**
![Phase 1 Test](https://github.com/semo94/ENSE374/blob/master/lab1/phase1/test.png)

**From within phase2 directory**
![Phase 2 Test](https://github.com/semo94/ENSE374/blob/master/lab1/phase2/test.png)

## Discussion:

**Why or why not you use static variables and methods?**  
Static variables are shared among all the instances of the class so you don't need a class object in order to access static variables. This allows for better memory managment since there will be only one single copy available for you to use.

**How the design changed in phase 2?**  
Instead of having one generic class for saving accounts, two classes were created and stored in different packages. The first one calculates monthly compound interest while the second one handles biweekly compound interest. The Bank class was converted from being a hardcoded program to a user-interactive program. Running Bank class in phase 2 will allow the user to deposit money, choose investment period, and select the type of compound interest (Monthly or Biweekly). After user selection, the program will print the new calculated balance.

**What are the benefits and faults of the design with using the packages?**  
The benifits of using package is that it helps in organizing multiple modules. It helps in resolving naming conflicts when different packages have classes with the same names. Moreover, the access level (the encapsulation) of the packages helps in protecting data from being used by the non-authorized classes.
