package com.bodiva.nodlehs;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SmallestDivisible}.
 */
@Generated
public class SmallestDivisible__BeanDefinitions {
  /**
   * Get the bean definition for 'smallestDivisible'.
   */
  public static BeanDefinition getSmallestDivisibleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(SmallestDivisible.class);
    beanDefinition.setInstanceSupplier(SmallestDivisible::new);
    return beanDefinition;
  }
}
