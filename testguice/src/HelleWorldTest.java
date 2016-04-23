import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.Scopes;

/**   
* @Title: HelleWorldTest.java 
* @Package  
* @Description: TODO(用一句话描述该文件做什么) 
* @author cosco gt.fan@msn.cn   
* @date 2016年3月1日 下午11:53:16 
* @version   
*/

/** 
* @ClassName: HelleWorldTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author cosco gt.fan@msn.cn 
* @date 2016年3月1日 下午11:53:16 
*  
*/
public class HelleWorldTest {

	/** 
	* @Title: main 
	* @Description: TODO(这里用一句话描述这个方法的作用) 
	* @param @param args    设定文件 
	* @return void    返回类型 
	* @throws 
	*/
	@Inject
	private HelloWorld hw;

	
	public HelloWorld getHw() {
		return hw;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Injector inj = Guice.createInjector(new Module(){
//
//			@Override
//			public void configure(Binder binder) {
//				// TODO Auto-generated method stub
//				binder.bind(HelloWorld.class).to(HelloWorldImpl.class).in(Scopes.SINGLETON);
//				
//			}
//				});
		
		HelleWorldTest ht = Guice.createInjector().getInstance(HelleWorldTest.class);
		
		ht.getHw().sayHello();
	}

}
