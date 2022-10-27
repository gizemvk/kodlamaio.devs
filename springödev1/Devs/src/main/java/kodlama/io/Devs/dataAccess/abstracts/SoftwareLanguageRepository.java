package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.SoftwareLanguage;

public interface SoftwareLanguageRepository {
	
	
	
	void create(SoftwareLanguage softwareLanguage );
	
	void delete(int id);
	
	void update(SoftwareLanguage softwareLanguage);
	
	List<SoftwareLanguage> getAll();
	
	SoftwareLanguage getById ( int id);
	
	

}
 