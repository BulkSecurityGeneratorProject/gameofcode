package com.arhs.cube.thats.my.spot.service.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.geojson.GeoJsonObject;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Bus {

	private String id;

    private GeoJsonObject features;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

    public GeoJsonObject getFeatures() {
        return features;
    }

    public void setFeatures(GeoJsonObject features) {
        this.features = features;
    }

}
