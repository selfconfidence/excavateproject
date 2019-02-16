package com.excavate.init;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitLog4j extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {


        String prefix = getServletContext().getRealPath("/");
        prefix = prefix.replace("//", "/");
        String file = getInitParameter("log4j-init-file");
        // if the log4j-init-file is not set, then no point in trying
        if (file != null) {
            PropertyConfigurator.configure(prefix + file);
            Logger logger = LoggerFactory.getLogger(InitLog4j.class.getName());
       logger.error("测试测试！");
       logger.info("测试测试");
       logger.debug("测试啊");
        }
    }


}
