package com.gsmggk.mypacker.utilzip.service.impl;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipOutputStream;

import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.utilzip.service.UtilZipService;

public class UtilZipServiceImpl implements UtilZipService {
	byte[] buffer = new byte[1024];

	@Override
	public void zipFile(Item item) {
		String zipFilename = "c://work/out/data.zip";
		try {
			FileOutputStream fos = new FileOutputStream(zipFilename);
		
		ZipOutputStream zos=new ZipOutputStream(fos);
} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
