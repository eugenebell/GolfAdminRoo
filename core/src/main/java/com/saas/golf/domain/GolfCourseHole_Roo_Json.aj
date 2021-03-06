// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.saas.golf.domain;

import com.saas.golf.domain.GolfCourseHole;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect GolfCourseHole_Roo_Json {
    
    public String GolfCourseHole.toJson() {
        return new JSONSerializer().exclude("*.class").serialize(this);
    }
    
    public static GolfCourseHole GolfCourseHole.fromJsonToGolfCourseHole(String json) {
        return new JSONDeserializer<GolfCourseHole>().use(null, GolfCourseHole.class).deserialize(json);
    }
    
    public static String GolfCourseHole.toJsonArray(Collection<GolfCourseHole> collection) {
        return new JSONSerializer().exclude("*.class").serialize(collection);
    }
    
    public static Collection<GolfCourseHole> GolfCourseHole.fromJsonArrayToGolfCourseHoles(String json) {
        return new JSONDeserializer<List<GolfCourseHole>>().use(null, ArrayList.class).use("values", GolfCourseHole.class).deserialize(json);
    }
    
}
