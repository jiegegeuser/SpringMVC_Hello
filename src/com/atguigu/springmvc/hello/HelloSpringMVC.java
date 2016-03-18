package com.atguigu.springmvc.hello;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.springmvc.entity.User;

@SessionAttributes(value={"user"})
@Controller
public class HelloSpringMVC {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello (){
		System.out.println("OK!This is the method!");
		return "ok";
	}
	@RequestMapping(value="/testParams", method=RequestMethod.GET,params={"age","name!=tom"})
	public String testParams (){
		System.out.println("testParams");
		return "ok";
	}
	@RequestMapping(value="/testHeaders", method=RequestMethod.GET, headers={"host=localhost:8086"})
	public String testHeaders (){
		System.out.println("testHeaders");
		return "ok";
	}
	//?代表一个占位符    *代表一个或多个占位符   **代表一个或多个路径
	@RequestMapping(value="/testAntStyle/**", method=RequestMethod.GET)
	public String testAntStyle(){
		System.out.println("testAntStyle");
		return "ok";
	}
	
	@RequestMapping(value="/testPatyVariable/{id}", method=RequestMethod.GET)
	public String testPatyVariable(@PathVariable("id") Integer id){
		System.out.println("testPatyVariable id= " + id);
		return "ok";
	}
	
	@RequestMapping(value="/hello/{id}", method=RequestMethod.DELETE)
	public String testDelete (@PathVariable("id") Integer id ){
		System.out.println("testDelete id= " + id);
		return "ok";
	}
	@RequestMapping(value="/hello/{id}", method=RequestMethod.PUT)
	public String testPut (@PathVariable("id") Integer id){
		System.out.println("testPut id= " + id);
		return "ok";
	}
	
	@RequestMapping(value="/testGet/{id}", method=RequestMethod.GET)
	public String testGet (@PathVariable("id") Integer id){
		System.out.println("testGet id= " + id);
		return "ok";
	}
	
	@RequestMapping(value="/testRequestParams", method=RequestMethod.GET)
	public String testRequestParams (@RequestParam("id") Integer[] id, 
									 @RequestParam(value="name",required=true,defaultValue="tom") String name){
		for (int i = 0; i < id.length; i++) {
			System.out.println("testGet id= " + id[i]);
		}
		System.out.println("name= "+name);
		return "ok";
	}
	
	@RequestMapping(value="/testRequestHeader", method=RequestMethod.GET)
	public String testRequestHeader(@RequestHeader("host") String host){
		System.out.println("host = "+ host);
		return "ok";
	}
	
	@RequestMapping(value="/testCookieValue", method=RequestMethod.GET)
	public String testCookieValue(@CookieValue("JSESSIONID") String id){
		System.out.println("jsessionid = "+ id);
		return "ok";
	}
	
	@RequestMapping(value="/testPojo", method=RequestMethod.POST)
	public String testPojo(User user, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException{
		request.setCharacterEncoding("UTF-8");
		System.out.println(user.toString());
		return "ok";
	}
	
	
	@RequestMapping(value="/testServletAPI", method=RequestMethod.GET)
	public void testServletAPI(HttpServletRequest request, HttpServletResponse response, Writer writer) throws IOException {
		System.out.println(request.getHeader("Cookie"));
		System.out.println(response.getCharacterEncoding());
		writer.write("hey baby");
	}
	
	@RequestMapping(value="/testModelAndView", method=RequestMethod.GET)
	public ModelAndView testModelAndView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("username", "joey");
		mv.setViewName("ok");
		return mv;
	}
	
	@RequestMapping(value="/testMap_Model_ModelMap", method=RequestMethod.GET)
	public String testMap_Model_ModelMap(Map<String,Object> m1,Model m2, ModelMap m3){
		System.out.println("testMap_Model_ModelMap");
		m1.put("m1", "java.util.Map<String, Object>");
		m2.addAttribute("m2", "org.springframework.ui.Model");
		m3.addAttribute("m3", "org.springframework.ui.ModelMap");
		
		System.out.println(m1 == m2);
		System.out.println(m1 == m3);
		System.out.println(m3 == m2);
		
		System.out.println(m1.getClass().getName());
		System.out.println(m2.getClass().getName());
		System.out.println(m3.getClass().getName());
		return "ok";
	}
	
	@RequestMapping(value="/testSessionAttributes", method=RequestMethod.GET)
	public String testSessionAttributes(Map<String ,Object> map) {
		User user = new User(11, "judy", "123123", "mars", "femal");
		map.put("user", user);
		map.put("subway", "beijing line 3");
		map.put("subway2", "beijing line 2");
		map.put("currentTime", new Date());
		return "ok";
	}
	
	@RequestMapping(value="/testModelAttribute", method=RequestMethod.PUT)
	public String testModelAttribute(@ModelAttribute("user") User user) {
		System.out.println("testModelAttribute");
		System.out.println("after update:"+user);
		return "ok";
	}
	
	@ModelAttribute
	public void getUserById(@RequestParam(value="id",required=false) Integer id, Map<String,Object> map){
		User user = new User(1, "tom", "321321", "UnitedKingDom", "femal");
		map.put("user", user);
		System.out.println("from DB:"+user);
	}
	
	@RequestMapping(value="/testMySelfView",method=RequestMethod.GET)
	public String testMySelfView(){
		System.out.println("testMySelfView");
		return "myView";
	}
	
	@RequestMapping(value="/testI18N",method=RequestMethod.GET)
	public String testI18N(){
		System.out.println("testI18N");
		return "ok";
	}
	
	@RequestMapping(value="/testMvcViewController",method=RequestMethod.GET)
	public String testMvcViewController(){
		System.out.println("testMvcViewController");
		return "ok";
	}
	
	@RequestMapping(value="/testForward",method=RequestMethod.GET)
	public String testForward(){
		System.out.println("testForward");
		return "forward:/WEB-INF/views/forward1.jsp";
	}
	@RequestMapping(value="/testRedirect",method=RequestMethod.GET)
	public String testRedirect(){
		System.out.println("testRedirect");
		return "redirect:/redirect.jsp";
	}
	
}
