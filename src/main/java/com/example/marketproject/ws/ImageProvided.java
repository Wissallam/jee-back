package com.example.marketproject.ws;

import com.example.marketproject.bean.ImageModel;
import com.example.marketproject.bean.MarketOwner;
import com.example.marketproject.dao.ImageDao;
import com.example.marketproject.service.ImageService;
import com.example.marketproject.service.MarketOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("market-project/Images")
public class ImageProvided {

    @PostMapping("/upload")
    public ResponseEntity.BodyBuilder uplaodImage( @RequestParam("imageFile") MultipartFile file) throws IOException {
        return imageService.uplaodImage(file);
    }

    @GetMapping(path = { "/get/{imageName}" })
    public ImageModel getImage( @PathVariable("imageName") String imageName) throws IOException {
        return imageService.getImage(imageName);
    }

    @Autowired
    private ImageService imageService;


}
