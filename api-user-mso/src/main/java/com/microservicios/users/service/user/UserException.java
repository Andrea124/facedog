package com.microservicios.users.service.user;

public class UserException extends RuntimeException {
  private final String id;

  public UserException(String message, String id) {
    super(message);
    this.id = id;
  }

  public static UserException from(String message, String id) {
    return new UserException(message, id);
  }

  public String getId() {
    return id;
  }
}
