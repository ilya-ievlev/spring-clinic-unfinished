package com.spring_task.clinic.xml_processor;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import com.spring_task.clinic.model.Vet;

@XmlRootElement
public class Vets {

	private List<Vet> vets;

	@XmlElement
	public List<Vet> getVetList() {
		if (vets == null) {
			vets = new ArrayList<>();
		}
		return vets;
	}

}
