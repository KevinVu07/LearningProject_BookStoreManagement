package bookStoreMain;

import bookStoreEntity.BorrowRecord;
import oop.abstraction.School;
import oop.abstraction.SchoolDataSource;
import oop.abstraction.User;
import bookStoreDataSource.BorrowRecordDatasource;
import bookStoreDataSource.CustomerDatasource;
import serviceFunctions.ShowBorrowList;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		

		List<BorrowRecord> borrowList = ShowBorrowList.getBorrowListByCustomerId(1, BorrowRecordDatasource.borrowRecords);
		
		for (BorrowRecord borrowRecord : borrowList) {
			System.out.println("The customer is borrowing " + borrowList.get(1));
		}

	}

}
