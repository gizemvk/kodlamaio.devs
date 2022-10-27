package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.SoftwareLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@Service
public class SoftwareLanguageManager implements SoftwareLanguageService {
	
	
	private SoftwareLanguageRepository softwareLanguageRepository;
	
    @Autowired
	public SoftwareLanguageManager(SoftwareLanguageRepository softwareLanguageRepository) {
	
		this.softwareLanguageRepository = softwareLanguageRepository;
	}

	
	@Override
	public void create (SoftwareLanguage softwareLanguage) throws Exception {
		
		
		if ( softwareLanguage.getName() !=null) {
			
			for(SoftwareLanguage language : softwareLanguageRepository.getAll()) {
				
				if (language.getName().equalsIgnoreCase(softwareLanguage.getName())) {
					
					throw new Exception("Aynı isimle yazılım dili eklenemez.");
				   }
	          }

			softwareLanguageRepository.create(softwareLanguage);
			
		}
		
		
		else {
			
			throw new Exception ("Yazılım dili boş geçilemez.");
		}
		
		
		
	}
	

	@Override
	public void delete(int id) {
		softwareLanguageRepository.delete(id);
		
	}

	@Override
	public void update(SoftwareLanguage softwareLanguage) {
		
		softwareLanguageRepository.update(softwareLanguage);
		
	}

	@Override
	public List<SoftwareLanguage> getAll() {
		
		return softwareLanguageRepository.getAll();
	}

	@Override
	public SoftwareLanguage getById(int id) {
		
		return softwareLanguageRepository.getById(id);
	}

}
