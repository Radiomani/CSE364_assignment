// this is for window
setx JAVA_HOME "C:\Program Files\Java\jdk-1.8"
setx RANDOOP "C:\Users\Admin\Desktop\CSE364_individual_assignment\randoop-4.3.2\randoop-all-4.3.2.jar"
setx EVOSUITE "C:\Users\Admin\Desktop\CSE364_individual_assignment\evosuite\evosuite-1.0.6.jar"
setx EVOSUITE_RUNTIME "C:\Users\Admin\Desktop\CSE364_individual_assignment\evosuite\evosuite-standalone-runtime-1.0.6.jar"
setx JUNIT "C:\Users\Admin\Desktop\CSE364_individual_assignment\junit\junit-4.11.jar"
setx JACOCOAGENT "C:\Users\Admin\Desktop\CSE364_individual_assignment\jacoco\org.jacoco.agent-0.8.10-runtime.jar"
setx JACOCOCLI "C:\Users\Admin\Desktop\CSE364_individual_assignment\jacoco\org.jacoco.cli-0.8.10-nodeps.jar"
setx LUT "C:\Users\Admin\Desktop\CSE364_individual_assignment\library_under_test"
setx TARGET_CLASS "org.apache.commons.lang3.StringUtils"
setx TARGET_CLASSPATH "%LUT%\target\classes"
setx PWD "C:\Users\Admin\Desktop\CSE364_individual_assignment"
set PWD = C:\Users\Admin\Desktop\CSE364_individual_assignment
// =================below is for linux
# Path to dependent libraries
export JAVA_HOME=/your/java/home/path
export PWD =C:\Users\Admin\Desktop\CSE364_individual_assignment

export RANDOOP=${PWD}/randoop-4.3.2/randoop-all-4.3.2.jar
export EVOSUITE=${PWD}/evosuite/evosuite-1.0.6.jar
export EVOSUITE_RUNTIME=${PWD}/evosuite/evosuite-standalone-runtime-1.0.6.jar
export JUNIT=${PWD}/junit/junit-4.11.jar
export JACOCOAGENT=${PWD}/jacoco/org.jacoco.agent-0.8.10-runtime.jar
export JACOCOCLI=${PWD}/jacoco/org.jacoco.cli-0.8.10-nodeps.jar
 
export LUT=${PWD}/library_under_test
export TARGET_CLASS= org.apache.commons.lang3.StringUtils
export TARGET_CLASSPATH=${LUT}/target/classes

C:\Users\Admin\Desktop\CSE364_individual_assignment\evosuite\evosuite-1.0.6.jar

// move to the file

cd %LUT%/src/test/evosuite
# Compile generated test files.
// from chat gpt
javac -classpath %TARGET_CLASSPATH%;%EVOSUITE_RUNTIME%;%PWD%\evosuite-tests;%JUNIT% evosuite-tests\org\apache\commons\lang3\*.java

# Compile generated test files.
javac -classpath ${TARGET_CLASSPATH}:${EVOSUITE_RUNTIME}:${PWD}/evosuite-tests:${JUNIT} \
evosuite-tests/org/apache/commons/lang3/*.java

*/

# Run compiled tests. It will report lots of failures.
# You should find a real bug among them by manually checking each unit test.

java -classpath ${TARGET_CLASSPATH}:${EVOSUITE_RUNTIME}:${PWD}/evosuite-tests:${JUNIT} \
-javaagent:${JACOCOAGENT} org.junit.runner.JUnitCore ${TARGET_CLASS}_ESTest

// chat gpt suggest command
java -classpath %TARGET_CLASSPATH%;%EVOSUITE_RUNTIME%;%PWD%\evosuite-tests;%JUNIT% -javaagent:%JACOCOAGENT% org.junit.runner.JUnitCore %TARGET_CLASS%_ESTest
// trial

java -classpath %TARGET_CLASSPATH%;%EVOSUITE_RUNTIME%;%PWD%\evosuite-tests;%JUNIT% -javaagent:%JACOCOAGENT% org.junit.runner.JUnitCore org\apache\commons\lang3\StringUtils_ESTest

// go to the directory
cd %LUT%/src/test/randoop