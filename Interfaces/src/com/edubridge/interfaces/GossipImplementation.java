package com.edubridge.interfaces;
/*Program to demonstrate on reference to a static method*/
public class GossipImplementation
{
   public static void ClassroomGossip()
   {
	   System.out.println("Implementing a Functional Interface");
   }
   public static void main(String []args)
   {
	   Gossip g= GossipImplementation::ClassroomGossip;
	   g.talk();
   }
}
