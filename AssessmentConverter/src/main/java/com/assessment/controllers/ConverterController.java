package com.assessment.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.beans.Model;
import com.assessment.converters.Converter;


@RestController
@RequestMapping("/converter")
public class ConverterController {


	@PostMapping("/kelvintocelsius")
	public ResponseEntity<Model> kelvinToCelsius(@RequestBody Model m) {
		double value=Converter.kelvinToCelsius(m.getValue());
		return ResponseEntity.ok(new Model(value));
	}
	@PostMapping("/poundstokilograms")
	public ResponseEntity<Model> poundsToKilograms(@RequestBody Model m) {
		double value=Converter.poundsToKilograms(m.getValue());
		return ResponseEntity.ok(new Model(value));
	}
	@PostMapping("/milestokilometers")
	public ResponseEntity<Model> milesToKilometers(@RequestBody Model m) {
		double value=Converter.milesToKilometers(m.getValue());
		return ResponseEntity.ok(new Model(value));
	}
}