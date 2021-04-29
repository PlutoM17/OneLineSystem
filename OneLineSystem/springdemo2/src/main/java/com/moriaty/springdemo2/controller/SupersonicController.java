package com.moriaty.springdemo2.controller;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.moriaty.springdemo2.pojo.Goods;
import com.moriaty.springdemo2.pojo.User;
import com.moriaty.springdemo2.service.GoodsService;
import com.moriaty.springdemo2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//加上此注解之后支持跨域请求
@CrossOrigin
@Controller
public class SupersonicController {
    private static final String QR_CODE_IMAGE_PATH = "D:/tempWorkpls/springdemo2/tmp/MyQRCode.png";
    @Autowired
    UserService userService;
    @Autowired
    GoodsService goodsService;

    @RequestMapping("/index")
    @ResponseBody
    public Map<String, String> index() {
        List<Goods> l = goodsService.getGoods();
        Map m = new HashMap<String, String>();
        m.put("1", l.get(0).toString());
        return m;
    }

    @RequestMapping("/haveFun")
    @ResponseBody
    public void haveFun() throws Exception{
        generateQRCodeImage("https://blog.csdn.net/weixin_44627836/article/details/112055735", 350, 350, QR_CODE_IMAGE_PATH);
        return ;
    }


    /**
     * 根据文字生成二维码
     * 调用方式：generateQRCodeImage("不鼓自鸣", 350, 350, QR_CODE_IMAGE_PATH);
     * @param text
     * @param width
     * @param height
     * @param filePath
     * @throws WriterException
     * @throws IOException
     */
    private static void generateQRCodeImage(String text, int width, int height, String filePath) throws WriterException, IOException {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        HashMap<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
        BitMatrix bitMatrix = qrCodeWriter.encode(text, BarcodeFormat.QR_CODE, width, height,hints);
        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "GIF", path);
    }

    public static void main(String[] args) throws IOException, WriterException {
        generateQRCodeImage("https://blog.csdn.net/weixin_44627836/article/details/112055735", 350, 350, QR_CODE_IMAGE_PATH);
    }
}
