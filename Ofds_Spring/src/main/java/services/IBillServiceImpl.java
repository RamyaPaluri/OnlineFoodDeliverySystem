package services;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import entities.Bill;
import repositories.IBillRepository;

public class IBillServiceImpl implements IBillService {
	@Autowired
	IBillRepository repositories;

	@Override
	@Transactional
	public Bill addBill(Bill bill) {
		Bill b=null;
		b=repositories.addBill(bill);
		return b;
	}

	@Override
	@Transactional
	public Bill updateBill(Bill bill) {
		Bill b=null;
		b=repositories.updateBill(bill);
		return b;
	}

	@Override
	@Transactional
	public Bill removeBill(Bill bill) {
		Bill b=null;
		b=repositories.removeBill(bill);
		return b;
	}

	@Override
	@Transactional
	public Bill viewBill(Bill bill) {
		Bill b=null;
		b=repositories.viewBill(bill);
		return b;
	}

	@Override
	@Transactional
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate) {
		List<Bill> b=repositories.viewBills(startDate, endDate);
		return b;
	}

	@Override
	@Transactional
	public List<Bill> viewBills(String custId) {
		List<Bill> b=repositories.viewBills(custId);
		return b;
	}

	@Override
	public double calculateTotalCost(Bill bill) {
		double d=repositories.calculateTotalCost(bill);
		return d;
	}

}
