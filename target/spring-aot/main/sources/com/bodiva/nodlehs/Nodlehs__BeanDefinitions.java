package com.bodiva.nodlehs;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link Nodlehs}.
 */
@Generated
public class Nodlehs__BeanDefinitions {
  /**
   * Get the bean definition for 'nodlehs'.
   */
  public static BeanDefinition getNodlehsBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(Nodlehs.class);
    beanDefinition.setTargetType(Nodlehs.class);
    ConfigurationClassUtils.initializeConfigurationClass(Nodlehs.class);
    beanDefinition.setInstanceSupplier(Nodlehs$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
