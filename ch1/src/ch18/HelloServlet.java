package ch18;

//現在時刻を表示するサーブレット
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.*;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Date d = new Date();
		PrintWriter w = res.getWriter();
		res.setContentType("text/html");
		w.write("<html><body>");
		w.write("Today is " + d.toString());
		w.write("</body></html>");
	}

}
