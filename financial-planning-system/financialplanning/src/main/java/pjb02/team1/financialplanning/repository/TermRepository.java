package pjb02.team1.financialplanning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjb02.team1.financialplanning.entities.Term;

public interface TermRepository extends JpaRepository<Term, String> {
}
