package bookStoreDataSource;

import javax.swing.JFormattedTextField.AbstractFormatter;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import bookStoreEntity.Book;

public class BookDatasource {

	public static Book[] books = { new Book(1, "Gone with the wind", "9780582418059", "Margaret Mitchell", 2008, 2),
			new Book(2, "Atomic Habits", "9780735211292", "James Clear", 2018, 2),
			new Book(3, "Inspired", "9781119387503", "Marty Cagan", 2017, 2) };
	
}

