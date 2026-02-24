Project 1
CSC 311 – Computer Programming II
Farmingdale State College
Computer Systems
Prof. Baci

Project Description: A Spelling Checker

Many apps you use daily have built-in spell checkers. In this project, you’re asked to develop your own spell-checker utility. We make suggestions to help get you started. You should then consider adding more capabilities. Use the provided file as a source of words.
Why do we type so many words with incorrect spellings? In some cases, it’s because we simply do not know the correct spelling, so we make a best guess. In some cases, it’s because we transpose two letters (e.g., “defualt” instead of “default”). Sometimes we double-type a letter accidentally (e.g., “hanndy” instead of “handy”). Sometimes we type a nearby key instead of the one we intended (e.g., “biryhday” instead of “birthday”), and so on.

Your application should ask a user to enter a word. The application should then look up that word in the wordList array. If the word is in the array, your application should print "Word is spelled correctly." If the word is not in the array, your application should print "Word is not spelled correctly." Then your application should try to locate other words in wordList that might be the word the user intended to type. For example, you can try all possible single transpositions such as “edfault,” “dfeault,” “deafult,” “defalut” and “defautl.” When you find a new word that matches one in wordList, print it in a message, such as
Did you mean "default"?
In order to find the correct closest matching word, use Levenshtain Distance Algorithm as described here, here and here.
Implement other tests, such as replacing each double letter with a single letter, and any other tests you can develop to improve the value of your spell checker.


Submission:
You are going to submit the following:
1.	The Dealer.txt file. Copy-paste the contents of Dealer.java into Notepad (Windows) or TextEdit (Mac) and save it as a simple .txt file.
2.	A link to a YouTube video where you recorded yourself talking about the project. The video must show your screen/code and your face, and it should not be longer than 5 mins. You must talk about the following points:
a.	A walkthrough of your code, demonstrating strong understanding of what you wrote and the logic you used in your code.
b.	Challenges you faced during the implementation and how you resolved those challenges.
c.	Aspects you could improve or new features you could add in the next version of the game.
3.	A simple (hand drawn if necessary) UML class diagram that describes the relationship between classes, and the instance variables and methods these classes encapsulate. It should be in a jpeg, jpg or png format.

Rubric:
Below you will find a general rubric that will be used for your grading. Use this general rubric as guideline for best practices to follow in your code.
Note: this is not the actual rubric. The actual rubric will be posted on Brightspace and it will be used to score your work.

Please make sure you:
1.	Comment (especially the parts that have complex logic) and indent properly. 
Note: comments do not have to be just 1 line, so do not constrain yourself.
2.	Clear logic. Spaghetti code will lose points
3.	Compiles and executes correctly.
