package com.gsmggk.mypacker.zip4j.service.impl;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gsmggk.mypacker.model.Item;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class TestZip4jServiceImpl {

	private Zip4jServiceImpl service;
	ZipFile zf = null;
	@BeforeTest
	public void beforeTest() {
		service = new Zip4jServiceImpl();
	}

	@Test
	public void testOpenZip() {
		String zipFilePath = "c://work/out/data.zip";
	
		try {
		 zf= service.openZip(zipFilePath);
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertNotNull(zf, "Must be not null");
	}
	
	@Test(dependsOnMethods = { "testOpenZip" })
	public void testZipFile() {
		String name = "data.in";
		String pathIn = "c://work/in/data.in";
		Item item = new Item();
		item.setPath(pathIn);

		item.setName(name);
		service.zipFile(zf, item);

	}
}
