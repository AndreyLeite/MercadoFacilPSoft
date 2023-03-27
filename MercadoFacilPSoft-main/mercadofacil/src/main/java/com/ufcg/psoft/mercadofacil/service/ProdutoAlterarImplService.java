package com.ufcg.psoft.mercadofacil.service;

import com.ufcg.psoft.mercadofacil.model.Produto;
import org.springframework.stereotype.Service;

@Service

public class ProdutoAlterarImplService extends ProdutoAlterarService {

    ProdutoRepository<Produto, Long> produtoRepository;

    @Override
    public Produto alterar(Produto produtoAlterado){
        return produtoRepository.update(produtoAlterado);
    }
}
