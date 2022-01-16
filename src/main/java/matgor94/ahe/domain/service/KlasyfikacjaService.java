package matgor94.ahe.domain.service;

import matgor94.ahe.domain.model.KlasyfikacjaEntity;
import matgor94.ahe.domain.repositories.KlasyfikacjaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Repository
@Transactional
public class KlasyfikacjaService {

    public final KlasyfikacjaRepository klasyfikacjaRepository;

    public KlasyfikacjaService(KlasyfikacjaRepository klasyfikacjaRepository) {
        this.klasyfikacjaRepository = klasyfikacjaRepository;
    }

    public KlasyfikacjaEntity dodaj(KlasyfikacjaEntity klasyfikacjaEntity){
        return klasyfikacjaRepository.save(klasyfikacjaEntity);
    }

    public List<KlasyfikacjaEntity> wszytskieKlasyfikacje(){
        return klasyfikacjaRepository.findAll();
    }
}
