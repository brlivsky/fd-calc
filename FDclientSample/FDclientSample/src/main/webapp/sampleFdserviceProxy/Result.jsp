<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleFdserviceProxyid" scope="session" class="com.fdservice.service.FdserviceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleFdserviceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleFdserviceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleFdserviceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.fdservice.service.Fdservice getFdservice10mtemp = sampleFdserviceProxyid.getFdservice();
if(getFdservice10mtemp == null){
%>
<%=getFdservice10mtemp %>
<%
}else{
        if(getFdservice10mtemp!= null){
        String tempreturnp11 = getFdservice10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String amount_1id=  request.getParameter("amount16");
        double amount_1idTemp  = Double.parseDouble(amount_1id);
        String noOfDays_2id=  request.getParameter("noOfDays18");
        int noOfDays_2idTemp  = Integer.parseInt(noOfDays_2id);
        String ageOfACHolder_3id=  request.getParameter("ageOfACHolder20");
        int ageOfACHolder_3idTemp  = Integer.parseInt(ageOfACHolder_3id);
        double calculateFD13mtemp = sampleFdserviceProxyid.calculateFD(amount_1idTemp,noOfDays_2idTemp,ageOfACHolder_3idTemp);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(calculateFD13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>