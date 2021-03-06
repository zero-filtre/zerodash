package com.zerofiltre.zerodash.presentation.security.annotation;

import java.lang.annotation.*;

/**
 * Marking annotation that will switch off security check for given method.
 * Works only for methods defined in GraphQL Resolvers
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Unsecured {
}
