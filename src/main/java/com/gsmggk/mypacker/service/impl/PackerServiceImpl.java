package com.gsmggk.mypacker.service.impl;

import java.io.IOException;
import java.util.zip.ZipOutputStream;

import com.gsmggk.mypacker.model.Item;
import com.gsmggk.mypacker.service.PackerService;
import com.gsmggk.mypacker.utilzip.service.UtilZipService;

public class PackerServiceImpl implements PackerService {

	private UtilZipService service;

	@Override
	public void pack(Item item) {

		try {
			ZipOutputStream zos = service.openZip(item.getName().concat(".zip"));

			service.zipFile(zos, item);
			service.closeZip(zos);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
