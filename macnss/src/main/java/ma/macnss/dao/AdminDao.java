package ma.macnss.dao;



import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.macnss.entities.Admin;
import ma.macnss.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@NoArgsConstructor
@Data @AllArgsConstructor
@Transactional
public class AdminDao {

    @Autowired
    private AdminRepository adminRepository;

    public boolean login(String email, String password, HttpServletRequest request){
        Optional<Admin> admin = adminRepository.findByEmail(email);
        if(admin.isPresent()){
            if(admin.get().getPassword().equals(password)){
                request.getSession().setAttribute("id",admin.get().getId());
                request.getSession().setAttribute("admin",admin.get());
                System.out.println("Admin logged in");
                return true;
            }
        }
        return false;
    }




}
