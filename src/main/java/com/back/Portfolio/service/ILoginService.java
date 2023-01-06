
package com.back.Portfolio.service;

import com.back.Portfolio.model.Login;
import java.util.List;


public interface ILoginService {
    public void crearLogin(Login log);

    public void borrarLogin(Long id);

    public Login buscarLogin(Long id);
    
    public void editarLogin(Login log);

    public List<Login> verLogins();

    public Login getOne(Long id);
}
