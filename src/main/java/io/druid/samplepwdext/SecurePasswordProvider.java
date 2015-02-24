package io.druid.samplepwdext;

import io.druid.metadata.PasswordProvider;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SecurePasswordProvider implements PasswordProvider
{
  private static final String PASSWORD_KEY = "passwordKey";

  private final String passwordKey;

  @JsonCreator
  public SecurePasswordProvider(@JsonProperty(PASSWORD_KEY) String optionalUserSuppliedStuff)
  {
    this.passwordKey = optionalUserSuppliedStuff;
  }

  public String getPassword()
  {
    //Get password using your super secure mechanism, you can have user supply
    //something e.g. a key in a secure location or whatever
    return "password";
  }
}
