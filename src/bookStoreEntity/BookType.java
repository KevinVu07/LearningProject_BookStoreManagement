package bookStoreEntity;

public class BookType {
	private int bookId;
	private int typeId;
	
	public BookType() {
		// TODO Auto-generated constructor stub
	}

	public BookType(int bookId, int typeId) {
		super();
		this.bookId = bookId;
		this.typeId = typeId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	
	
}
