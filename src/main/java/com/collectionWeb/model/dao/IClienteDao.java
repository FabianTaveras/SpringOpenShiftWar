/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collectionWeb.model.dao;

import com.collectionWeb.model.entity.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 *
 * @author Fabian Taveras
 */
//@Repository("clienteDao")
public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{
    
    
}
