package com.example.feignservicea;

import com.example.feignservicea.service.ServiceBFeignClient;
import org.springframework.stereotype.Component;

/**
 * @Title: ServiceBFeignClientFallback
 * @ProjectName springcloud_feign
 * @Description: FeignClient失败回调方法
 * @Author WeiShiHuai
 * @Date 2018/9/10 15:22
 * FeignClient失败回调方法必须实现使用@FeignClient标识的接口（implements ServiceBFeignClient），实现其中的方法
 */
@Component
public class ServiceBFeignClientFallback implements ServiceBFeignClient {

    /**
     * 当服务B由于某种原因使得服务调用不成功时会执行该回调方法
     *
     * @param name
     * @return
     */
    @Override
    public String getInfo(String name) {
        return "sorry " + name + ", feign client error";
    }

}