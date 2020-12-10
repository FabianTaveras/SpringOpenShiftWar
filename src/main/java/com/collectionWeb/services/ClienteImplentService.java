///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.collectionWeb.services;
//
//import com.collectionWeb.model.dao.IClienteDao;
//import com.collectionWeb.model.entity.Cliente;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.stereotype.Repository;
//
///**
// *
// * @author Fabian Taveras
// */
//@Repository("clienteService")
//public class ClienteImplentService implements IClienteService{
//
//    @Autowired
//    private IClienteDao clienteDao;
//    
//    @Transactional(readOnly = true)
//    @Override
//    public List<Cliente> findAll() {
//        return (List<Cliente>) clienteDao.findAll();
//    }
//
//    @Transactional
//    @Override
//    public void save(Cliente cliente) {
//        clienteDao.save(cliente);
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Cliente findEdit(Long id) {
//        return clienteDao.findById(id).orElse(null);
//    }
//    
//    @Transactional
//    @Override
//    public void removeClient(Long id) {
//        clienteDao.deleteById(id);
//    }
//
//    @Transactional(readOnly = true)
//    @Override
//    public Page<Cliente> findAll(Pageable pageable) {
//       return clienteDao.findAll(pageable);
//    }
//}
