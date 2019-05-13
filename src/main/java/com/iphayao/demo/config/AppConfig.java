//package com.iphayao.demo.config;
//
//import org.elasticsearch.client.Client;
//import org.elasticsearch.client.transport.TransportClient;
//import org.elasticsearch.common.settings.Settings;
//import org.elasticsearch.common.transport.InetSocketTransportAddress;
//import org.elasticsearch.transport.client.PreBuiltTransportClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
//import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
//import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
//
//import java.net.InetAddress;
//import java.net.UnknownHostException;
//
//@Configuration
//@EnableElasticsearchRepositories(basePackages = "com/iphayao/demo/customer/CustomerRepository")
//public class AppConfig {
//    @Bean
//    public Client client() throws Exception {
//        Settings setting = Settings.builder()
//                .put("client.transport.sniff", true)
//                .put("cluster.name", "elasticsearch")
//                .build();
//
//        TransportClient client = new PreBuiltTransportClient(setting);
//        client.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9200));
//        return client;
//    }
//
//    @Bean
//    public ElasticsearchOperations elasticsearchOperations() throws Exception {
//        return new ElasticsearchTemplate(nodeBuilder());
//    }
//}
