
package com.mongodb.builder;

import com.mongodb.domain.Account;

/**
 * Builder for Account class
 *
 * @author mlipski
 */
public class AccountBuilder extends Builder<Account> {

	Account account;

	public AccountBuilder() {
		this.account = new Account();
	}

	public AccountBuilder withId(String id) {
		account.setId(id);
		return this;
	}

	public AccountBuilder withAccountNumber(String accountNumber) {
		account.setAccountNumber(accountNumber);
		return this;
	}

	public AccountBuilder with(Account.Type accountType) {
		account.setAccountType(accountType);
		return this;
	}

	public Account build() {
		return account;
	}
}
