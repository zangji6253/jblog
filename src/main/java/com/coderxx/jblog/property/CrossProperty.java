package com.coderxx.jblog.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "cross")
public class CrossProperty {
    private String origin;

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin(){
        return origin;
    }
}
