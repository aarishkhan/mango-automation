<%--
    Mango - Open Source M2M - http://mango.serotoninsoftware.com
    Copyright (C) 2006-2011 Serotonin Software Technologies Inc.
    @author Matthew Lohbihler
    
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/.
--%>
<%@ include file="/WEB-INF/jsp/include/tech.jsp" %>

<tag:page dwr="DgluxDwr" onload="init">
  <script type="text/javascript">
    function init() {
        doExport();
    }
    
    function doExport() {
        DgluxDwr.createExportData(3,true,true, null, null, function(data) {	
            $set("emportData", data);
        });
    }

  </script>
  
  <div style="clear:both;">
    <span class="formLabelRequired"><fmt:message key="emport.data"/></span><br/>
    <textarea rows="40" cols="150" id="emportData"></textarea>
  </div>
</tag:page>

