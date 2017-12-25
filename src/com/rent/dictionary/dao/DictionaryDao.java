package com.rent.dictionary.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rent.dictionary.bean.DictionaryBean;
@Repository
public  interface DictionaryDao
{
  public  List<DictionaryBean> getDictionary(DictionaryBean dictionaryBean);
}