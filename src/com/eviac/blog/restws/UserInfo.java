package com.eviac.blog.restws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// 这里@Path定义了类的层次路径。
// 指定了资源类提供服务的URI路径。
@Path("UserInfoService")
public class UserInfo {
	
	@GET
	@Produces("text/plain")
	@Path("/uu")
	public String getss(@QueryParam("name") String name,@QueryParam("age") int age) {
		System.out.println("name =" + name + " ; age =" + age);
		return "name =" + name + " ; age =" + age;
	}
	//http://localhost:8080/Tom/rest/UserInfoService/uu?name=rose&age=25
	
	
	// @GET表示方法会处理HTTP GET请求
	@GET
	// 这里@Path定义了类的层次路径。指定了资源类提供服务的URI路径。
	@Path("/name/{i}")
	// @Produces定义了资源类方法会生成的媒体类型。
	@Produces(MediaType.APPLICATION_JSON)
	// @PathParam向@Path定义的表达式注入URI参数值。
	public String userName(@PathParam("i") String i) {

		String name = i;
		return "<User>" + "<Name>" + name + "</Name>" + "</User>";
	}

	@GET
	@Path("/name")
	  @Produces(MediaType.TEXT_XML)
	  public String sayXMLHello() {
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
	  }
	
	@GET
	@Path("/age/{j}")
	@Produces(MediaType.TEXT_XML)
	public String userAge(@PathParam("j") int j) {

		int age = j;
		return "<User>" + "<Age>" + age + "</Age>" + "</User>";
	}
}
