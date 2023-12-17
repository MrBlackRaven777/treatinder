package com.treat.treatinder.domain.repo;

import com.treat.treatinder.domain.entities.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogsRepo extends JpaRepository<Dog, Long> {

    boolean existsBySourceId(long sourceId);

//    List<IdbySourceId> getIdBySourceId(long sourceId);

    Dog findBySourceId(long sourceId);
}
