import com.google.inject.ImplementedBy;

/**   
* @Title: HelloWorld.java 
* @Package  
* @Description: TODO(用一句话描述该文件做什么) 
* @author cosco gt.fan@msn.cn   
* @date 2016年3月1日 下午11:52:09 
* @version   
*/

/** 
* @ClassName: HelloWorld 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author cosco gt.fan@msn.cn 
* @date 2016年3月1日 下午11:52:09 
*  
*/
@ImplementedBy(HelloWorldImpl.class)
public interface HelloWorld {

	String sayHello();
	
}
