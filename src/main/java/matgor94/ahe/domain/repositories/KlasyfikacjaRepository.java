package matgor94.ahe.domain.repositories;

import matgor94.ahe.domain.model.KlasyfikacjaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlasyfikacjaRepository extends JpaRepository <KlasyfikacjaEntity, Long> {

}
