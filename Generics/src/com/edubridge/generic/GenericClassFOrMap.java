package com.edubridge.generic;

class Dictionary<K,V>
{
	//where T defines any kind of Type-values
	K key;
	V value;
	void print(K key, V value)
	{
		this.key=key;
		this.value=value;
		System.out.println("The values is: "+key+" "+value);
	}
}
//driver class
public class GenericClassFOrMap {

	public static void main(String[] args) 
	{
		Dictionary<Character, String>obj= new Dictionary<>();
		obj.print('c',"cyclone");
		obj.print('d',"dynamic");

	}

}
