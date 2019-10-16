
//Assume if there is a path there is a domain

public class Problem1 {
	//Uses other types as input so it can throw RuntimeException
	public static void getProtocol(int num) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getProtocol(boolean bool) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getProtocol(char ci) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getProtocol(String... num) {
		throw new RuntimeException("Can only enter one URL at a time");
	}
	public static void getDomain(boolean b) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getDomain(int i) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getDomain(char ci) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getDomain(String... num) {
		throw new RuntimeException("Can only enter one URL at a time");
	}
	public static void getPath(int num) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getPath(boolean bool) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getPath(char ci) {
		throw new RuntimeException("Urls must be a string");
	}
	public static void getPath(String... num) {
		throw new RuntimeException("Can only enter one URL at a time");
	}
	public static String getProtocol(String url) {
		//Handle empty strings
		if(url.compareTo("")==0){
			return "";
		}
		//Split the protocol from the rest of the string
		String[] splitProto = url.split("://");
		//To handle strings without a protocol
		if(splitProto.length == 1) {
			return "";
		}
		return splitProto[0];
	}
	public static String getDomain(String url) {
		if(url.compareTo("")==0){
			return "";
		}
		//When the URL had no Protocol
		if(getProtocol(url).compareTo("")==0) {
			String[] splitDomain = url.split("/");
			//The URL either had no path or no domain
			if(splitDomain.length == 1 && splitDomain[0].split(".").length == 1) {
				return "";
			}
			else if(splitDomain.length == 1 && splitDomain[0].split(".").length != 1) {
				return splitDomain[0];
			}
		}
		String[] splitProto = url.split("://");
		String rem = splitProto[1];
		String[] splitDomain = rem.split("/");
		return splitDomain[0];
	}
	public static String getPath(String url) {
		if(url.compareTo("")==0){
			return "";
		}
		//To handle strings without a protocol
		if(getProtocol(url).compareTo("")==0 && getDomain(url).compareTo("")==0) {
			return "";
		}
		else if(getProtocol(url).compareTo("")==0 && getDomain(url).compareTo("")!=0) {
			String[] splitDomain = url.split("/",2);
			if(splitDomain.length ==1) {
				return "";
			}
			return splitDomain[1];
		}
		String[] splitProto = url.split("://");
		//To handle strings without a protocol
		String rem = splitProto[1];
		String[] splitDomain = rem.split("/",2);
		return splitDomain[1];
	}
	public static void main(final String[] args) {

	}

}
