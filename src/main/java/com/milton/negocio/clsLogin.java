package com.milton.negocio;

import com.milton.entidades.Login;

public class clsLogin {

	public int acceso(Login log)
	{
		int acess = 0;
		
		if(log.getUser().equals("Joshua") && log.getPass().equals("123"))
		{
			acess = 1;
		}
		
		return acess;
	}
}
