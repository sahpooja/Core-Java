package com.edubridge.equalmethod;

import java.util.Objects;

public class Site 
{
    private String name;
    private Integer Id;
    
    

	@Override
	public int hashCode() {
		return Objects.hash(Id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Site other = (Site) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(name, other.name);
	}
	public Site(String name, Integer Id)
    {
    	super();
    	this.name=name;
    	this.Id=Id;
    	
	}
	 public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getId() {
			return Id;
		}


		public void setId(Integer id) {
			Id = id;
		}

}
