package com.example.springbootredis.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration.JedisPoolingClientConfigurationBuilder;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by xianpeng.xia
 * on 2019-08-11 14:59
 */
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
@ConditionalOnProperty("spring.redis.host")
public class RedisConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.redis")
    public JedisPoolConfig getRedisConfig() {
        JedisPoolConfig config = new JedisPoolConfig();
        return config;
    }


}
