package com.servlet.listener.request;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class RequestListener
 *
 */
@WebListener
public class RequestListener implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent arg0) {
        System.out.println("Request being sent to " + arg0.getServletRequest().getRemoteAddr());
    }

    public void requestInitialized(ServletRequestEvent arg0) {
        System.out.println("Initializing the request " + arg0.getServletRequest().getRemoteAddr());
    }

}
