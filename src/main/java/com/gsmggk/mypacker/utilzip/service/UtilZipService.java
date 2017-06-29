package com.gsmggk.mypacker.utilzip.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

import com.gsmggk.mypacker.model.Item;

public interface UtilZipService {
	
	ZipOutputStream openZip(String zipFilePath) throws FileNotFoundException;

	ZipOutputStream zipFile(ZipOutputStream zos,Item item) throws IOException;

	void closeZip(ZipOutputStream zos) throws IOException;


}
