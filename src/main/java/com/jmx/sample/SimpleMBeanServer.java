package com.jmx.sample;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class SimpleMBeanServer {

    public static void main(String[] args) {
       try {
           //Creating MBeanServer
           MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();

           //Stating type of MBean
           ObjectName objectName = new ObjectName("com.jmx.sample:type=Player");

           //Creating MBean
           Player player = new Player("Messi", "Barcelona");

           //Register MBean with MbeanServer
           mBeanServer.registerMBean(player, objectName);

           System.out.println("MBeanServer is running...");
           Thread.sleep(System.currentTimeMillis());
       } catch (Exception ex) {
           System.out.println("Exception here " + ex);
       }
    }

}
