package com.web.traing.util;

import org.springframework.stereotype.Service;

@Service
public class MyUtil {
	public int getPageCount(int numPerPage, int dataCount) {
		return (int) Math.ceil(dataCount/numPerPage);
	}
	
	public String pageIndexList(int currentPage, int totalPage, String listUrl) {
		return listUrl;
	}
}
