package com.portfolio.gime.Security.Service;

import com.portfolio.gime.Security.Entity.Rol;
import com.portfolio.gime.Security.Enums.RolNombre;
import com.portfolio.gime.Security.Repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class RolService {

    @Autowired
    iRolRepository irolRepository;

    public Optional<Rol> getByNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);

    }

    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
