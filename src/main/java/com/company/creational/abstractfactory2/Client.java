package com.company.creational.abstractfactory2;


import com.company.creational.abstractfactory2.aws.AwsResourceFactory;
import com.company.creational.abstractfactory2.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Instance.Capacity cap, int storageMib){
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance il = aws.createServer(Instance.Capacity.micro, 20480);
        il.start();
        il.stop();

        System.out.println("*********************************");
        Client gcp = new Client(new GoogleResourceFactory());
        Instance gI = gcp.createServer(Instance.Capacity.large, 48098);
        gI.start();
        gI.stop();

    }

}
