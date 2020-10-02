# Github-workflow assignment

## DUE: 19 Jan 2017

## Instructions:
***NOTE:-***
This assignment has a dual purpose. 1. To test the Git workflow procedures for completing assignments this semester and 2. To refresh your knowledge of basic Java principles. I have included a simple Java "HelloWorld" project for you to edit, commit, and push from your local computer. NOTE: If you plan to use Git through Android Studio rather than the command line, I highly recommend you download and use [IntelliJ](https://www.jetbrains.com/idea/) for this assignment. Android Studio is built off of IntelliJ and the procedures will be the same for your Android projects.

### TODO:
1. Open IntelliJ and create a Java project named github-workflow-\<yourLastName\>.
2. Create a .gitignore file and put [contents](#.gitignore) in it.
3. Create a README.md and put '\#README' in it.
4. VCS -> Import into Version Control -> Share Project on GitHub. Use 'Initial Commit' as commit message.
5. Verify files were uploaded to your GitHub account.
6. Java refresh: Refactor the mini-Java project. 
 * Add to the provided project a simple pet store. Limit what the store sells to just pets. Each pet type should be its own class as well as the actual pet store. The pet store should have methods of selling and buying pets. There should also be a way to see what pets are available for purchase, so some sort of simple inventory should be kept. You should make at least three different animals types. You MUST have at least one superclass. Main.java should be the entry point and should print out the inital contents of the pet store. Also include a printout of your methods in action, such as buying a cat and showing the inventory with the new cat quantity. Feel free to make the program interactive with a user, but there are no extra points for this. There are, HOWEVER, extra points for working jUnit tests that exercise your methods in the pet store.
 
 When you are complete with your project, commit and push files to GitHub. VCS -> Commit Changes
 
 ***Note:-***
  Any issues you have with either the GitHub steps or Java questions should be asked publically in Piazza. If you have a question, chances are someone else does also. If you see someone has posted a question on Piazza and you know the answer, please chime in and answer. This might seem rough at the beginning, but I promise it will get easier.

# .gitignore

.idea/workspace.xml

.idea/tasks.xml

.idea/dataSources/

.idea/dataSources.ids

.idea/dataSources.xml

.idea/dataSources.local.xml

.idea/sqlDataSources.xml

.idea/dynamic.xml

.idea/uiDesigner.xml

.idea/gradle.xml

.idea/libraries

.idea/mongoSettings.xml

*.iws

/out/

.idea_modules/

atlassian-ide-plugin.xml

com_crashlytics_export_strings.xml

crashlytics.properties

crashlytics-build.properties

fabric.properties

*.iml

modules.xml

.idea/misc.xml

*.ipr

compiler.xml

profiles_settings.xml

vcs.xml
