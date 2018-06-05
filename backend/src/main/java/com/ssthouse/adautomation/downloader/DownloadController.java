package com.ssthouse.adautomation.downloader;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownloadController {

    @RequestMapping(value = "/download/{id}")
    public String testDownload(@PathVariable("id") String id) {
        return "data  " + id;
    }
}
