package io.druid.samplepwdext;

import io.druid.initialization.DruidModule;

import java.util.List;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.google.common.collect.ImmutableList;
import com.google.inject.Binder;

/**
 * With this module jar added to druid, you can write following in your druid configuration
 * for password.
 * druid.metadata.storage.connector.password={"type":"securepwd","passwordKey":"my_precious"}
 */
public class SecurePwdProviderModule implements DruidModule
{
  @Override
  public List<? extends Module> getJacksonModules()
  {
    return ImmutableList.of(
        new SimpleModule("SecurePwdProviderModule")
            .registerSubtypes(
                new NamedType(SecurePasswordProvider.class, "securepwd")
            )
    );
  }

  @Override
  public void configure(Binder binder) {}
}
