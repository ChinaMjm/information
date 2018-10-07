package main.java.Filter;


import java.io.IOException;  
import javax.servlet.Filter;  
import javax.servlet.FilterChain;  
import javax.servlet.FilterConfig;  
import javax.servlet.ServletException;  
import javax.servlet.ServletRequest;  
import javax.servlet.ServletResponse;  
/** 
 * @author yangcq 
 * @description ������Filter�Ĺ���ԭ�� 
 */  
public class FilterTest implements Filter{  
  
    public void destroy() {  
        System.out.println("----Filter����----");  
    }  
  
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain filterChain) throws IOException, ServletException {  
        // ��request��response����һЩԤ����  
        request.setCharacterEncoding("UTF-8");  
        response.setCharacterEncoding("UTF-8");  
        response.setContentType("text/html;charset=UTF-8");  
//        System.out.println("----����service֮ǰִ��һ�δ���----");  
        filterChain.doFilter(request, response); // ִ��Ŀ����Դ������  
//        System.out.println("----����service֮��ִ��һ�δ���----");  
    }  
  
    public void init(FilterConfig arg0) throws ServletException {  
        System.out.println("----Filter��ʼ��----");  
    }  
}  
