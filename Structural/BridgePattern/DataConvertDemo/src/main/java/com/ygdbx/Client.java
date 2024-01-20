package com.ygdbx;

import com.ygdbx.converter.Converter;
import com.ygdbx.converter.impl.TxtConverter;
import com.ygdbx.dbaccessor.DbAccessor;
import com.ygdbx.dbaccessor.impl.MySqlDbAccessor;

public class Client {
    public static void main(String[] args) {
        Converter txtConverter = new TxtConverter();
        DbAccessor dbAccessor = new MySqlDbAccessor();
        txtConverter.setDbAccessor(dbAccessor);
        txtConverter.convert();
    }
}
