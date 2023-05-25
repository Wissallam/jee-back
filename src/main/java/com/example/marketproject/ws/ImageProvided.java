package com.example.marketproject.ws;

import com.example.marketproject.bean.ImageModel;
import com.example.marketproject.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("market-project/Images")


public class ImageProvided {

    @Autowired
    private ImageService imageService;

    @PostMapping("/upload")
    public ResponseEntity.BodyBuilder uplaodImage( @RequestParam("imageFile") MultipartFile file) throws IOException {
        return imageService.uplaodImage(file);
    }

    @GetMapping(path = { "/get/{imageName}" })
    public ImageModel getImage( @PathVariable("imageName") String imageName) throws IOException {
        return imageService.getImage(imageName);
    }


}
