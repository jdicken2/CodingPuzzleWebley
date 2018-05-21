# CodingPuzzleWebley (Version 1.0)
-------------------------------------------------------------------
Author and Date
-------------------------------------------------------------------
1. Author: Julian Dickens
2. Date: 05/21/2018

Summary
-------------------------------------------------------------------
My solution to Webley's Coding Puzzle. The application takes the numbers given from the data file and lists all possible combinations that can be made from adding those numbers, and having them equal to the target price.

Configuration Instructions (Linux, Ubuntu 16.04)
------------------------------------------------------------------
1. Install and Verify Java
	i.$sudo apt-get install default-jre
	ii.$java-version

Deploy Instructions
------------------------------------------------------------------
1. Pull from the repository
2. Cd into the project folder
3. Type javac solution.java into the Command Line to compile
4. Type java solution to Deploy the program with the initial data provided in the program description.
5. Either change the data in the data.csv file or change the file in the File parameters in Line 59 to test other data

Known Bugs
----------------------------------------------------------------
1. The program does not display a message if there are no combinations
2. The program does not include the last number in the list on occasion  

Future Improvements
------------------------------------------------------------------
1. Create a python version of this application
2. List the description of the dishes alongsided the prices
3. Create error classes to have improved error handling
4. Display a message if there are no combinations

Credits and Acknowledgements
-----------------------------------------------------------------
Credits
1. Stack Overflow for assistance with the Recursive Algorithim
https://stackoverflow.com/questions/4632322/finding-all-possible-combinations-of-numbers-to-reach-a-given-sum


