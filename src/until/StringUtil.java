package until;

public class StringUtil {

	/**
     * 判断空
     * @param str
     * @return
     */
    public static boolean isEmpty(String str){
        if(str==null||"".equals(str.trim())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * 判断空
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str){
        if((str!=null)&&!"".equals(str.trim())){
            return true;
        }else{
            return false;
        }
    }
    
    /**
     * 匹配%%
     * @param str
     * @return
     */
    public static String formatLike(String str){
        if(isNotEmpty(str)){
            return "%"+str+"%";
        }else{
            return null;
        }
    }

	protected String getNullToString(String key) {
		// System.out.println("baseaction getparameter :"+key+"  value:  "+request.getParameter(key));
		return (key) == null ? "" : (key).trim();
	}

	protected String getNullTo0(String key) {
		// System.out.println("baseaction getparameter :"+key+"  value:  "+request.getParameter(key));
		return (key) == null ? "0" : (key).trim();
	}

}
