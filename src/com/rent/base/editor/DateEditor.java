package com.rent.base.editor;

import java.beans.PropertyEditorSupport;

import org.springframework.util.StringUtils;

import until.DateFormat;
import until.DateUtil;

public class DateEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		if (!StringUtils.hasText(text)) {
			setValue(null);
		} else {
			if(DateFormat.isDate(text))  //yyyy-MM-dd 判定
			{
				setValue(DateUtil.string2Date(text, "yyyy-MM-dd"));
			}
			if(DateFormat.isDateTime(text)) //yyyy-MM-dd hh:mm:ss 判定
			{
				setValue(DateUtil.string2Date(text, "yyyy-MM-dd hh:mm:ss"));
			}
			if(DateFormat.isDateTimeMM(text)) //yyyy-MM-dd hh:mm 判定
			{
				setValue(DateUtil.string2Date(text, "yyyy-MM-dd hh:mm"));
			}
		}
	}

	@Override
	public String getAsText() {

		return getValue().toString();
	}
}
