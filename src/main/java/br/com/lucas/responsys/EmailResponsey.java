package br.com.lucas.responsys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.lucas.domin.Email;

@Repository
public interface EmailResponsey extends JpaRepository<Email,UUID> {
    


    
}
