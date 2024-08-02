package org.springframework.boot.autoconfigure.web.embedded;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmbeddedWebServerFactoryCustomizerAutoConfiguration}.
 */
@Generated
public class EmbeddedWebServerFactoryCustomizerAutoConfiguration__BeanDefinitions {
  /**
   * Get the bean definition for 'embeddedWebServerFactoryCustomizerAutoConfiguration'.
   */
  public static BeanDefinition getEmbeddedWebServerFactoryCustomizerAutoConfigurationBeanDefinition(
      ) {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmbeddedWebServerFactoryCustomizerAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(EmbeddedWebServerFactoryCustomizerAutoConfiguration::new);
    return beanDefinition;
  }
}
