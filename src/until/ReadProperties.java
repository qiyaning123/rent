package until;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadProperties {


	private static Properties properties = null;
	
	public static String getValue(String key){
		BufferedInputStream bufferedInputStream = null;
		try{
			InputStream inputStream = ReadProperties.class.getResourceAsStream("/global.properties");
			if(inputStream != null){
				bufferedInputStream = new BufferedInputStream(inputStream);
			} else {
				bufferedInputStream = new BufferedInputStream(new FileInputStream("/global.properties"));
			}
			
			if(bufferedInputStream == null){
				throw new RuntimeException("配置文件读取失败：" + "/global.properties");
			}
			properties = new Properties();
			properties.load(bufferedInputStream);
			System.out.println("class read prop properties:"+properties.getProperty(key));
			return properties.getProperty(key);
		} catch (IOException e) {
			throw new RuntimeException(e);
		} finally {
			if(bufferedInputStream != null){
				try {
					bufferedInputStream.close();
				} catch (IOException e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println(ReadProperties.getValue("imagePath"));
	}
}
