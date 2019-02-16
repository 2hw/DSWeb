package aboutme;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class aboutme
 */
@WebServlet("/aboutme")
public class aboutme extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public aboutme() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html);charset=UTF-8");
		PrintWriter out =  response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"<head>\r\n" + 
				"    <meta charset=\"UTF-8\">\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"    <title>Document</title>\r\n" + 
				"\r\n" + 
				"    <style>\r\n" + 
				"        body {\r\n" + 
				"        background-color:#87ceaf;\r\n" + 
				"\r\n" + 
				"        }\r\n" + 
				"        body div {\r\n" + 
				"            background-color: white;\r\n" + 
				"            margin: 10px;\r\n" + 
				"        }\r\n" + 
				"        .hdDiv, .ftDiv {\r\n" + 
				"            height: 100px;\r\n" + 
				"        }\r\n" + 
				"        .stDiv {\r\n" + 
				"            height: 500px;\r\n" + 
				"            padding: 20px;\r\n" + 
				"            text-align: center;\r\n" + 
				"        }\r\n" + 
				"        .btn-big {\r\n" + 
				"            width: 100px;\r\n" + 
				"            height: 20px;\r\n" + 
				"            color: white;\r\n" + 
				"            background-color:#70b4bd;\r\n" + 
				"            box-shadow: 3px;\r\n" + 
				"            text-align: center;\r\n" + 
				"        }\r\n" + 
				"        .hdDiv > .btn-big {\r\n" + 
				"            float:right;\r\n" + 
				"            margin:5px;\r\n" + 
				"            color: #253b9e;\r\n" + 
				"        }\r\n" + 
				"        .ftDiv {\r\n" + 
				"         text-align: center;\r\n" + 
				"      }\r\n" + 
				"    </style>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"    <div class=\"header\">\r\n" + 
				"        <div class=\"hdDiv\">\r\n" + 
				"            <button class=\"btn-big\">홈</button>\r\n" + 
				"            <button class=\"btn-big\">자기소개</button>\r\n" + 
				"            <button class=\"btn-big\">내사진</button>\r\n" + 
				"            <button class=\"btn-big\">몇시에요</button>\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"    <div class=\"section\">\r\n" + 
				"        <div class=\"stDiv\">\r\n" + 
				"            <div>\r\n" + 
				"                <h1>웹페이지 만들기 ~!</h1>\r\n" + 
				"                Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.\r\n" + 
				"            </div>\r\n" + 
				"            <button class=\"btn-big\" style=\"width: 80px; height: 80px;\">자기소개</button>\r\n" + 
				"            <button class=\"btn-big\" style=\"width: 80px; height: 80px;\">내사진</button>\r\n" + 
				"               \r\n" + 
				"            <div>\r\n" + 
				"                <img src=\"http://www.travelfreak.com/wp-content/uploads/2013/11/Walt-Disney-World-Castle-Wallpaper-.jpg\" alt=\"\" style=\"width: 200px; height: 200px;\">\r\n" + 
				"                <img src=\"./image/img1\" alt=\"\">\r\n" + 
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"    <div class=\"footer\">\r\n" + 
				"        <div class=\"ftDiv\">footer div</div>\r\n" + 
				"    </div>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}
}
