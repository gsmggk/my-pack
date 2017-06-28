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
	public void BeforeTest() {
		service = new UtilZipServiceImpl();
	}

	@Test
	public void TestOpenZip() {

		String zipFilePath = "c://work/out/data.zip";

		try {
			zos = service.openZip(zipFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertNotNull(zos);
	}

	@Test(dependsOnMethods = { "TestOpenZip" })
	public void TestZipFile() {
		String name = "data.in";
		String pathIn = "c://work/in/data.in";
		Item item = new Item();
		item.setPath(pathIn);

		item.setName(name);
		try {
			service.zipFile(zos, item);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(dependsOnMethods = { "TestZipFile" })
	public void TestCloseZip() {
		try {
			service.closeZip(zos);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
