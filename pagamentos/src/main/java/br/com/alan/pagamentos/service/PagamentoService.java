package br.com.alan.pagamentos.service;

import br.com.alan.pagamentos.dto.PagamentoDto;
import br.com.alan.pagamentos.repository.PagamentoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service

public class PagamentoService {
    @Autowired
    private PagamentoRepository repository;
    @Autowired
    private ModelMapper modelMapper;

    Page<PagamentoDto> obterTodos(Pageable paginacao){
        return repository
                .findAll(paginacao)
                .map(p -> modelMapper.map(p, PagamentoDto.class));
    }

}
