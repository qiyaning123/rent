package until;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ResponseUtil {
	protected HttpServletRequest request;
	protected static HttpServletResponse response;
	protected HttpServletRequest getRequest() {
		return request;
	}

	protected HttpServletResponse getResponse() {
		return response;
	}
	
	private static ValueFilter filter = new ValueFilter() {
        @Override
        public Object process(Object obj, String s, Object v) {
            if (v == null)
                return "";
            return v;
        }
    };

	public static void write(HttpServletResponse response,JSONObject json) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println(json);
		out.print(json);
		out.flush();
		out.close();
	}
	public static void writeJson(HttpServletResponse response,JSONObject json) throws IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		System.out.println(JSON.toJSONString(json,filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty));
		out.write(JSON.toJSONString(json,filter, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullStringAsEmpty));
		out.flush();
		out.close();
	}
	
	/**
	 * 文件接收
	 */
	public File[] file;// 实际上传文件
	public String[] fileContentType; // 文件的内容类型
	public String[] fileFileName; // 上传文件名
	public String fileCaption;// 上传文件时的备注
	public ServletContext context;

	protected File[] getFile() {
		return file;
	}

	protected void setFile(File[] file) {
		this.file = file;
	}

	protected String[] getFileContentType() {
		return fileContentType;
	}

	protected void setFileContentType(String[] fileContentType) {
		this.fileContentType = fileContentType;
	}

	protected String getFileCaption() {
		return fileCaption;
	}

	protected void setFileCaption(String fileCaption) {
		this.fileCaption = fileCaption;
	}

	protected ServletContext getContext() {
		return context;
	}

	protected void setContext(ServletContext context) {
		this.context = context;
	}

	protected String[] getFileFileName() {
		return fileFileName;
	}

	protected void setFileFileName(String[] fileFileName) {
		this.fileFileName = fileFileName;
	}

	/**
	 * 接收图片
	 */
	protected String receiveFile(String imgpath) {
		String path = this.getRequest().getScheme() + "://" + this.getRequest().getServerName() + ":"
				+ this.getRequest().getServerPort() + imgpath;
		String baseServeradd1 = this.getRequest().getScheme();
		String baseServeradd2 = this.getRequest().getScheme() + "://" + this.getRequest().getServerName();
//		String path = ServletActionContext.getServletContext().getRealPath("/");
		String targetDirectory = new File(path).getParent() + imgpath+Tools.getStrDateToFile()+"/";
		File fielTest = new File(targetDirectory);
		if (!fielTest.exists()) {
			fielTest.mkdir();
		}
		// 重命名上传文件
		File[] fs = file;
		String[] picName = fileFileName;
		String newPicName = "";
		String picNames = "";
		String ext = "";
		if (fs != null) {
			// 把要上传的文件copy过去
			for (int i = 0; i < fs.length; i++) {
				// newPicName = UnitTools.getStrDateTimeToFile() + picName[i];//
				// 图片名
				ext = picName[i].substring(picName[i].lastIndexOf("."), picName[i].length());
				newPicName = Tools.getStrDateTimeToFile() + "_" + i + ext;// 图片名
				// 在指定目录创建文件
				File target = new File(targetDirectory, newPicName);
				try {
					FileUtils.copyFile(fs[i], target);
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.out.println(newPicName);
				picNames += imgpath+Tools.getStrDateToFile()+"/" + newPicName + ",";
			}
		}
		if (null != picNames && !"".equals(picNames)) {
			picNames = picNames.substring(0, picNames.length() - 1);
		}
		return picNames;
	}
}
