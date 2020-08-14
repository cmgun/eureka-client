package com.cmgun.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * base controller
 *
 * Created by cmgun on 2019/6/9
 */
@RestController
public class BaseController {

//    private final Logger logger = Logger.getLogger(getClass());
//
//    @Autowired
//    private DiscoveryClient client;
//
//
//    @RequestMapping(value = "hello", method = RequestMethod.GET)
//    public String index() {
//        ServiceInstance instance = client.getLocalServiceInstance();
//        logger.info(String.format("/hello, host:%s, service_id:%s", instance.getHost(), instance.getServiceId()));
//        return "hello world";
//    }

    @PostMapping("/test/date")
    public String testDate(@RequestBody Req<Entity> req) {
        System.out.println(req.getData().getDate());
        return "hello world";
    }
}
