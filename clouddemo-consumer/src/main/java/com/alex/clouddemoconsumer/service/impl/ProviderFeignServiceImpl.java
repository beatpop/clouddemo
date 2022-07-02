package com.alex.clouddemoconsumer.service.impl;

import com.alex.clouddemoconsumer.service.ProviderFeignService;
import org.springframework.stereotype.Service;

/**
 * @author AlexPCCW
 */
@Service
public class ProviderFeignServiceImpl implements ProviderFeignService {
    @Override
    public String hiFeign(String message) {
        return "Test hiFeign Fallback";
    }
}
