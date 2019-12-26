package com.udemy.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class URL {

	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	public static Date convertDate(String textDate, Date defaultDate) {
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		sd.setTimeZone(TimeZone.getTimeZone("GMT"));
		try {
			return sd.parse(textDate);
		} catch (ParseException e) {
			return defaultDate;
		}
	}
}
