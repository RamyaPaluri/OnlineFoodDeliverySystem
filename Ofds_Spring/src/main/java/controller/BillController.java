package controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Bill;
import services.IBillService;

@RestController
@RequestMapping("/api")
public class BillController {
	@Autowired
	private IBillService Repositories;
	@RequestMapping("/addBill")
	public Bill addBill(@RequestBody Bill bill) {
		Bill b = Repositories.addBill(bill);
		return b;
	}
	@RequestMapping("/updateBill")
	public Bill updateBill(@RequestBody Bill bill) {
		Bill b=Repositories.updateBill(bill);
		return b;
	}
	@RequestMapping("/removeBill")
	public Bill removeBill(@RequestBody Bill bill) {
		Bill b=Repositories.removeBill(bill);
		return b;
	}
	@RequestMapping("/viewBill")
	public Bill viewBill(@RequestBody Bill bill) {
		Bill b=Repositories.viewBill(bill);
		return b;
	}
	@GetMapping("/viewBills()")
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate){
		List<Bill> b = Repositories.viewBills(null, null);
		return b;
	}
	@GetMapping("/viewBills()")
	public List<Bill> viewBills(String custId){
		List<Bill> b = Repositories.viewBills(null);
		return b;
	}
	@RequestMapping("/calculateTotalCost")
	public double calculateTotalCost(@RequestBody Bill bill) {
		double d=Repositories.calculateTotalCost(bill);
		return d;
	}
	
}