package bd.edu.diu.cis.library.repository;

import bd.edu.diu.cis.library.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
}
