package fr.formation.repository;

import javax.persistence.Table;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITableRepository extends JpaRepository<Table, Long> {

}
