package services;
import java.time.LocalDate;
import java.util.List;

import entities.*;

public interface IBillService {
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	public Bill removeBill(Bill bill);
	public Bill viewBill(Bill bill);
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate);
	public List<Bill> viewBills(String custId);
	public double calculateTotalCost(Bill bill);

}
