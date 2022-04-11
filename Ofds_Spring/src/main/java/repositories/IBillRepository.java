package repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entities.Bill;

@Repository
public interface IBillRepository extends JpaRepository <Bill,String>{
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	@Query("Remove from Bill where bill=:bill")
	public Bill removeBill(Bill bill);
	public Bill viewBill(Bill bill);
	public List<Bill> viewBills(LocalDate startDate, LocalDate endDate);
	public List<Bill> viewBills(String custId);
	public double calculateTotalCost(Bill bill);	
	
}

	