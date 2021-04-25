# Project Report

Hailey Leonard

## Challenge #1 Complete

For Challenge #1, I switched the code in the QueryEngineModule class so
that the QueryEngine class was bound to WikipediaQueryEngine class, instead
of binding the QueryEngine class to the FakeQueryEngine class. 

## Challenge #2 Complete

For Challenge #2, I added a RevisionInterface, and a RevisionFormatterModule
class. In the RevisionFormatterModule, I bound the RevisionInterface to the
RevisionFormatter class. I then added an injection in the App class for the
RevisionFormatterModule. To make the formatter easier to read, I edited the
current RevisionFormatter to split up the date and time, and remove any
unnecessary letters, so it now reads "On [date] at [time], a change was made
by [user]".

## Challenge #3 Complete

For Challenge #3, I first removed the StringBuilder because it was unnecessary.
I then called stream() on the revisions, and used the map() function to format
the stream entries. Then, I used the joining() method from Java collectors to 
concatenate the results into a string, with a delimiter of "\n" to separate the
entries onto a new line. I then moved this new line into the existing outputArea.setText()
method.

## Reflection Question #1: Functional vs OO

The iterative approach to string concatenation is definitely longer, but in my
opinion, is much easier to follow. This approach uses StringBuilder, and iterates
through a loop that formats the message, adds it to the string, and then goes
to a new line in each loop iteration. The functional approach is much more fluid,
and does the entire thing in less steps. The functional approach streams the
approaches, formats them, and then adds them to a string with "\n" as a delimiter
to put each revision on a new line. This approach is more fluid, but in my opinion,
is harder to follow. I personally prefer the iterative approach because I feel 
that I can see what is happening in each step for each revision, and how they are
being added to the string. In the functional approach, I feel that it requires a 
deeper understanding of java principles, such as stream and collections, and I 
think that I understand the iterative approach a bit easier. 

## Reflection Question #2: Polymorphism and Dependency Inversion


Polymorphism caused dependency inversion in this application through the both
the Query engines and the Revision formatters. By overriding the configurations
in both the QueryEngineModules and RevisionFormatterModule, polymorphism is
present. These modules then allow for the injection of dependencies into the
App class, which then allows for the dependency inversion by injecting these
dependencies here at runtime instead of following the flow of execution.

