package com.edubridge.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
/* program to demonstrate on @Mock annotation*/
class MockAnnotation 
{
	@Mock
	List<String>m1;
	
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setData()
	{
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void accept() 
	{
		when(m1.get(0)).thenReturn("pooja");
		Assertions.assertEquals(m1.get(0), "pooja");
	}

}
