<html>
<head>
<title>Run PMD on your Sourceforge project</title>
<script language="JavaScript"> 
function highlight() {
	var strURL = window.location.toString();
	var myId = null;
	var hilight = strURL.split("#");
	var hash=hilight[1];
	
	if(hash != null) {
	  if(hash.substr(0,6) == 'prev2-') {
	    hash = hash.substr(6);
	  }
	  myId = document.getElementById(hash);
	  if(myId != null) {
	    myId.bgColor="#c0c0c0";
	  }
	}
}
</script>
</head>
<BODY onLoad="javascript:highlight();">
<center>
<a href="http://pmd.sourceforge.net/">
<img src="http://sourceforge.net/sflogo.php?group_id=56262&type=5" alt="PMD" border="0"/>
</a></center>

<center>PMD-WEB</center>

<p><a href="http://pmd.sf.net/">PMD</a> is a Java source code analysis tool - it checks your code for unused fields, empty try/catch/finally/if/while blocks, unused method parameters, and stuff like that.  This table contains the results of running PMD's <a href="http://pmd.sourceforge.net/rules/unusedcode.html">unused code ruleset</a> against a bunch of Sourceforge projects.  The JavaNCSS column contains the lines of code analyzed as reported by the excellent <a href="http://www.kclee.de/clemens/java/javancss/">JavaNCSS</a> utility.  This report is regenerated once a day.  The last run finished at <!--Fragment key="lastruntime"-->. 

<p>Want to run PMD on your Java Sourceforge project?  Please post <a href="http://sourceforge.net/forum/forum.php?forum_id=188192">here</a> or email <a href="mailto:tom@infoether.com">tom@infoether.com</a>.  Note that you can link to your project's PMD results <a href="http://sourceforge.net/forum/message.php?msg_id=2365257">as illustrated here</a>.  

<br>
<table align=center>
<a name="header"></a>
<tr>
<th>Project</th>
<th>Home page</th>
<th>NCSS</th>
<th>Problems</th>
<th>Percentage<br>Unused Code</th>
<th>Duplicate<br>Code</th>
<th>
<a href="http://ruby-doom.rubyforge.org/?ref=pmd">DOOM</a>
<br>
<a href="http://ruby-doom.rubyforge.org/?ref=pmd">Map</a>
</th>
</tr>
