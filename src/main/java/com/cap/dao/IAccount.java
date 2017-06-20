package com.cap.dao;

import com.cap.model.Account;

public interface IAccount {
	public void addAccount(String log, String pass, int i);

	public void addAccount(Account account);

	public Account authentificate(String log, String pass);
}
