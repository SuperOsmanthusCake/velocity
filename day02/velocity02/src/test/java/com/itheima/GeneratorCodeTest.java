package com.itheima;

import com.itheima.utils.GenUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipOutputStream;


public class GeneratorCodeTest {

    public static void main(String[] args) throws IOException {
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("className","Product");
        data.put("classname","product");
        data.put("package","com.itheima");

        File file = new File("C:\\Users\\acer\\Desktop\\ddd\\code.zip");
        FileOutputStream outputStream = new FileOutputStream(file);
        ZipOutputStream zip = new ZipOutputStream(outputStream);

        GenUtils.generatorCode(data, GenUtils.getTemplates(),zip);

        zip.close();
    }
}
