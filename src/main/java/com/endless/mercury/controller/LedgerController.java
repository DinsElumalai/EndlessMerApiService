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
import com.endless.mercury.model.Ledger;
import com.endless.mercury.repository.LedgerRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LedgerController 
{
	@Autowired
    LedgerRepository ledgerRepository;

 // Get All Ledger
    @GetMapping("/ledger")
    public List<Ledger> getAllLedgers() {
        return ledgerRepository.findAll();
    }

 // Create a new Ledger
    @PostMapping("/ledger")
    public Ledger createLedger(@Valid @RequestBody Ledger ledger) {
        return ledgerRepository.save(ledger);
    }

 // Get a Single Ledger
    @GetMapping("/ledger/{id}")
    public Ledger getLedgerById(@PathVariable(value = "id") Long ledgerId) {
        return ledgerRepository.findById(ledgerId)
                .orElseThrow(() -> new ResourceNotFoundException("Ledger", "id", ledgerId));
    }
    
 // Get a Single Ledger code
    @GetMapping("/ledgercode/{id}")
    public Ledger getLedgerByLedgerCode(@PathVariable(value = "id") String ledgerId) {
        return ledgerRepository.findByLedgerNameId(ledgerId);
    }
      
  
 // Delete a Ledger
    @DeleteMapping("/ledger/{id}")
    public ResponseEntity<?> deleteLedger(@PathVariable(value = "id") Long ledgerId) {
        Ledger ledger = ledgerRepository.findById(ledgerId)
                .orElseThrow(() -> new ResourceNotFoundException("Ledger", "id", ledgerId));

        ledgerRepository.delete(ledger);

        return ResponseEntity.ok().build();

    }
    
    // Update a Ledger
    @PutMapping("/ledger/{id}")
    public Ledger updateLedger(@PathVariable(value = "id") Long ledgerId,
                                            @Valid @RequestBody Ledger ledgerDetails) {

        Ledger ledger = ledgerRepository.findById(ledgerId)
                .orElseThrow(() -> new ResourceNotFoundException("Ledger", "id", ledgerId));

        ledger.setCreatedBy(ledgerDetails.getCreatedBy());
        ledger.setCreatedClient(ledgerDetails.getCreatedClient());
        ledger.setUpdatedBy(ledgerDetails.getUpdatedBy()); 
        ledger.setActive(ledgerDetails.isActive());
        ledger.setInactiveDate(ledgerDetails.getInactiveDate());
        ledger.setInactiveComments(ledgerDetails.getInactiveComments());
        ledger.setLedgerDescription(ledgerDetails.getLedgerDescription());
        ledger.setLedgerName(ledgerDetails.getLedgerName());
        ledger.setLedgerNameId(ledgerDetails.getLedgerNameId());

        Ledger updatedLedger = ledgerRepository.save(ledger);
        return updatedLedger;
    }
}
