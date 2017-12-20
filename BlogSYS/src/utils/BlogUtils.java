package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.servlet.http.HttpServletResponse;

public class BlogUtils {
	//加载静态资源配置文件
	public static String readProp(String key){
		InputStream in = BlogUtils.class.getClassLoader().getResourceAsStream("system.properties");
		Properties prop = new Properties();
		try {
			prop.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("读取成功");
		return prop.getProperty(key);
	}
	
	//AJAX写回
	public static void printAjax(String result,HttpServletResponse response){
		//设置字符集
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/json;charset=UTF-8");
		
		//写回
		try {
			response.getWriter().write(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
