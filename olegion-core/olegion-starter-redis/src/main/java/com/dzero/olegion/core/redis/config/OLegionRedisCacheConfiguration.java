package com.dzero.olegion.core.redis.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@AutoConfiguration
@EnableConfigurationProperties({CacheProperties.class})
@EnableCaching
public class OLegionRedisCacheConfiguration {
}
