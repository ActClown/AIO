package com.mprs.aio.base;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mprs.aio.ApplicationTests;
import com.mprs.aio.base.model.SysUsers;
import com.mprs.aio.base.service.SysUsersService;

/**
* 类说明 
* @author Cary
* @date 2018年7月22日
*/
public class UsersTest extends ApplicationTests {

	@Autowired
    private SysUsersService sysUsersService;
	
	@Test
    public void testGetUsers(){
		SysUsers su= sysUsersService.getSysUsers(0);
		super.outprint("com.mprs.aio.base.model.SysUsers", su);
		
		
    }

}
