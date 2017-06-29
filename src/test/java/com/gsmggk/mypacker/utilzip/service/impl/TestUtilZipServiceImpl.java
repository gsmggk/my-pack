package com.gsmggk.mypacker.utilzip.service.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gsmggk.mypacker.model.Item;

public class TestUtilZipServiceImpl {
	private UtilZipServiceImpl service;
	ZipOutputStream zos;

	@BeforeTest
	public void beforeTest() {
		service = new UtilZipServiceImpl();
	}

	@Test
	public void testOpenZip() {

		String zipFilePath = "c://work/out/data.zip";

		try  {
			zos = service.openZip(zipFilePath);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		Assert.assertNotNull(zos);
	}

	@Test(dependsOnMethods = { "testOpenZip" })
	public void testZipFile() {
		String name = "data.in";
		String pathIn = "c://work/in/data.in";
		Item item = new Item();
		item.setPath(pathIn);

		item.setName(name);
		try {
			service.zipFile(zos, item);
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = { "testZipFile" })
	public void testCloseZip() {
		try {
			service.closeZip(zos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
