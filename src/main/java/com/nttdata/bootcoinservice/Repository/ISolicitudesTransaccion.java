package com.nttdata.bootcoinservice.Repository;

import com.nttdata.bootcoinservice.Model.Solicitudes;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ISolicitudesTransaccion extends ReactiveMongoRepository<Solicitudes, String> {

    Mono<Boolean> existsByExistTransaccion(String NroTransaccion);
    Mono<Boolean> existsByDni(String NroTransaccion);
    Flux<Solicitudes> findByTransaccionId();



}
