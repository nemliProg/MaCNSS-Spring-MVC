package ma.macnss.dao;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.macnss.entities.Client;
import ma.macnss.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class ClientDao {

    @Autowired
    private ClientRepository clientRepository;

}
