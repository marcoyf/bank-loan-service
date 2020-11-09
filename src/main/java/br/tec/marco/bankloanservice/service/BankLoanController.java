/**
 * 
 */
package br.tec.marco.bankloanservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.tec.marco.bankloanservice.service.bean.BankLoan;

/**
 * @author marcoyf
 *
 */
@RestController
public class BankLoanController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private BankInterestRateServiceProxy proxy;
	
	@Autowired
	private PriceAmortizationMethodService priceAmortizationMethod;
	
	@GetMapping("/bank-loan/presentValue/{presentValue}/noOfInstallments/{noOfInstallments}/bankName/{bankName}")
	public BankLoan getPaymentAmount(@PathVariable double presentValue, 
			@PathVariable int noOfInstallments, 
			@PathVariable String bankName) {
		
		BankLoan response = proxy.retrieveBankInterestRate(bankName);
		
		logger.info("teste {}", response);
		
		double payment = priceAmortizationMethod
				.getPaymentAmount(presentValue, response.getInterestRate(), noOfInstallments);
		
		return new BankLoan(
				bankName, 
				response.getInterestRate(),
				presentValue, 
				payment);
	}

}
