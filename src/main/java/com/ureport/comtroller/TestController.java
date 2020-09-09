package com.ureport.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestComtroller
 * @Description:
 * @Author: anpei.lu
 * @Date: 2020/02/23 18:49:42
 **/
@RestController
public class TestController {

    /*
     * @Description:
     * @Param: []
     * @create: 2020/02/23 18:52:31
     * @Author: anpei.lu
     * @return: java.lang.String
     */
    @GetMapping("/getMsg")
    public String getMsg(@RequestParam(value = "msg",defaultValue = "Have Fun!") String massage) {
        return "This is springCloud HolleWork! " + massage;
    }


}
