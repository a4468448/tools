package sq.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间帮助类
 * @author Administrator
 *
 */
public class DateUtil {
	 /**
	  * 得到当前时间
	  * @return
	  */
	 public static String getTime(){ 
		 SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		 System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
		 return df.format(new Date());
	 }
	 /**
     * 时间格式化 字符串转时间  返回yyyy-MM-dd HH:mm:ss
     * @param str
     * @return
     */
    public static Date strFormatToDate(String str) {
		   SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		   Date date = null;
		   try {
			   date = format.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		   return date;
	}
    /**
     * 时间格式化 字符串转时间  
     * formatstr:格式
     * @param str
     * @return
     */
    public static Date strFormatToDate(String str,String formatstr) {
		   SimpleDateFormat format = new SimpleDateFormat(formatstr);
		   Date date = null;
		   try {
			   date = format.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		   return date;
	}
    /**
   	 * 时间格式化  返回yyMMddHH
   	 * @param date
   	 * @return
   	 */
   public static String formatGetDay(Date date){
	   	SimpleDateFormat format=new SimpleDateFormat("yyMMddHH");// 
	   	String dateStr = format.format(date);
	   	return dateStr;
   }
   /**
    * 时间格式化 字符串转时间  
    * formatstr:格式
    * @param str
    * @return
    */
   public static String formatGetDay(Date date,String formatStr){
	   	SimpleDateFormat format=new SimpleDateFormat(formatStr);
	   	String dateStr = format.format(date);
	   	return dateStr;
  }
}
