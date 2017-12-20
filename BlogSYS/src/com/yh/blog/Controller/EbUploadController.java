package com.yh.blog.Controller;

import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import net.sf.json.JSONObject;
import utils.BlogUtils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Controller
@RequestMapping(value="/upload")
public class EbUploadController {
	/**
	 * @author YHwin
	 * 上传图片
	 * 支持多文件上传
	 * @throws IOException 
	 */
	
	@RequestMapping(value="/uploadPic.do")
	public void uploadPic(HttpServletRequest request, Writer out) throws IOException{//response也行
		//将简单request强转成复杂request
		MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
		//获得上传到的图片
		Map<String, MultipartFile> map = mr.getFileMap();
		Set<String> set = map.keySet();//使用keySet获取所有的Key值
		Iterator<String> it = set.iterator();//遍历
		String fileInput = it.next();
		MultipartFile mf = map.get(fileInput);//获取文件
		//获取文件字节数组
		byte [] bs = mf.getBytes(); 
		
		//文件名规范设置
		String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());//时间
		
		/*UploadFileUtils uuid = new UploadFileUtils();//uuid
		String uuidName = uuid.getUUIDFileName(fileInputName)+fileName;
		System.out.println(uuidName);*/
		
		Random random = new Random();
		for(int i=0;i<3;i++){
			fileName = fileName+random.nextInt(10);
		}
		
		//截取文件后缀
		String oriFileName = mf.getOriginalFilename();//获取原始文件名
		System.out.println(oriFileName);
		String suffix = oriFileName.substring(oriFileName.lastIndexOf("."));
		
		//指定文件上传路径
		String realPath = BlogUtils.readProp("file_path")+"/upload/"+fileName+suffix;//绝对路径
		System.out.println(realPath);
		String relativePath = "/upload/"+fileName+suffix;//相对路径（存入数据库，防止IP变化导致不成功）
		//创建jersy客户端
		Client client = Client.create();
		//创建web对象资源(绝对路径)
		WebResource wr = client.resource(realPath);
		//上传
		wr.put(bs);
		
		//JSON输出（绝对路径回显，相对路径存储到数据库）
		JSONObject object = new JSONObject();
		object.accumulate("realPath", realPath);
		object.accumulate("relativePath", relativePath);
		String result = object.toString();
		out.write(result);
	}
	
	@RequestMapping(value="/deleteBeforePic.do")
	public void	deleteBeforePic(String imgPath){
		Client client = Client.create();
		WebResource resource = client.resource(imgPath);
		resource.delete();
		System.out.println("删除成功");
	}
	
	/**
	 * fckEditor上传逻辑
	 * @param request
	 * @param out
	 * @throws IOException
	 */
	/*@RequestMapping(value="/uploadForFck.do")
	public void uploadForFck(HttpServletRequest request, HttpServletResponse response) throws IOException{
		//将简单request强转成复杂request
		MultipartHttpServletRequest mr = (MultipartHttpServletRequest) request;
		//获得上传到的图片
		Map<String, MultipartFile> map = mr.getFileMap();
		Set<String> set = map.keySet();//使用keySet获取所有的Key值
		Iterator<String> it = set.iterator();//遍历
		String fileInput = it.next();
		MultipartFile mf = map.get(fileInput);//获取文件
		//获取文件字节数组
		byte [] bs = mf.getBytes(); 
		
		//文件名规范设置
		String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());//时间
		
		Random random = new Random();
		for(int i=0;i<3;i++){
			fileName = fileName+random.nextInt(10);
		}
		
		//截取文件后缀
		String oriFileName = mf.getOriginalFilename();//获取原始文件名
		System.out.println(oriFileName);
		String suffix = oriFileName.substring(oriFileName.lastIndexOf("."));
		
		//指定文件上传路径
		String realPath = BlogUtils.readProp("file_path")+"/itemUpload/"+("I_"+fileName+suffix);//绝对路径
		System.out.println(realPath);
		String relativePath = "/upload/"+fileName+suffix;//相对路径（存入数据库，防止IP变化导致不成功）
		//创建jersy客户端
		Client client = Client.create();
		//创建web对象资源(绝对路径)
		WebResource wr = client.resource(realPath);
		//上传
		wr.put(bs);
		
		*//**
		 * 使用fck源码提供的返回方法
		 * @return realPath
		 *//*
		UploadResponse upload = new UploadResponse(UploadResponse.EN_OK,realPath);
		response.getWriter().print(upload);
	}*/
	
}
