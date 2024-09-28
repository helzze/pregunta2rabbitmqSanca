package pe.rabbitmq.sanca.rabbitmq_sanca.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.rabbitmq.sanca.rabbitmq_sanca.enqueue.producer.RabbitMQProducer;

@RequiredArgsConstructor
@RestController
public class RabbitMQController {

    private RabbitMQProducer rabbitMQProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje){
        rabbitMQProducer.enviarMensaje(mensaje);
        return "Mensaje enviado a RabbitMQ: " + mensaje;
    }
}
