// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.domain;

import com.saas.golf.domain.GolfSociety;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect GolfSociety_Roo_Json {
    
    public String GolfSociety.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static GolfSociety GolfSociety.fromJsonToGolfSociety(String json) {
        return new JSONDeserializer<GolfSociety>().use(null, GolfSociety.class).deserialize(json);
    }
    
    public static String GolfSociety.toJsonArray(Collection<GolfSociety> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<GolfSociety> GolfSociety.fromJsonArrayToGolfSocietys(String json) {
        return new JSONDeserializer<List<GolfSociety>>().use(null, ArrayList.class).use("values", GolfSociety.class).deserialize(json);
    }
    
}
