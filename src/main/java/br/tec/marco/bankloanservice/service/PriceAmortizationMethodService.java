/**
 * 
 */
package br.tec.marco.bankloanservice.service;

import org.springframework.stereotype.Service;

/**
 * @author marcoyf
 *
 */
@Service
public class PriceAmortizationMethodService {
	
	/**
	 * Returns the payment amount for the supplied {@code presentValue}, 
	 * {@code interestRate} and {@code noOfInstallments}.
	 * 
	 * @see https://pt.wikipedia.org/wiki/Tabela_Price
	 * 
	 * @param presentValue the present value.
	 * @param interestRate the interest rate.
	 * @param noOfInstallments the number of installments.
	 * @return the payment amount.
	 */
	public double getPaymentAmount(double presentValue, 
			double interestRate, int noOfInstallments) {
		
		return presentValue * (
				(Math.pow(1 + interestRate, noOfInstallments) * interestRate)
				/
				(Math.pow(1 + interestRate, noOfInstallments) - 1)
				);
	}
	
	public static void main(String[] args) {
		System.out.println(new PriceAmortizationMethodService().getPaymentAmount(1000, 0.03, 4));
	}

}
