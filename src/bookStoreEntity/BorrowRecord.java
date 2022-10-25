package bookStoreEntity;

import java.util.Date;

public class BorrowRecord {
	private int bookId;
	private int customerId;
	private String borrowedDate;
	private String returnDueDate;
	private String returnedDate;
	private String status;
	
	public BorrowRecord() {
		// TODO Auto-generated constructor stub
	}

	public BorrowRecord(int bookId, int customerId, String borrowedDate, String returnDueDate, String returnedDate,
			String status) {
		super();
		this.bookId = bookId;
		this.customerId = customerId;
		this.borrowedDate = borrowedDate;
		this.returnDueDate = returnDueDate;
		this.returnedDate = returnedDate;
		this.status = status;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(String borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public String getReturnDueDate() {
		return returnDueDate;
	}

	public void setReturnDueDate(String returnDueDate) {
		this.returnDueDate = returnDueDate;
	}

	public String getReturnedDate() {
		return returnedDate;
	}

	public void setReturnedDate(String returnedDate) {
		this.returnedDate = returnedDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
