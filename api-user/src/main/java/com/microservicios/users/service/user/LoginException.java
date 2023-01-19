package com.microservicios.users.service.user;

public class LoginException extends RuntimeException {
  private final String id;

  public LoginException(String message, String id) {
    super(message);
    this.id = id;
  }

  public static LoginException from(String message, String id) {
    return new LoginException(message, id);
  }

  public String getId() {
    return id;
  }
}
