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
	public void zipFile(ZipFile zf, Item item) {
		
		File sourceFile=new File(item.getPath());
		ZipParameters parameters=new ZipParameters();
		 parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
	    parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
	  //  parameters.setEncryptFiles(true);
	  //  parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_STANDARD);
	  //  parameters.setPassword(password);
	
		try {
			zf.addFile(sourceFile, parameters);
		} catch (ZipException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void closeZip() {

	}

}
