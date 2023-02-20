# Sample-JMX-Application

This os a sample JMX  application which is used to understand how JMX works.

# Q) What is JMX?
Ans: JMX stands for Java management extensions.It is used for managing/monitoring Java applications.
     It is used for communicating with local and also remote Java processes.

JMX has 3 most important components:

i) MBean: MBean is a Java object with implements the MBean Interface.This is the object which can be monitored/manipulated by JMX Client.

ii) MBeanServer: All MBeans are registered with MBeanServer.

iii) JMX Client: JMX Client (Jconsole)  is used to communicate with MBeanServer.

Run this application by:
java -jar jmxsamplecode/target/jmx-sample-code-1.0-SNAPSHOT.jar 
 
