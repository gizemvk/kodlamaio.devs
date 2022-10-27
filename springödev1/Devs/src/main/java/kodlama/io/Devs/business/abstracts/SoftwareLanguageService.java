package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.SoftwareLanguage;

public interface SoftwareLanguageService {
	
	
	
	
    void create(SoftwareLanguage softwareLanguage ) throws Exception;
	
	void delete(int id);
	
	void update(SoftwareLanguage softwareLanguage);
	
	List<SoftwareLanguage> getAll();
	
	SoftwareLanguage getById ( int id);
	
	

}
