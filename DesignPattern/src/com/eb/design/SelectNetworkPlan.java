package com.eb.design;

public class SelectNetworkPlan 
{
    public CellularPlan getPlan(String planType)
    {
    	if(planType==null) 
    	{
    		return null;
    	}
    	if(planType.equalsIgnoreCase("abcNetwork"))
    	{
    		return new abcNetwork();
    	}
    	else if(planType.equalsIgnoreCase("xyzNetwork"))
    	{
    		return new xyzNetwork();
    	}
		return null;
    	
    }
}
