interface Logging
{
	public void log(String msg);
}

class LogText implements Logging
{
	public LogText()
	{
		System.out.println("Logging: text format");
	}
	public void log(String msg)
	{	
		System.out.println(msg);
	}
}
class LogXML implements Logging
{
	public LogXML()
	{
		System.out.println("Logging: <type>XML Format</type>");
	}
	public void log(String msg)
	{	
		System.out.println("<xml><msg>"+msg+"</msg></xml>");
	}
}
class LogHTML implements Logging
{
	public LogHTML()
	{
		System.out.println("Logging: HTML format");
	}
	public void log(String msg)
	{	
		System.out.println("<html><body>"+msg+"</body></html>");
	}
}
class LogMD implements Logging
{
	public LogMD(){
		System.out.println("Logging: MD format");
	}
	public void log(String msg)
	{
		System.out.println("# "+msg);
	}
}

class LogFactory{
	public static Logging getLog(String type){
        Logging logfile; 
		if (type.equalsIgnoreCase("xml"))
			logfile = new LogXML();
		else if (type.equalsIgnoreCase("html"))
			logfile = new LogHTML();
		else if (type.equalsIgnoreCase("md"))
			logfile = new LogMD();
		else
			logfile = new LogText();
		return logfile;	
	}
}

class Analysis
{
	public static void main(String[] args)
	{
		if (args.length != 1)
		{
			System.out.println("Usage: java Analysis type");
			System.exit(-1);
		}
		String type = args[0];
		
		Logging logfile = LogFactory.getLog(type);
		
		logfile.log("Starting application...");
		logfile.log("... read in data file to analyze ...");
		logfile.log("... Clustering data for analysis ...");
		logfile.log("... Printing analysis results ...");
	}
}
