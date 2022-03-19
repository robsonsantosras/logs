package boasentregas.accesslogs.repositories;

import boasentregas.accesslogs.models.AccessLogs;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessRepository extends MongoRepository<AccessLogs,String> {
}
