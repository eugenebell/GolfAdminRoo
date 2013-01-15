// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.domain;

import com.saas.golf.domain.Golfer;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect Golfer_Roo_Json {
    
    public String Golfer.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static Golfer Golfer.fromJsonToGolfer(String json) {
        return new JSONDeserializer<Golfer>().use(null, Golfer.class).deserialize(json);
    }
    
    public static String Golfer.toJsonArray(Collection<Golfer> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<Golfer> Golfer.fromJsonArrayToGolfers(String json) {
        return new JSONDeserializer<List<Golfer>>().use(null, ArrayList.class).use("values", Golfer.class).deserialize(json);
    }
    
}
