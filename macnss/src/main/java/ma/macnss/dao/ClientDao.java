package ma.macnss.dao;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ma.macnss.entities.Agent;
import ma.macnss.entities.Client;
import ma.macnss.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Transactional
public class ClientDao {

    @Autowired
    private ClientRepository clientRepository;

    public boolean login(String matricule, String password, HttpServletRequest request){
        Optional<Client> client = clientRepository.findById(matricule);
        if(client.isPresent()){
            if(client.get().getPassword().equals(password)){
                request.getSession().setAttribute("id",client.get().getMatricule());
                request.getSession().setAttribute("client",client.get());
                System.out.println("Client logged in");
                return true;
            }
        }
        return false;
    }
}
