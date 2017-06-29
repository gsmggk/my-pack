package com.gsmggk.mypacker.zip4j.service;

import com.gsmggk.mypacker.model.Item;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public interface Zip4jService {

	void closeZip();

	ZipFile openZip(String path) throws ZipException;

	void zipFile(ZipFile zf, Item item);

}
