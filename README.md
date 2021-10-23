# IES_105648
a)Maven has three lifecycles: clean, site and default. Explain the main phases in the default lifecycle.
validate - validate the project is correct and all necessary information is available
compile - compile the source code of the project
test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed
package - take the compiled code and package it in its distributable format, such as a JAR.
verify - run any checks on results of integration tests to ensure quality criteria are met
install - install the package into the local repository, for use as a dependency in other projects locally
deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.

b)Maven is a build tool; is it appropriate to run your project to?
Maven is a build automation tool used primarily for Java projects. 
Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. 
The Maven project is hosted by the Apache Software Foundation, where it was formerly part of the Jakarta Project.

c)What would be a likely sequence of Git commands required to contribute with a new feature to a given project?
(i.e., get a fresh copy, develop some increment, post back the added functionality)
-git clone, git branch,git commit,git merge
There are strong opinions on how to write Git commit messages... Find some best practices online and give your own informed 
recommendations on how to write good commit messages (in a teamproject). 
-Commit messages need to be consistent and concise.Teams need to decide on a commit message convention
that fits with their style,content and metadata.There are some rules for git commit messages
and they are: capitalize the subject line, do not end the subject line with a period, limit the subject line to 50 characters, seperate 
subject body with blank line, use the body to explain what and why vs how and etc
E)Docker automatically prepares the required volume space as you start a container. Why is it important that you
 take an extra step configuring the volumes for a (production) database?
It is important to use databases because there is less clutter on your machine,
you can work on multiple projects side by side, you can create a development enviorment and
everything is documented through automation
