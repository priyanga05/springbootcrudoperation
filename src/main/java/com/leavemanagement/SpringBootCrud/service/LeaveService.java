package com.leavemanagement.SpringBootCrud.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leavemanagement.SpringBootCrud.bean.Leave;

import com.leavemanagement.SpringBootCrud.repository.LeaveRepository;


@Service
public class LeaveService {
@Autowired	
public LeaveRepository leaveRepo;

	public Iterable<Leave> getAllLeave()
	{
		
		 return leaveRepo.findAll();
	     
	}
	public Leave addLeave(Leave leave) {
		return leaveRepo.save(leave);
	}

	public Leave getById(long id) {
		return leaveRepo.findById(id);
	}
	public String deleteLeaveById(long id) {
		    leaveRepo.deleteById(id);
		  return "Leave Request deleted"+id;
	}
	public Leave updateLeave(Leave leave,long id) {
		
		 Leave editLeave=new Leave();
		 editLeave=leaveRepo.findById(id);
		//System.out.println(leave.getName());
		editLeave.setName(leave.getName());	
		editLeave.setLeavetype(leave.getLeavetype());
		editLeave.setReason(leave.getReason());
		editLeave.setStartdate(leave.getStartdate());
		editLeave.setEnddate(leave.getEnddate());
		return leaveRepo.save(editLeave);
	}
	
}
