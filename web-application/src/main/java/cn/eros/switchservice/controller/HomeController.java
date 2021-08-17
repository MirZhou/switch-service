package cn.eros.switchservice.controller;

import cn.eros.data.api.UserService;
import cn.eros.data.domain.DocumentFlow;
import cn.eros.switchservice.service.UserBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>create time：2021-08-11 15:24
 *
 * @author Eros
 */
@RestController
public class HomeController {
    @Autowired
    private UserBiz userBiz;

    @Autowired
    private UserService userService;

    @GetMapping("/index")
    public String home() {
        return this.userBiz.getById("30");
    }

    @GetMapping("/findAll")
    public List<DocumentFlow> findAll() {
        return this.userService.findAll();
    }
}
