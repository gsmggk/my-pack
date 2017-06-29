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

		FileOutputStream fileOutputStream = new FileOutputStream(zipFilePath);
		ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
		return zipOutputStream;

	}

	@Override
	public ZipOutputStream zipFile(ZipOutputStream zipOutputStreem, Item item) throws IOException {
		ZipEntry zipEntry = new ZipEntry(item.getName());

		zipOutputStreem.putNextEntry(zipEntry);
		FileInputStream inputStreem = new FileInputStream(item.getPath());

		int length;
		while ((length = inputStreem.read(buffer)) > 0) {
			zipOutputStreem.write(buffer, 0, length);

		}

		inputStreem.close();
		zipOutputStreem.closeEntry();

		return zipOutputStreem;

	}

	@Override
	public void closeZip(ZipOutputStream zipOutputStreem)
			throws IOException {
		zipOutputStreem.close();

	}

}
