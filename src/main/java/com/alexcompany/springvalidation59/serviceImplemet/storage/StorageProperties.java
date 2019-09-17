package com.alexcompany.springvalidation59.serviceImplemet.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {

  private String location = "D:\\Рома програмування\\Програми на Idea\\Upload\\src\\main\\resources\\static\\css\\storage";

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
