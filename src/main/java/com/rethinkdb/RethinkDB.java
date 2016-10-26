package com.rethinkdb;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rethinkdb.gen.model.TopLevel;
import com.rethinkdb.net.Connection;

public class RethinkDB extends TopLevel {

    /**
     * The Singleton to use to begin interacting with RethinkDB Driver
     */
    public static final RethinkDB r = new RethinkDB();

    /**
     * Object mapper instance, default set to null. Set the instance to use a custom object mapper.
     */
    private static ObjectMapper mapper = null;
    public Connection.Builder connection() {
        return Connection.build();
    }

    public static void setObjectMapper(ObjectMapper mapper1){
        mapper = mapper1;
    }
    public static ObjectMapper getObjectMapper(){
        if (mapper != null) return mapper;
        return new ObjectMapper();
    }
}
