package com.delhaizeamerica.fileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.delhaizeamerica.fileupload.property.FileStorageProperties;

@EnableConfigurationProperties({
    FileStorageProperties.class
})


@SpringBootApplication
public class FileUploadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadApplication.class, args);
	}

}
