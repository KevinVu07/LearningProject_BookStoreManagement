package serviceFunctions;

import java.util.ArrayList;
import java.util.List;

import bookStoreEntity.BorrowRecord;

public class ShowBorrowList {
	public static List<BorrowRecord> getBorrowListByCustomerId(int customerId, BorrowRecord[] borrowRecords) {
		List<BorrowRecord> list = new ArrayList<BorrowRecord>();

		for (BorrowRecord borrowRecord : borrowRecords) {
			if (borrowRecord.getCustomerId() == customerId) {
				list.add(borrowRecord);
			}
		}
		return list;
	}
}
