package boasentregas.accesslogs.test;

import boasentregas.accesslogs.models.AccessLogs;
import boasentregas.accesslogs.repositories.AccessRepository;
import boasentregas.accesslogs.service.AccessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;

@RunWith(SpringRunner.class)
public class RegisterTest {


    @Mock
    private AccessService accessService;

    @Mock
    private AccessRepository accessRepository;

    @Test
    public void CreateLog(){

        accessService.save(any(AccessLogs.class));

        assertEquals(HttpStatus.CREATED,HttpStatus.CREATED);
    }

    @Test
    public void CreateLog1(){

        accessRepository.save(any(AccessLogs.class));

        assertEquals(HttpStatus.CREATED,HttpStatus.CREATED);
    }
}
