package client;

import java.io.IOException;

import org.junit.Test;
import org.restlet.data.Form;
import org.restlet.representation.Representation;
import org.restlet.resource.ClientResource;

public class test {

	// @Test
	public void test() throws IOException {
		// TODO Auto-generated method stub

		ClientResource client = new ClientResource("http://localhost:8080/ybd_yc/user?method=getuserinfo");
		Representation result = client.get(); // ����get����
		System.out.println(result.getText());
	}

	@Test
	public void test1() throws IOException {
		String url = "http://localhost:8080/ybd_yc/testfdsfds";
		ClientResource client = new ClientResource(url);
		// ������
		Form form = new Form();
		form.add("name", "zhuxun");
		form.add("sex", "M");
		// ��post��ʽ�ύ��
		Representation representation = client.post(form);
		System.out.println(representation.getText());
	}

}
