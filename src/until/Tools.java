package until;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

/**
 * 公共方法类

 * 
 */
public class Tools {

	/**
	 * 得到当前日期的字符串
	 * 
	 * @param pattern
	 * @return
	 */
	public static String getStrCurrentDate() {
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}

	public static String getStrCurrentHour() {
		return new SimpleDateFormat("HH").format(new Date());
	}

	public static String getStrCurrentMinute() {
		return new SimpleDateFormat("mm").format(new Date());
	}

	/**
	 * 当前月
	 * 
	 * @return
	 */
	public static String getStrCurrentMonth() {
		return new SimpleDateFormat("yyyy-MM").format(new Date());
	}

	/**
	 * 返回当前日期和时间的字符串
	 * 
	 * @return
	 */
	public static String getStrDateTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	/**
	 * 返回当前日期和时间的字符串
	 * 
	 * @return
	 */
	public static String getStrDateToFile() {
		return new SimpleDateFormat("yyyyMMdd").format(new Date());
	}
	public static String getStrDateTimeToFile() {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	}

	public static String getEndDate(String bdate, String jg, String cxys) {
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(bdate));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		if ("1".equals(jg)) {
			cal.add(Calendar.YEAR, 1);
			cal.add(Calendar.DAY_OF_YEAR, -1);
		} else if ("2".equals(jg)) {
			cal.add(Calendar.MONTH, 6);
			cal.add(Calendar.DAY_OF_YEAR, -1);
		} else if ("3".equals(jg)) {
			cal.add(Calendar.MONTH, 3);
			cal.add(Calendar.DAY_OF_YEAR, -1);
		} else if ("4".equals(jg)) {
			cal.add(Calendar.MONTH, 1);
			cal.add(Calendar.DAY_OF_YEAR, -1);
		} else if ("5".equals(jg)) {
			cal.add(Calendar.MONTH, Integer.valueOf(cxys));
			cal.add(Calendar.DAY_OF_YEAR, -1);
		}
		return new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime());
	}

	public static String formatDate(String date, String pattern) {
		Calendar cal = Calendar.getInstance();
		String result = "";
		try {
			cal.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(date));
			result = new SimpleDateFormat(pattern).format(cal.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * 读取配置文件找到模板路径
	 * 
	 * @param key
	 * @return
	 */
	public static String readPath(String key) {
		Properties prop = new Properties();
		String path = Thread.currentThread().getContextClassLoader().getResource("path.properties").getPath();
		
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(path));
			prop.load(in);
			String value = new String(prop.getProperty(key).getBytes("ISO-8859-1"), "UTF-8");
			return value;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static String getDate(String str) {
		String d = "";
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date date = sdf1.parse(str);
			d = sdf2.format(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return d;
	}

	/**
	 * 根据身份证获取生出日期
	 * 
	 * @param cardid
	 * @return
	 */
	public static String getDateForCardid(String cardid) {
		String date = cardid.substring(6, 10) + "-" + cardid.substring(10, 12) + "-" + cardid.substring(12, 14);
		return date;
	}

	public static void main(String[] args) {
		// System.out.println(UnitTools.formatDate("2014-05-25 22:22:22",
		// "yyyy年MM月"));
		// readPath("meterpath");
		// getZhDate("Fri Mar 6 00:00:00 UTC 0800 2015");
	}
	/**
	 * 加密
	 * @param content 原码
	 * @return
	 */
	public static String MD5Code(String content) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] byteArray = content.getBytes("UTF-8");
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			messageDigest.update(byteArray);
			byte[] digest = messageDigest.digest();
			int length = digest.length;
			char str[] = new char[length * 2];
			int k = 0;
			for (int i = 0; i < length; i++) {
				byte mData = digest[i];
				str[k++] = hexDigits[mData >>> 4 & 0xf];
				str[k++] = hexDigits[mData & 0xf];
			}
			return new String(str);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("不支持hash算法：MD5", e);
		} catch (UnsupportedEncodingException e) {
			throw new RuntimeException("不支持UTF-8编码", e);
		}
	}

}
