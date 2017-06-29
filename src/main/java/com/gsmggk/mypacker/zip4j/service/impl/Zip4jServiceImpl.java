package com.gsmggk.mypacker.zip4j.service.impl;

import java.io.File;

import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.zip4j.service.Zip4jService;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

public class Zip4jServiceImpl implements Zip4jService {

	@Override
	public ZipFile openZip(String path) throws ZipException {

		ZipFile zipfFile = new ZipFile(path);
		return zipfFile;

	}

	@Override
	public void zipFile(ZipFile zipFile, Item item) throws ZipException {
		
		File sourceFile=new File(item.getPath());
		ZipParameters parameters=new ZipParameters();
		 parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
	    parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
	    parameters.setEncryptFiles(true);
	    parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
	    parameters.setPassword("password11");
	    
		
		zipFile.addFile(sourceFile, parameters);
	

	}

	@Override
	public void closeZip() {
         
	}

	@Override
	public void cryptZip(ZipFile zipFile, String password) {
		
		
	}

}
