
package com.back.Portfolio.service;

import com.back.Portfolio.model.Login;
import com.back.Portfolio.repository.LoginRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class LoginService implements ILoginService{
  @Autowired  
  public LoginRepository LoginRepo;
  
  @Override
  public List<Login> verLogins() {
        List <Login>listaLogins=LoginRepo.findAll();
        return listaLogins; 
    }
  @Override
    public void crearLogin(Login log) {
        LoginRepo.save(log);
    }

  @Override
    public void borrarLogin(Long id) {
        LoginRepo.deleteById(id);
    }
  @Override
    public Login buscarLogin(Long id) {
    Login log= LoginRepo.findById(id).orElse(null);
       return log;
    }
  @Override
    public void editarLogin(Login log) {
        LoginRepo.save(log);
    }

    @Override
    public Login getOne(Long id) {
        Login log= LoginRepo.findById(id).orElse(null);
       return log;
    }
    
}
