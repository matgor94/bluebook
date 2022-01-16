package matgor94.ahe.domain.repositories;

import matgor94.ahe.domain.model.RolaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolaRepository extends JpaRepository<RolaEntity, Long> {
}
