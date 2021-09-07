package com.company.creational.factorymethod;

import com.company.creational.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 * Abstract Factory
 */
public abstract class MessageCreator {


    public Message getMessage(){
        Message msg = createMessage();
        msg.encrypt();

        return msg;
    }

	public abstract Message createMessage();

}
