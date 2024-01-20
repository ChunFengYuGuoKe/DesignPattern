package com.ygdbx.converter;

import com.ygdbx.dbaccessor.DbAccessor;

public abstract class Converter {

    protected DbAccessor dbAccessor;
    public abstract void convert();

    public DbAccessor getDbAccessor() {
        return dbAccessor;
    }

    public void setDbAccessor(DbAccessor dbAccessor) {
        this.dbAccessor = dbAccessor;
    }
}
