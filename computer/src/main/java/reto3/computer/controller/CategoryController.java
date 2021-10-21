
package reto3.computer.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto3.computer.model.Category;
import reto3.computer.service.ServiceCategory;

/**
 *
 * @author grupo7
 */
@RestController
@RequestMapping("/api/Category ") 
public class CategoryController {
    @Autowired
    private ServiceCategory servicios;
    @GetMapping("all")
    public List<Category> getCategory(){
        return servicios.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int idcategory){
        return servicios.getCategory(idcategory);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category){
        return servicios.save(category);
    }
    
}
