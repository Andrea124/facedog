package com.microservicios.users.service.user;

public class DateException extends RuntimeException {
  private final String id;

  public DateException(String message, String id) {
    super(message);
    this.id = id;
  }

  public static DateException from(String message, String id) {
    return new DateException(message, id);
  }

  public String getId() {
    return id;
  }
}
