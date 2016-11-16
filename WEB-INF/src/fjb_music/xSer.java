package fjb_music;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class xSer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp){
		// TODO 自動生成されたメソッド・スタブ
		String url = "music_detail";
		RequestDispatcher rd = req.getRequestDispatcher(url);
		//rd.forward(req, resp);
	}

}
