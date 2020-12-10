/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collectionWeb.pageUtil;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.domain.Page;

/**
 *
 * @author Fabian Taveras
 */
public class PageUtil<T> {
    
    private final String url;
    private final Page<T> page;
    private final int desde;
    private final int hasta;
    private final int paginaActual;
    private final int totalPaginas;
    private final int elementosPorPagina;
    private final List<PageItem> itemsPage;

    public PageUtil(String url, Page<T> page) {
        this.url = url;
        this.page = page;
        itemsPage = new ArrayList<>();
        elementosPorPagina = page.getSize();
        totalPaginas = page.getTotalPages();
        paginaActual = page.getNumber() + 1;
        
        if(paginaActual <= elementosPorPagina){
            desde = 1;
            hasta = totalPaginas;
        }else {
            if(paginaActual <= elementosPorPagina/2){
                desde = 1;
                hasta = elementosPorPagina;
            }else if(paginaActual >= totalPaginas - elementosPorPagina/2){
                desde = totalPaginas - elementosPorPagina +1;
                hasta = elementosPorPagina;
            }else{
                desde = paginaActual - elementosPorPagina/2;
                hasta = elementosPorPagina;
            }
        }
        
        for (int i = 0; i < hasta; i++){
            itemsPage.add(new PageItem(desde + i, paginaActual == desde + i));
        }
    }

    public String getUrl() {
        return url;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public List<PageItem> getItemsPage() {
        return itemsPage;
    }
    
    public boolean isFirst(){
        return page.isFirst();
    }
    
    public boolean isLast(){
        return page.isLast();
    }
    
    public boolean isPrevious(){
        return page.hasPrevious();
    }
    
    public boolean isNext(){
        return page.hasNext();
    }
}
