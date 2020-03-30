package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.models.User;

public interface IUserRepository extends JpaRepository<User, Long>{

}
