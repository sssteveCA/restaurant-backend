package com.onlinerestaurant.restaurant.database;

import java.util.Map;

import com.onlinerestaurant.exceptions.MalformedMapException;

abstract public class Model {
    
    protected String table_name;
    protected byte errno = 0;
    protected String error = null;

    public Model(Map<String, Object> params) throws MalformedMapException{
        this.setValues(params);
    }

    public String getTableName(){ return this.table_name; }
    public byte getErrno(){ return this.errno; }
    abstract public String getError();

    private void setValues(Map<String, Object> params) throws MalformedMapException{
        if(params.containsKey("table_name"))
            this.table_name = (String) params.get("table_name");
        else
            throw new MalformedMapException();
    }

    /**
     * Validate the input data before insertion
     * @return true if all data are valid, false otherwise
     */
    abstract protected boolean validateData();
}
