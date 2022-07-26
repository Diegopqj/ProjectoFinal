package com.nttdata.bootcoinservice.service.impl;

import com.nttdata.bootcoinservice.Model.Solicitudes;
import com.nttdata.bootcoinservice.Repository.ISolicitudesTransaccion;
import com.nttdata.bootcoinservice.dto.Transaccion;
import com.nttdata.bootcoinservice.service.ISolicitudesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class TransaccionServiceimpl implements ISolicitudesService {

    private final ISolicitudesTransaccion repo;
    @Override
    public Flux<Solicitudes> getAll() {
        return repo.findAll();
    }

    @Override
    public Flux<Transaccion> getByIdTransaccion(String NroTransaccion) {
        return null;
    }

    @Override
    public Mono<Transaccion> getById(String id) {
        return null;
    }

    @Override
    public Mono<Transaccion> registerSolicitudes(Transaccion transaccion) {
        return null;
    }

    @Override
    public Mono<Transaccion> updateById(String id, Transaccion transaccion) {
        return null;
    }

    @Override
    public Mono<Void> deleteById(String id) {
        return null;
    }
}
