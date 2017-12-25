package com.rent.dictionary.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rent.dictionary.bean.DictionaryBean;
import com.rent.dictionary.dao.DictionaryDao;
import com.rent.dictionary.manager.DictionaryManager;
@Service
public class DictionaryManagerImpl implements DictionaryManager {
	@Resource
	private DictionaryDao dao;
	@Override
	public  List<DictionaryBean> getDictionary(DictionaryBean dictionaryBean){
		return dao.getDictionary(dictionaryBean);
	}
}
