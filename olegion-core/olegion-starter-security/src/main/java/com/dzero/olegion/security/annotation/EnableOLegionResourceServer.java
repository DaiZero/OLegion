package com.dzero.olegion.security.annotation;

@Documented
@Inherited
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@EnableGlobalMethodSecurity(prePostEnabled = true)
public @interface EnableOLegionResourceServer {
}
