package com.xwx.test;


import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.xwx.common.utils.FileUtil;
import com.xwx.common.utils.RandomUtil;
import com.xwx.common.utils.StringUtil;

public class TestUtilss {

	@Test
	public void test() {
		String str = "abc";
		boolean num = StringUtil.isNull(str);
		System.out.println("判断字符串是否为空"+num);
		boolean email = StringUtil.isEmail(str);
		System.out.println("判断是否为邮箱"+email);
		boolean phoneNum = StringUtil.isPhoneNum(str);
		System.out.println("判断是否为手机号"+phoneNum);
		String FileName = "D:\\abc.txt";
		List<String> readTextFileToList = FileUtil.readTextFileToList(FileName);
		System.out.println("将文件存到集合里"+readTextFileToList);
		int random = RandomUtil.random(1, 120);
		System.out.println("返回某个时间段的数据"+random);
		
		int[] random2 = RandomUtil.random(0, 7, 4);
		
		System.out.println("获取的随机数位");
		for (int i : random2) {
			System.out.println(i);
		}
		
	}

}
