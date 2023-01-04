package com.cpoletti;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@ApplicationScoped
public class FrutasService {

    public List<Fruta> list(){
        return  Fruta.listAll();
    }

    @Transactional
    public void create(){
        Fruta fruta = new Fruta();
        fruta.nome = "nome";
        fruta.quantidade = 1;
        fruta.persist();
    }
}
