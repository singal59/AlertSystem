# Rule Based Alerting System
The Rule Based Alerting System takes patient's vital signs as input which are and formatted into a JSON-string by a patient-monitoring device. This application accepts this data via console-input. When a parameter goes out-of-range, an alert is generated on the console-output.

## Index
1. [Prerequisites](#Prerequisites)
2. [Compiling](#Compiling)
3. [Executing](#Executing)
4. [Class Diagram](#ClassDiagram)

## Prerequisites
Firstly, the project makes use of a batch file in order to build the source files and hence, the target system must have a Windows environment.
Then, the target system must have Java (>=1.7) installed and available in the system path.
The project makes use of Maven as the build tool and hence, Maven must also be in the system path.

## Compiling
In the root directory of the project, a batch file by the name "AutoBuildTest.bat" is present. 
Run the batch file in the command line and it will compile the sources and execute the test cases.  
```
./../AlertSystem> AutoBuildTest.bat
```  
Once the batch file has sucessfully executed, you should be able to see a `"build successful"` message.


## Execution
Once the batch file has been run, a binary will be put in the target folder and it will have the name "AlertSystem-1.0-jar-with-dependencies.jar".
In order to run the application, open the commandline and copy paste the below command.  
```
java -jar AlertSystem-1.0-jar-with-dependencies.jar
```  


## Class Diagram

![Class Diagram](./resources/classDiagram.png "Class Diagram")

# AlertSystem
