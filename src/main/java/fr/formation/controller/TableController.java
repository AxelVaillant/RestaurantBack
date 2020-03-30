package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.models.Table;

import fr.formation.service.ITableService;

@RestController
@RequestMapping("table")
@CrossOrigin("http://localhost:4200")
public class TableController {
	@Autowired
	ITableService tableservice;
	
	@GetMapping("/all")
	public List<Table> getAllTable(){
		return tableservice.getAllTable();
	}
	
	@GetMapping("/byid/{id}")
	public Table getTablebyid(@PathVariable long id) {
		return tableservice.getTableById(id);
	}

	@PostMapping("/save")
	public Table createTable(@RequestBody Table table) {
		return tableservice.createTable(table);
	}
	
	@PostMapping("/delete/{id}")
	public long deleteTable(@PathVariable long id) {
		return tableservice.deleteTable(id);
	}
	@PutMapping("/update/{id}")
	public Table updateTable(@PathVariable long id, @RequestBody Table table) {
		Table tablemodif=tableservice.getTableById(id);
		tablemodif.setServeur(table.getServeur());
		tablemodif.setDisponible(table.isDisponible());

		return tableservice.updateTable(table);
	}
}
