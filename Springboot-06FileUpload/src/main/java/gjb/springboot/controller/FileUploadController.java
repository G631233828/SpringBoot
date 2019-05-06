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
 * SpringBoot �ļ��ϴ�
 * 
 * @author fliay
 *
 */
// @Controller
@RestController // ʹ��RestController���Զ���json��ʽ��ת��
@Slf4j
public class FileUploadController {

	@RequestMapping("/fileUploadController")
	public Map<String, Object> fileUploadController(MultipartFile filename) {
		log.info("�ļ��ϴ�...�ļ�����" + filename.getOriginalFilename());
		log.info("�ļ���С��" + filename.getSize());
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("�ļ�����", filename.getOriginalFilename());
		map.put("�ļ���С", filename.getSize());

		try {
			filename.transferTo(new File("D:/upload/" + filename.getOriginalFilename()));
			map.put("msg", "�ϴ��ɹ�");
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			map.put("msg", "�ϴ�ʧ��");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			map.put("msg", "�ϴ�ʧ��");
			e.printStackTrace();
		}

		return map;
	}
}
