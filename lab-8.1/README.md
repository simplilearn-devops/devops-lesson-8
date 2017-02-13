# Exercise 8.1 Java Profiling

Look at Java profiling.

### Step 1

Start your Google Compute Engine virtual machine and connect to it using SSH.

Clone the Git repository for this lesson.  
`cd`  
`git clone https://github.com/simplilearn-devops/devops-lesson-8`  

### Step 2

Change to the code directory.  
`cd devops-lesson-8/DevOps`  

Look at the code.  
`cat src/devops/threads/Counter.java`  
`cat src/devops/threads/CounterThread.java`  

We are going to manually compile the example code.  
`ls bin`  
`javac -d bin src/devops/threads/*`  
`find bin`  

Run the code. It will produce an unexpected result due to a thread conflict.  
`java -cp bin devops.threads.CounterThread`

### Step 3

Java has a profiler called hprof. See what options are available.  
`java -agentlib:hprof=help`  

Run the code again with the profiler enabled.  
`java -agentlib:hprof  -cp bin devops.threads.CounterThread`

Take a look at the output file. In less use space to page forward, b to
page backwards and q to quit.  
`less java.hprof.txt`

### Step 4

Tidy up.  
`rm java.hprof.txt`
`rm -rf bin/*`  

