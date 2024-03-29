package com.ufcg.psoft.mercadofacil.service;

import com.ufcg.psoft.mercadofacil.model.Produto;
import com.ufcg.psoft.mercadofacil.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ProdutoAlterarImplService extends ProdutoAlterarService {
    @Autowired
    ProdutoRepository<Produto, Long> produtoRepository;

    @Override
    public Produto alterar(Produto produtoAlterado){
        if(produtoAlterado.getPreco()<=0){
            throw new RuntimeException("Preço Inválido!");
        }
        return produtoRepository.update(produtoAlterado);
    }
}
