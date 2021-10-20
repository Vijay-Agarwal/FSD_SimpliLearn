package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Trainer;
import com.orm.TrainerOrm;

@Service

public class TrainerService {
@Autowired
TrainerOrm trainerOrm;
public String storeTrainerInfo(Trainer trainer) {
	if(trainerOrm.storeTrainerInfo(trainer))
	{
		return "Stored Trainer Details";
	}else {
		return "Didn't Store";
	}
}
}
