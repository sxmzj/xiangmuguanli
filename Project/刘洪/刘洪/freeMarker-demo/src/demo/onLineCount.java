package demo;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener   //�ڴ�ע���������Ǽ�����
public class onLineCount implements HttpSessionListener {

    public int count=0;
    public void sessionCreated(HttpSessionEvent arg0) {
        count++;
        arg0.getSession().getServletContext().setAttribute("Count", count);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent arg0) {
        count--;
        arg0.getSession().getServletContext().setAttribute("Count", count);
    }

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

���ƴ���
}
}