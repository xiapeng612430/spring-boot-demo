package com.example.springbootredis.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration.JedisPoolingClientConfigurationBuilder;

/**
 * Created by xianpeng.xia
 * on 2019-08-11 14:59
 */
@Configuration
@ConfigurationProperties(prefix = "spring.redis")
@ConditionalOnProperty("spring.redis.host")
public class RedisConfig {

    @Bean
    @ConfigurationProperties("spring.redis")
    public JedisPoolingClientConfigurationBuilder jedisPoolingClientConfigurationBuilder(){
        return jedisPoolingClientConfigurationBuilder().build();
    }
}
