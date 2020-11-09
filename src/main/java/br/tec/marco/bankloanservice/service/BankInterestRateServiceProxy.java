/**
 * 
 */
package br.tec.marco.bankloanservice.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.tec.marco.bankloanservice.service.bean.BankLoan;

/**
 * @author marcoyf
 *
 */
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "bank-interest-rate-service")
public interface BankInterestRateServiceProxy {
	
	@GetMapping("/bank-interest-rate-service/bank-interest-rate/bankName/{bankName}")
	public BankLoan retrieveBankInterestRate(@PathVariable String bankName);

}
