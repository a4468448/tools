package sq.tools;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class JsonUtil {
	
	/**
	 * 将对象转换为json字符串
	 * @param Object obj
	 * @return String
	 */
	public static String getJsonString(Object obj){
		return JSON.toJSONString(obj);
	}
	
	/**
	 * 将json字符串转换为javabean
	 * @param String jsonStr 
	 * @param Class<T> cls
	 * @return T
	 */
	 public static <T> T getJavaBean(String jsonStr, Class<T> cls){
        T t = JSON.parseObject(jsonStr, cls);
        return t;
	 }
	 /**
	  *将json字符串换为 List<javabean>
	  * @param jsonStr
	  * @param cls
	  * @return List<T>
	  */
	  public static <T> List<T> getListJavaBean(String jsonStr, Class<T> cls){
		  List<T> list = JSON.parseArray(jsonStr, cls);
	      return list;
	  }
	    
	  /**
	   * 将json字符串转换为List<Map<String,Object>>
	   *@param jsonStr
	   *@return
	   */
	   public static List<Map<String, Object>> getListMap(String jsonStr){
		    List<Map<String, Object>> list = JSON.parseObject(jsonStr, new TypeReference<List<Map<String, Object>>>(){});
		    return list;
	   }

}
