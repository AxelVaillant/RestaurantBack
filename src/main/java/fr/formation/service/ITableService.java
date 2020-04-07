package fr.formation.service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import fr.formation.models.Table;





public interface ITableService {

	public List<Table> getAllTable();
	public fr.formation.models.Table getTableById(long id);
	public fr.formation.models.Table createTable(fr.formation.models.Table table);
	public long deleteTable(long id);
	public fr.formation.models.Table updateTable(fr.formation.models.Table table);

}
