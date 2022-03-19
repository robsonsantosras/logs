package boasentregas.accesslogs.service.implement;

import boasentregas.accesslogs.models.AccessLogs;
import boasentregas.accesslogs.repositories.AccessRepository;
import boasentregas.accesslogs.service.AccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccessServiceImpl implements AccessService {

    @Autowired
    private AccessRepository accessRepository;


    @Override
    public void save(AccessLogs logs)
    {

        accessRepository.save(logs);
    }
}
