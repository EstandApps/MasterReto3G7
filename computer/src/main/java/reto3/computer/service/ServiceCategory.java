
package reto3.computer.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto3.computer.model.Category;
import reto3.computer.repository.CategoryRepository;

/**
 *
 * @author grupo7 
 */
@Service
public class ServiceCategory {
     @Autowired
    private CategoryRepository metodosCrud;
    
    public List<Category> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Category> getCategory(int idcategory){
        return metodosCrud.getCategory(idcategory);
    }
    
    public Category save(Category category){
        if(category.getIdcategory()==null){
            return metodosCrud.save(category);
            
        }else{
            Optional<Category> event=metodosCrud.getCategory(category.getIdcategory());
            if(event.isEmpty()){
                return metodosCrud.save(category);                
            }else{
                return category;
            }
           
        }
    }
    
    
}
