package com.mycompany.services;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.model.entity.Cliente;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Fabian Taveras
 */
public interface IClienteService {

    public List<Cliente> findAll();
    
    public Page<Cliente> findAll(Pageable pageable);

    public void save(Cliente cliente);

    public Cliente findEdit(Long id);

    public void removeClient(Long id);
}
