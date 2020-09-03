package com.zmq.controller;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author ZMQ
 * @Date 2020/9/2
 * @since 1.8
 *
 * 上传下载文件
 */
@Controller
@RequestMapping("/fileOperation")
public class UploadController {

    @RequestMapping("/upload")
    public String uploadFile(MultipartFile sourceFile , HttpServletRequest request) throws IOException {
        //获得文件全名
        String originalFilename = sourceFile.getOriginalFilename();
        //文件重命名
        String reName = UUID.randomUUID().toString();
        //获得原文件后缀
        String suffix = FilenameUtils.getExtension(originalFilename);
        //获得新文件名
        String newFileName = reName + "." + suffix ;
        //获得文件存储路径
        String realPath = request.getServletContext().getRealPath("/source");
        //将文件存到指定目录
        sourceFile.transferTo(new File(realPath + File.separator + newFileName));
        return "index";
    }

    /**
     * 下载文件
     * @param name
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping("/download")
    public String downloadFile(String name , HttpServletRequest request , HttpServletResponse response) throws IOException {
        //获得资源存储路径
        String realPath = request.getServletContext().getRealPath("/source");
        System.out.println(realPath);
        //获得文件完整路径
        String completePath = realPath + File.separator + name ;
        System.out.println(completePath);
        //设置请求头
        response.setHeader("content-disposition","attachment;filename=" + name);
        IOUtils.copy(new FileInputStream(completePath),response.getOutputStream() );
        return "index" ;
    }

}
