package com.ygdbx.dbaccessor.impl;

import com.ygdbx.dbaccessor.DbAccessor;

public class MySqlDbAccessor implements DbAccessor {
    @Override
    public void getData() {
        System.out.print("从MySql获取数据，");
    }
}
