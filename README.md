## hands-on-tdd

Common repository for all TDD and Clean code practice sessions.


###Imp. Points from the discussions

Documenting for future reference.

#### Session 1: 23/12/2016
- Create new repository or branch for every problem.
- Write a summary about the commits in comments - also use words red, green, refactor terms...refactor shud be to make code clean and readable.
- do not think abt implementation in TDD approach. Think about smallest test first.
- Camel case is a convention for java classes, but we can use the new convention of small case and underscores for test class methods. The name of test case must be able to tell the reviewer what this case does.
- Dont use single letter variable names anywhere in the code.
- Avoid using Negation (!... not of)
- After every passing of step (GREEN), you should look at code and see if there is any opportunity to refactor
- Do not use native for loop in your code...(for int i=0; i<...; i++)
- DRY - Do not repeat yourself
- Start with smallest possible  number - in Fizz Buzz problem, start with 1, rather than 3.
- Avoid returing or passing nulls as much as you can.
- If there are more number of if statements, its time to refactor.
- Use static imports as much as possible.
- Dont over-engineer - for e.g. introducing large number of classes for a smaller functionality.


#### *Pending tasks*
- See Uncle Bob's [clean code book] (http://techbus.safaribooksonline.com/book/software-engineering-and-development/agile-development/9780136083238)
- Streams in Java 8
- Map : getOrDefault() -- Java 8 feature
