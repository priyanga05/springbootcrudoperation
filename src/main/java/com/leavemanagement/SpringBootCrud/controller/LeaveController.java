package com.leavemanagement.SpringBootCrud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leavemanagement.SpringBootCrud.bean.Leave;

import com.leavemanagement.SpringBootCrud.service.LeaveService;

@RestController
@RequestMapping("/leavemanagement")
public class LeaveController {
   @Autowired
	private LeaveService leaveService;
	@GetMapping("/leave")
	public Iterable<Leave> getAllLeave()
	{
		return leaveService.getAllLeave();
	}
  @PostMapping("/addLeave")
 public Leave addLeave(@RequestBody Leave leave) {
	  return leaveService.addLeave(leave);
  }
 
  @GetMapping("/leave/{id}")
  public Leave getById(@PathVariable long id) {
	  return leaveService.getById(id);
 }
 
@DeleteMapping("/deleteleave/{id}")
public String deleteLeaveById(long id) {
	return leaveService.deleteLeaveById(id);
}
@PutMapping("/updateleave/{id}")
public Leave updateLeave(@RequestBody Leave leave,@PathVariable long id) {
	return leaveService.updateLeave(leave,id);
}
}
