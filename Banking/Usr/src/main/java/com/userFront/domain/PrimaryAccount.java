package com.userFront.domain;

//karoche es iqneba mtavari acauntis pontshi 
//TODO aq ragac yleobebi geqneba kide dasamatebeli uewveli GitHub ze naxe ras itxoven

import java.math.BigDecimal;//es doubles jobs sizustit 
import java.util.List;

public class PrimaryAccount {
	private Long id;
	private int accountNumber;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}

	private BigDecimal accountBalance;
	
	private List<PrimaryTransaction> primaryTransactionList;
		
}
