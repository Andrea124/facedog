package com.microservicios.users.service.user;

public class PostException extends RuntimeException {
  private final String id;

  public PostException(String message, String id) {
    super(message);
    this.id = id;
  }

  public static PostException from(String message, String id) {
    return new PostException(message, id);
  }

  public String getId() {
    return id;
  }
}
