<%

String message = (String)session.getAttribute("Message");
if (null != request.getAttribute("Message")) {

					Object succ = request.getAttribute("Message");
					out.println("<p>" + succ + "</p>");
				}


%>