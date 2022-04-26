package com.endless.mercury.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.endless.mercury.exceptions.ResourceNotFoundException;
import com.endless.mercury.model.DocRecPerformanceKpi;
import com.endless.mercury.repository.DocRecPerformanceKpiRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class DocRecPerformanceKpiController 
{

	@Autowired
	DocRecPerformanceKpiRepository docRecPerformanceKpiRepo;
	
	// Get All 
    @GetMapping("/docrecperf/kpi")
    public List<DocRecPerformanceKpi> getAllDocRecPerformanceKpis() {
        return docRecPerformanceKpiRepo.findAll();
    }
    
    // Create a new Record
    @PostMapping("/docrecperf/kpi")
    public DocRecPerformanceKpi createDocRecPerformanceKpi(@Valid @RequestBody DocRecPerformanceKpi newRecord) {
        return docRecPerformanceKpiRepo.save(newRecord);
    }
    
    // Get a Single Record
    @GetMapping("/docrecperf/kpi/{id}")
    public DocRecPerformanceKpi getDocRecPerformanceKpiById(@PathVariable(value = "id") Long id) {
        return docRecPerformanceKpiRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceKpi", "id", id));
    }
    
        
    //Get last record
    @GetMapping("/docrecperf/kpi/last")
    public DocRecPerformanceKpi getLastDocRecPerformanceKpi()
    {
    	return docRecPerformanceKpiRepo.findTopByOrderByKpiIdDesc();
    }
    
    //Get last record
    @GetMapping("/docrecperf/kpi/docrec/{id}")
    public DocRecPerformanceKpi getDocRecPerformanceKpiByDocRecPerId(@PathVariable(value = "id") String id)
    {
    	return docRecPerformanceKpiRepo.findByDocRecPerId(id);
    }
    
    
    // Delete a Record
    @DeleteMapping("/docrecperf/kpi/{id}")
    public ResponseEntity<?> deleteDocRecPerformanceKpi(@PathVariable(value = "id") Long id) {
    	DocRecPerformanceKpi record = docRecPerformanceKpiRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceKpi", "id", id));

        docRecPerformanceKpiRepo.delete(record);

        return ResponseEntity.ok().build();

    }
    
    // Update a Record
    @PutMapping("/docrecperf/kpi/{id}")
    public DocRecPerformanceKpi updateDocRecPerformanceKpi(@PathVariable(value = "id") Long id,
                                            @Valid @RequestBody DocRecPerformanceKpi newDetails) {

    	DocRecPerformanceKpi updatedRecord = docRecPerformanceKpiRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DocRecPerformanceKpi", "id", id));
 
    	
    	updatedRecord.setKpiFrequnecyMonth(newDetails.getKpiFrequnecyMonth());
    	updatedRecord.setCreatedClient(newDetails.getCreatedClient());
    	updatedRecord.setDocRecPerId(newDetails.getDocRecPerId());
    	updatedRecord.setKpiFromMonthYear(newDetails.getKpiFromMonthYear());
    	updatedRecord.setKpiTargetValue(newDetails.getKpiTargetValue());
    	updatedRecord.setKpiUom(newDetails.getKpiUom());
    	updatedRecord.setUpdatedBy(newDetails.getUpdatedBy());
    	updatedRecord.setUpdatedDate(newDetails.getUpdatedDate());   	
    	                     

    	DocRecPerformanceKpi updatedDocRecPerformanceKpi = docRecPerformanceKpiRepo.save(updatedRecord);
        return updatedDocRecPerformanceKpi;
    }
}
