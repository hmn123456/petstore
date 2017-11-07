package com.newer.petstore.web;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.newer.petstore.AppInfo;
import com.newer.petstore.domain.Cart;
/**
 * 监听器
 */
@WebListener
public class CartListener implements HttpSessionListener {
	int counter;
	/**
	 * 创建新的会话（调用很多次）
	 */

    public void sessionCreated(HttpSessionEvent se)  { 
         counter++;
         System.out.println("创建会话："+se.getSession().getId());
         
         //存储在线人数
         se.getSession().getServletContext().setAttribute("online",counter);
         //给每个会话分配一个购物车
         Cart cart=new Cart();
         se.getSession().setAttribute(AppInfo.SESSION_CART, cart);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
         counter--;
         System.out.println("会话销毁"+se.getSession().getId());
         ServletContext application=se.getSession().getServletContext();
         application.setAttribute("online", counter);
    }
	
}
