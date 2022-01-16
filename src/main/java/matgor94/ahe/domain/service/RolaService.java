package matgor94.ahe.domain.service;

import matgor94.ahe.domain.model.RolaEntity;
import matgor94.ahe.domain.repositories.RolaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Repository
@Transactional
public class RolaService {
    public final RolaRepository rolaRepository;

    public RolaService(RolaRepository rolaRepository) {
        this.rolaRepository = rolaRepository;
    }
    public List<RolaEntity> listaRol() {
        return rolaRepository.findAll();
    }


}
