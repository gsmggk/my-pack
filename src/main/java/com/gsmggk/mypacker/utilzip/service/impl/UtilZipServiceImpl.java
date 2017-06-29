package com.gsmggk.mypacker.utilzip.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.utilzip.service.UtilZipService;

public class UtilZipServiceImpl implements UtilZipService {

	final static Logger LOGGER = LoggerFactory.getLogger(UtilZipServiceImpl.class);

	byte[] buffer = new byte[1024];

	@Override
	public ZipOutputStream openZip(String zipFilePath) throws FileNotFoundException {

		LOGGER.debug("OpenZip {}", zipFilePath);

		FileOutputStream fos = new FileOutputStream(zipFilePath);
		ZipOutputStream zos = new ZipOutputStream(fos);
		return zos;

	}

	@Override
	public ZipOutputStream zipFile(ZipOutputStream zos, Item item) throws IOException {
		ZipEntry ze = new ZipEntry(item.getName());

		zos.putNextEntry(ze);
		FileInputStream in = new FileInputStream(item.getPath());

		int len;
		while ((len = in.read(buffer)) > 0) {
			zos.write(buffer, 0, len);

		}

		in.close();
		zos.closeEntry();

		return zos;

	}

	@Override
	public void closeZip(ZipOutputStream zos) throws IOException {
		zos.close();

	}

}
