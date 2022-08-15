<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template match="/">
    <html><head>
        <title>XML/XSL Sample Note</title>
        <style type="text/css">
          body { background-color:#000080; color:#ffffff; 
                 font-family:arial,helvetica; font-size:12px; }
          th   { background-color:#444480; font-weight:bold; }
          td   { background-color:#888880; }
          .headline { font-weight:bold; font-size:24px; }
        </style>
      </head><body><div align="center"><span class="headline">Notes</span>
          <table border="0" cellspacing="0" cellpadding="5">
            <tr><th width="10%">to</th>
              <th width="10%">from</th>
              <th width="20%">heading</th>
              <th width="60%">body</th></tr>
            <xsl:for-each select="/document/note">
              <tr><td><xsl:value-of select="to"/></td>
                <td><xsl:value-of select="from"/></td>
                <td><xsl:value-of select="heading"/></td>
                <td><xsl:value-of select="body"/></td></tr>
            </xsl:for-each>
          </table></div></body></html>
  </xsl:template>
</xsl:stylesheet>
