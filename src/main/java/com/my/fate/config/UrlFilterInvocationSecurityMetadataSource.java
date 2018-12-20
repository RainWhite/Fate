package com.my.fate.config;

import com.my.fate.model.Menu;
import com.my.fate.model.Role;
import com.my.fate.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import java.util.Collection;
import java.util.List;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/10 18:12
 */

@Component
public class UrlFilterInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
    @Autowired
    MenuService menuService;
    AntPathMatcher antPathMatcher = new AntPathMatcher();
    @Override
    public Collection<ConfigAttribute> getAttributes(Object o) {
        String requestUrl = ((FilterInvocation) o).getRequestUrl();
        if ("/login_p".equals(requestUrl)) {
            return null;
        }
        List<Menu> allMenu = menuService.listAll();
        for (Menu menu : allMenu) {
            if (antPathMatcher.match(menu.getUrl(), requestUrl)
                    &&menu.getRoleList().size()>0) {
                List<Role> roles = menu.getRoleList();
                int size = roles.size();
                String[] values = new String[size];
                for (int i = 0; i < size; i++) {
                    values[i] = roles.get(i).getRoleNameEn();
                }
                return SecurityConfig.createList(values);
            }
        }
        //没有匹配上的资源，都是登录访问
        return SecurityConfig.createList("ROLE_LOGIN");
    }
    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        return null;
    }
    @Override
    public boolean supports(Class<?> aClass) {
        return FilterInvocation.class.isAssignableFrom(aClass);
    }
}
