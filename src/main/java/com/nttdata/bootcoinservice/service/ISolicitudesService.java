package com.nttdata.bootcoinservice.service;

import com.nttdata.bootcoinservice.Model.Solicitudes;
import com.nttdata.bootcoinservice.dto.Transaccion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ISolicitudesService {

    Flux<Solicitudes> getAll();

    Flux<Transaccion> getByIdTransaccion(String NroTransaccion);

    Mono<Transaccion> getById(String id);

    Mono<Transaccion> registerSolicitudes(Transaccion transaccion);

    Mono<Transaccion> updateById(String id, Transaccion transaccion);

    Mono<Void> deleteById(String id);

}
