package com.mycompany.inventarioalimentos;

import javax.jms.*;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Consumidor {
    private Connection connection;
    private Session session;
    private MessageConsumer consumer;

    public Consumidor(String brokerURL, String queueName) throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerURL);
        connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination destination = session.createQueue(queueName);
        consumer = session.createConsumer(destination);
    }

    public String recibirMensaje(long timeout) throws JMSException {
        Message message = consumer.receive(timeout);
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            String text = textMessage.getText();
            System.out.println("Mensaje recibido: " + text);
            return text;
        }
        return null;
    }

    public void cerrar() throws JMSException {
        if (connection != null) {
            connection.close();
        }
    }
}
