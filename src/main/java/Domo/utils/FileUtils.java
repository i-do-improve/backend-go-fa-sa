package Domo.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.core.io.ClassPathResource;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
	//파일 업로드시 임시 저장
	public static void moveUploadLocFormTemp(String[] newName, String url) {
		ClassPathResource cpr=new ClassPathResource("static"+url+"temp/");
		
		for(String name:newName) {
			try {
				File file=new File(cpr.getFile(), name);
				file.renameTo(new File(cpr.getFile().getParent(),name));
			}catch (Exception e) {
			}
		}
	}
	
	//임시 저장한 파일을 분리하여 저장
	public static Map<String, String> fileUpload(MultipartFile gimg, String location) {
		
		ClassPathResource cpr = new ClassPathResource("static"+location); //이 위치에 파일을 업로드
		
		File folder=null;
		String fileName=null;
		String orgName=null;
		try {
			folder = cpr.getFile();
			orgName=gimg.getOriginalFilename();
			
			int idx = orgName.lastIndexOf("."); //인덱스번호찾기 - 파일 이름 중에서 마지막(.)의 인덱스번호
			//String extension = orgName.substring(idx); // .확장자
			fileName=orgName.substring(0, idx)
					+"_"+(System.nanoTime()/1000000)
					+orgName.substring(idx);
			//fileName = UUID.randomUUID().toString()+extension; //파일이름 랜덤으로 생성
			
			//원본.이름_3515315315.jpg
			gimg.transferTo(new File(folder, fileName)); //업로드
			
			System.out.println("임시폴더에 파일업로드 : "+location+fileName);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String, String> tempfile = new HashMap<>();
		//tempfile.put("location", location);
		tempfile.put("newName", fileName);
		tempfile.put("orgName", orgName);
		tempfile.put("url", location+fileName);
		
		return tempfile;
	}
	
	private FileUtils() {} //생성자 막기
}
