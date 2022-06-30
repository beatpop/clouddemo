package com.alex.clouddemoconsumer.service;

import com.alex.clouddemoconsumer.service.impl.ProviderFeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author AlexPCCW
 */
@FeignClient(value = "CLOUDDEMO-PROVIDER", fallback = ProviderFeignServiceImpl.class)
public interface ProviderFeignService {

    /**
     * hiFeign
     *
     * @param message 信息
     * @return String
     */
    @GetMapping("/provider/hiFeign")
    public String hiFeign(@RequestParam("message") String message);
}
