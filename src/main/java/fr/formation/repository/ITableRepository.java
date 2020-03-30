package fr.formation.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.Table;

public interface ITableRepository extends JpaRepository<Table, Long> {

}
