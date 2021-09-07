package com.company.structural.composite.file;

//Leaf node in composite pattern
public class BinaryFile extends File {

    private long size;

    public BinaryFile(String name,long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println(getName() + "\t" + size);
    }

    @Override
    public void addFile(File file) {
        throw new UnsupportedOperationException("Leaf node does not support add oeration");
    }

    @Override
    public File[] getFiles() {
        return null;
    }

    @Override
    public boolean removeFile(File file) {
        return Boolean.parseBoolean(null);
    }
}
