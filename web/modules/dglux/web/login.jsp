<%@ include file="/WEB-INF/jsp/include/tech.jsp" %>
<html>
<head>
  <title>Mango Automation</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="stylesheet" type="text/css" href="${modulePath}/web/dgluxlogin.css">
</head>
<body>
  <table align="center" border="0" height="100%" width="100%">
    <tbody>
      <tr>
        <td align="center" height="100%" valign="middle" width="100%">
          <table id="topImageTable" align="center">
            <tbody>
              <tr>
                <td>
                  <img src="${modulePath}/web/dglux_bmi.png" alt="DGLux">
                </td>
                <td rowspan="20"></td>
              </tr>
            </tbody>
          </table>
          <br/>
          <br/>
          <br/>
          <form id="loginForm" method="post" action="/dglux/login.htm">
            <div>
              <label>User name:</label>
              <input class="textfield" name="username" size="15" type="text"/>
            </div>
            
            <c:set var="msg" value="${m2m2:contextualMessage('username', result, pageContext)}"/>
            <c:if test="${!empty msg}"><div class="failed">${msg}</div></c:if>
            
            <div>
              <label>Password:</label>
              <input class="textfield" name="password" size="15" type="password"/>
            </div>
            
            <c:set var="msg" value="${m2m2:contextualMessage('password', result, pageContext)}"/>
            <c:if test="${!empty msg}"><div class="failed">${msg}</div></c:if>
            
            <div>
              <input type="submit" value="Login"/>
            </div>
            
            <c:set var="msg" value="${m2m2:genericMessage(result, pageContext)}"/>
            <c:if test="${!empty msg}"><div class="failed">${msg}</div></c:if>
          </form>
        </td>
      </tr>
    </tbody>
  </table>
</body>
</html>