package fr.formation.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.models.Table;

import fr.formation.repository.ITableRepository;


@Service
public class TableService implements ITableService {
	@Autowired
	ITableRepository tablerepository;
	@Override
	public List<Table> getAllTable() {
		return tablerepository.findAll();
	}

	@Override
	public fr.formation.models.Table getTableById(long id) {
		Optional<Table> Table1 =tablerepository.findById(id);
		Table Table = new Table();
		if(Table1.isPresent()) {
			Table=Table1.get()
;		}
		return Table;
	}

	@Override
	public fr.formation.models.Table createTable(fr.formation.models.Table table) {
	return tablerepository.save(table);
	}

	@Override
	public long deleteTable(long id) {
		try {
			tablerepository.deleteById(id);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}

	@Override
	public fr.formation.models.Table updateTable(fr.formation.models.Table table) {
		return tablerepository.save(table);
	}



}
