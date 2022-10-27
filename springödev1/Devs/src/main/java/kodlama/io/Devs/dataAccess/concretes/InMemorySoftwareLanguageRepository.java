package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.SoftwareLanguageRepository;
import kodlama.io.Devs.entities.concretes.SoftwareLanguage;

@Repository
public class InMemorySoftwareLanguageRepository  implements SoftwareLanguageRepository{

	
	List< SoftwareLanguage> softwareLanguages;
	
    
	public InMemorySoftwareLanguageRepository() {
		
		
		softwareLanguages=new ArrayList<SoftwareLanguage>() ;
		softwareLanguages.add( new SoftwareLanguage(1,"C#"));
		softwareLanguages.add( new SoftwareLanguage(2,"Java"));
		softwareLanguages.add( new SoftwareLanguage(3,"Python"));
		
		
		
	}

	@Override
	public void create(SoftwareLanguage softwareLanguage) {
		
		softwareLanguages.add (softwareLanguage);
		
	}

	@Override
	public void delete(int id) {
		
		
		softwareLanguages.remove(id);
		
	}

	@Override
	public void update(SoftwareLanguage softwareLanguage) {
		
		for (SoftwareLanguage language: softwareLanguages) {
			
			
		if(language.getId()== softwareLanguage.getId()) {
			
			language.setName(softwareLanguage.getName());
		}
		
	  }
	}
	
	
	@Override
	public List<SoftwareLanguage> getAll() {
	
		return softwareLanguages;
	}

	
	
	@Override
	public SoftwareLanguage getById(int id) {
		
          for (SoftwareLanguage i: softwareLanguages) {
			
            if (i.getId()==id){
                return i;
            }
        }
		
		return null ;
	}

}
