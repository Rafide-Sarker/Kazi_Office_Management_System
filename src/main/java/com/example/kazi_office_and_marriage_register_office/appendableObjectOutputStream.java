package com.example.kazi_office_and_marriage_register_office;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class appendableObjectOutputStream extends ObjectOutputStream {
    public appendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        //do nothing
    }
}
