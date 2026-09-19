package com.mycompany.inventarioalimentos;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Productor {
    private Connection connection;
    private Session session;
    private MessageProducer producer;

    public Productor(String brokerURL, String queueName) throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerURL);
        connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(queueName);
        producer = session.createProducer(destination);
    }

    public void enviarMensaje(String mensaje) throws JMSException {
        TextMessage message = session.createTextMessage(mensaje);
        producer.send(message);
        System.out.println("Mensaje enviado: " + mensaje);
    }

    public void cerrar() throws JMSException {
        if (connection != null) {
            connection.close();
        }
    }
}
