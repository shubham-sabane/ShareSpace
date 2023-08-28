package com.app.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.app.dto.FreelancerDTO;
import com.app.dto.FreelancerListDTO;
import com.app.dto.FreelancerLoginDTO;
import com.app.entites.Freelancer;



/**************************************************************************************
 * @author       Vishnuvardhan 
 * Description : This is the Service Interface for Freelancer module. 
 * Created Date: 21 April, 2021 
 * Version     : v1.0.0
 *************************************************************************************/
@Service
public interface IFreelancerService {

	Freelancer findById(Long id);

	Long getCurrentId();

	Freelancer save(FreelancerDTO freelancerDto);

	Freelancer update(@Valid Long id, FreelancerDTO freelancerDto);

	Freelancer findByUserName(String userName);
	
	List<Freelancer> listFreelancers();

	Freelancer checkLogin(FreelancerLoginDTO freelancerDto);
}
