package com.alexcompany.springvalidation59.serviceImplemet.storage;

public class StorageException extends RuntimeException {

  public StorageException(String message){
    super(message);
  }

  public StorageException(String message, Throwable cause) {
    super(message, cause);
  }
}
