package com.ygdbx.converter.impl;

import com.ygdbx.converter.Converter;

public class TxtConverter extends Converter {
    @Override
    public void convert() {
        dbAccessor.getData();
        System.out.println("数据转换格式为：txt");
    }
}
