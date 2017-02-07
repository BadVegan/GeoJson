package com.file;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by davit on 07.02.2017.
 */
public class MainJSon {

    final GeometryBuilder builder = new GeometryBuilder();
    final Point point = builder.point(132.159633, 43.350116);
    SimpleFeatureBuilder fBuild = new SimpleFeatureBuilder(TYPE);
    fBuild.add(point);
    SimpleFeature feature = fBuild.buildFeature(null);
    FeatureJSON fjson = new FeatureJSON();
    StringWriter writer = new StringWriter();
    try {
        fjson.writeFeature(feature, writer);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    String json = writer.toString();
    return json;
}
