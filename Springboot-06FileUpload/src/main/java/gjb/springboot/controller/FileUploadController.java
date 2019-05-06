package gjb.springboot.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.slf4j.Slf4j;

/**
 * SpringBoot 文件上传
 * 
 * @author fliay
 *
 */
// @Controller
@RestController // 使用RestController会自动做json格式的转换
@Slf4j
public class FileUploadController {

	@RequestMapping("/fileUploadController")
	public Map<String, Object> fileUploadController(MultipartFile filename) {
		log.info("文件上传...文件名：" + filename.getOriginalFilename());
		log.info("文件大小：" + filename.getSize());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("文件名称", filename.getOriginalFilename());
		map.put("文件大小", filename.getSize());

		try {
			filename.transferTo(new File("D:/upload/" + filename.getOriginalFilename()));
			map.put("msg", "上传成功");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			map.put("msg", "上传失败");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			map.put("msg", "上传失败");
			e.printStackTrace();
		}

		return map;
	}
}
