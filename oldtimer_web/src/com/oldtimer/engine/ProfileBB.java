package com.oldtimer.engine;

import javax.ejb.EJB;
import javax.inject.Inject;

import com.jsf.dao.UserDAO;
import com.oldtimer.login.LoggedBB;

public class ProfileBB {

@EJB
UserDAO userDAO;
	
@Inject
LoggedBB loggedBB;
	
	String nick = loggedBB.getNick();
}