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

    protected void setValues(Map<String, Object> params) throws MalformedMapException{
        if(params.containsKey("table_name"))
            this.table_name = (String) params.get("table_name");
        else
            throw new MalformedMapException();
    }

    /**
     * Delete a specific table record
     * @param query the condition to search the first record that satisified it
     * @return
     */
    protected boolean delete(String query){
        return true;
    }

    /**
     * Get a specific table record
     * @param query the condition to search the first record that satisified it
     * @return
     */
    protected boolean get(String query){
        return true;
    }

    /**
     * Insert a new record in the table
     * @param params
     * @return
     */
    protected boolean insert(Map<String, Object> params){
        return true;
    }

    /**
     * Update a specific table record
     * @param query the condition to search the first record that satisified it
     * @return
     */
    protected boolean update(String query){
        return true;
    }

    /**
     * Validate the input data before insertion
     * @return true if all data are valid, false otherwise
     */
    abstract protected boolean validateData();
}
