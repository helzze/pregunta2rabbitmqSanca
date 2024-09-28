package pe.rabbitmq.sanca.rabbitmq_sanca.enqueue.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitMQConsumer {

    @RabbitListener(queues = "prueba_queue")
    public void consumirMensaje(String mensaje) {
        log.info("Mensaje recibido {}, inicio de operacion", mensaje);
    }

}
