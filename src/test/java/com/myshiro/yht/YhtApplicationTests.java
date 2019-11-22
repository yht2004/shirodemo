package com.myshiro.yht;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YhtApplicationTests {


    @Test
    void contextLoads() {
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = factory.getInstance();

        SecurityUtils.setSecurityManager(securityManager);

        Subject subject = SecurityUtils.getSubject();

        UsernamePasswordToken token = new UsernamePasswordToken("jack","123");

        subject.login(token);

        System.out.println("认证结果:"+subject.isAuthenticated());

        System.out.println("是否有对应的User角色"+subject.hasRole("user"));
        System.out.println("getPrincopal"+subject.getPrincipal());
        subject.checkRole("user");
        subject.checkPermission("video:find");
        System.out.println("是否有video：fin权限"+subject.isPermitted("video:find"));
        subject.logout();
        System.out.println("logout认证后结果："+subject.isAuthenticated());
    }

}
