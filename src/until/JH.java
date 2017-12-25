package until;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public final class JH
{
  private JSONObject jo;

  public static JH newJH()
  {
    return new JH();
  }

  public JH setJSON(JSONObject jo)
  {
    this.jo = jo;
    return this;
  }

  private JH() {
    this.jo = new JSONObject();
  }

  public JH set(String key, Object value) {
    this.jo.put(key, value);
    return this;
  }

  public JSONObject getJSON() {
    return this.jo;
  }

  public String getJSONString() {
    return JSON.toJSONString(this.jo,SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat,
    		SerializerFeature.WriteDateUseDateFormat, SerializerFeature.WriteNullStringAsEmpty,
    		SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.WriteNullListAsEmpty,
    		SerializerFeature.WriteNullNumberAsZero);
  }

  public JH setAll(Map<? extends String, ? extends Object> m) {
    this.jo.putAll(m);
    return this;
  }

  public JH setStatus(int status, String message) {
    this.jo.put("status", Integer.valueOf(status));
    if (message != null)
      this.jo.put("message", message);
    return this;
  }

  public JH setStatus(int status) {
    return setStatus(status, null);
  }

  public Object get(Object key) {
    return this.jo.get(key);
  }

  public BigDecimal getBigDecimal(String key) {
    return this.jo.getBigDecimal(key);
  }

  public BigInteger getBigInteger(String key) {
    return this.jo.getBigInteger(key);
  }

  public Boolean getBoolean(String key) {
    return this.jo.getBoolean(key);
  }

  public boolean getBooleanValue(String key) {
    return this.jo.getBooleanValue(key);
  }

  public Byte getByte(String key) {
    return this.jo.getByte(key);
  }

  public byte getByteValue(String key) {
    return this.jo.getByteValue(key);
  }

  public byte[] getBytes(String key) {
    return this.jo.getBytes(key);
  }

  public java.util.Date getDate(String key) {
    return this.jo.getDate(key);
  }

  public Double getDouble(String key) {
    return this.jo.getDouble(key);
  }

  public double getDoubleValue(String key) {
    return this.jo.getDoubleValue(key);
  }

  public Float getFloat(String key) {
    return this.jo.getFloat(key);
  }

  public float getFloatValue(String key) {
    return this.jo.getFloatValue(key);
  }

  public int getIntValue(String key) {
    return this.jo.getIntValue(key);
  }

  public Integer getInteger(String key) {
    return this.jo.getInteger(key);
  }

  public JSONArray getJSONArray(String key) {
    return this.jo.getJSONArray(key);
  }

  public JSONObject getJSONObject(String key) {
    return this.jo.getJSONObject(key);
  }

  public Long getLong(String key) {
    return this.jo.getLong(key);
  }

  public long getLongValue(String key) {
    return this.jo.getLongValue(key);
  }

  public <T> T getObject(String key, Class<T> clazz) {
    return this.jo.getObject(key, clazz);
  }

  public Short getShort(String key) {
    return this.jo.getShort(key);
  }

  public short getShortValue(String key) {
    return this.jo.getShortValue(key);
  }

  public java.sql.Date getSqlDate(String key) {
    return this.jo.getSqlDate(key);
  }

  public String getString(String key) {
    return this.jo.getString(key);
  }

  public Timestamp getTimestamp(String key) {
    return this.jo.getTimestamp(key);
  }
  
  /**
   * 从指定的Map中查询返回指定的值，并返回
   * @param m
   * @param name
   * @return
   */
  public static String getByMap(Map m,String name){
	  return "null".equals(m.get(name)) || m.get(name)==null || "".equals(m.get(name))?"":m.get(name).toString().trim();
  };
  /**
   * 如果flag  true 返回 yyyy-mm-dd  false 返回 yyyy-mm-dd hh-mi-ss
   * @param m
   * @param name
   * @param flag
   * @return
   */
  public static String getDateByMap(Map m,String name,boolean flag){
	  String reVal = "";
	  if(flag==true){
		  reVal =  m.get(name)==null||"".equals(m.get(name))?"":m.get(name).toString().trim().substring(0, 10);
	  }else{
		  reVal =  m.get(name)==null||"".equals(m.get(name))?"":m.get(name).toString().trim().substring(0, 19);
	  }
	  return reVal;
	  
  };
}
