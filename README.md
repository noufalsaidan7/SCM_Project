SCM Project

Software Configuration Management (SWE 442)
This project demonstrates key concepts of version control and release management using Git and GitHub.

Project Overview

A simple Java console application that includes:

Calculator: performs basic operations (addition, subtraction, multiplication, division) with error handling.

Unit Converter: converts between kilometers and miles, Celsius and Fahrenheit.

Text Utilities: reverses text and checks for palindromes.

Display Date & Time: shows the current date and time when the program runs.

Branches

feature1: Added display of current date and time.

feature2: Improved the banner and console messages.

conflict branches (A–D): Created to simulate and resolve merge conflicts.

Conflict Resolution

A manual merge conflict was created on the banner line and resolved in VS Code using:
Accept both changes

Releases

v1.0 – Initial Release: Added the base version of the SCM tool.

v1.1 – Merge Conflict Resolved & Updated Notes: Merged branches and updated release notes.

How to Run

From the root directory of the project, compile and run the program using:
javac -d out src/com/scmtool/*.java
& "C:\Program Files\Java\jdk-17\bin\java.exe" -cp out com.scmtool.App

Project Process

Multiple branches were created for new features and conflict simulations.

Pull requests were opened and merged into the main branch.

Tags and releases (v1.0 and v1.1) were created for version tracking.

Release notes and a final project report were added.
