package com.alexcompany.springvalidation59.serviceImplemet.storage;

public class StorageFileNotFoundException extends RuntimeException {

  public StorageFileNotFoundException(String message) {
    super(message);
  }

  public StorageFileNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
