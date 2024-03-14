<h1>Overview</h1>
</hr>
<p>This is the BDD framework to test a particular web application or web pages. </br>
Technologies used: Selenium webdriver, TestNG testing framework, Cucumber, etc with java progamming.</p>
<h3>Follow the following steps to run the test cases:</h3>
<hr>
<ul>
  <li>NOTE: Eclipse IDE is preferred | You need to install Cucumber in the Eclipse | You need to install TestNG in Eclipse.</li>
  <li>Clone the repository into your local repository.</li>
  <li>After importing it to your local workspace you can run the program through TestRunner.java class or through feature.feature file</li>
  </ul>
<hr>
<h3>STEPS FOLLOWED TO CREATE THE FRAMEWORK</h3>
</hr>
<p>(Note: Framework is created based on the requirements of the assignment. i.e Some additional packages and files can be added based on the requirements of the tests.)</p>
<ol>
  <li>Create a maven project and mention groupID and artifaceID</li>
  <li>After this some default folders will be generated at the project level. Among these 'pom.xml' is the main file of our maven project where we will be adding all the required 
  dependencies for our project.</li>
  <li>Dependencies: Selenium java dependency, Cucumber dependencies, TestNG dependency, common IO dependency, etc.</li>
  <li>At the project level we are creating AllFeatureFiles folder to store feature files in which we will be writing scenarios with the help of Gherkin keywords. Gherkin keywords allow us 
  to write scenarios in plain English language.</li>
  <li>After running this feature file it gives us snippets for the step definitions. These snippets are used to create step definition methods inside the step definition file.</li>
  <li>The framewok is implemented through different layer:</li>
  <li>Inside src/main/java we have baseLayer( Containing BaseClass which is going to act as a parent class for most of the classes in the framework.)
  PageLayer(in which class files will be created for each of the pages that we are going to test. Here we have created classes for HomePage, Our story page, our solutions page, 
  Why tendable? page , contact us page ? and to fill the form.
  In this we are creating the object repository which will be created by finding out all the element on that respective page and then initialising the repository and assigning methods
  for each of the object. And we're doing this with the help of POM with page factory.
  These method are going to be called inside the step definitions in step definition files by creating the object of these page classes.</li>
  <li>Utility layer: which containd class files in which we are writing the reusable code which is going to be called wherever required in the project files. For that purpose we are creating
  static method in these utility layer's class files.</li>
  <li>Inside src/test/java we are creating stepDefinitions package which will contain step definition files. We are also creating testRunner package to contain TestRunner class which will 
  be used to run our project code. While running the project choose the TestNG option.</li>
</ol>
<hr>
<p>[ Here we are taking a screenshot after detecting any defect or bug. ( Insteading of creating a word file to report a bug. ) This same screenshot can also be attached with
the extent report( in html as well as PDF format> which is shared with the team leader.]</p>
<hr>
