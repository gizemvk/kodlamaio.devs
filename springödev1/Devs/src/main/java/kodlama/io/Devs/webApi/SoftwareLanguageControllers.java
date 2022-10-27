package kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@RestController
@RequestMapping("/api/softwarelanguage")

public class SoftwareLanguageControllers {
	
	
	private SoftwareLanguageService softwareLanguageService;
	
     @Autowired
	public SoftwareLanguageControllers(SoftwareLanguageService softwareLanguageService) {
	
		this.softwareLanguageService = softwareLanguageService;
	}
	
     @GetMapping("/add")
      public void add(SoftwareLanguage softwareLanguage ) throws Exception{
    	  softwareLanguageService.create(softwareLanguage);
    	  
      }
	
     @GetMapping("/delete")
	 public void delete( @RequestParam int id) {
		 softwareLanguageService.delete(id);
		
	}
	
     @GetMapping("/update")
	 public void update(SoftwareLanguage softwareLanguage) {
		 softwareLanguageService.update(softwareLanguage);
	 }
	
     @GetMapping("/getall")
	public List<SoftwareLanguage> getAll(){
		return softwareLanguageService.getAll();
	}
	
     @GetMapping("/getbyid")
	public SoftwareLanguage getById (@RequestParam int id) {
		return softwareLanguageService.getById(id);
	}
	
	
}
