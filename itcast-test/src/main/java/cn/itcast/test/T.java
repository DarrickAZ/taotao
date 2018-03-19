package cn.itcast.test;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class T {
    
    public static void main(String[] args) throws Exception {
        List<String> lines = FileUtils.readLines(new File("E:\\tt\\download.dat"), "UTF-8");
        for (String line : lines) {
            String[] strs = StringUtils.split(line, '@');
            File srcFile = new File("E:\\tt\\"+strs[1]);
            File destFile = new File("E:\\tt2\\"+strs[6]+".aac");
            FileUtils.copyFile(srcFile, destFile);
        }
    }

}
