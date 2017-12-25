package com.rent.dictionary.manager;

import java.util.List;

import com.rent.dictionary.bean.DictionaryBean;

public interface DictionaryManager {
	public  List<DictionaryBean> getDictionary(DictionaryBean dictionaryBean);
}
