package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entites.LoanApprovalDepartment;
import com.capgemini.repository.ILoanApprovalDepartmentRepository;
import com.capgemini.services.ILoanApprovalDepartmentService;
import com.capgemini.services.LoanApprovalDepartmentService;

@RestController
@RequestMapping("/server/lad/")
public class LoanApprovalDepartmentController {

	@Autowired
	ILoanApprovalDepartmentRepository iloanApprovalDepartmentRepositorry;
	@Autowired
	ILoanApprovalDepartmentService iloanApprovalDepartmentService;
	@Autowired
	LoanApprovalDepartmentService loanApprovalDepartmentService;
	
	
	@GetMapping("/validatingFinanceOfficer/{username}/{password}")
	public ResponseEntity<Boolean> isValidFinanceOfficer(@PathVariable String username,@PathVariable String password) {
		return new ResponseEntity<>(loanApprovalDepartmentService.isValidFinanceOfficer(username, password),HttpStatus.OK);
	}
	@PostMapping("/addofficer")
	public String addOfficer(@RequestBody LoanApprovalDepartment loanApprovalDepartment){
		loanApprovalDepartmentService.addofficer(loanApprovalDepartment);
		return "officer Added";
			
	}
	
}

