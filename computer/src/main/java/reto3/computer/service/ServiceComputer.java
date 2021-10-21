
package reto3.computer.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reto3.computer.model.Computer;
import reto3.computer.repository.ComputerRepository;

/**
 *
 * @author grupo7 
 */
@Service
public class ServiceComputer {
    @Autowired
    private ComputerRepository metodosCrud;
    
    public List<Computer> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<Computer> getComputer(int idcomputer){
        return metodosCrud.getComputer(idcomputer);
    }
    
    public Computer save(Computer computer){
        if(computer.getIdcomputer()==null){
            return metodosCrud.save(computer);
            
        }else{
            Optional<Computer> event=metodosCrud.getComputer(computer.getIdcomputer());
            if(event.isEmpty()){
                return metodosCrud.save(computer);                
            }else{
                return computer;
            }
           
        }
    }
    
    public Computer update(Computer computer){
        if(computer.getIdcomputer()!=null){
            Optional<Computer> e=metodosCrud.getComputer(computer.getIdcomputer());
            if(!e.isEmpty()){
                if(computer.getName()!=null){
                    e.get().setName(computer.getName());
                }
                if(computer.getBrand()!=null){
                    e.get().setBrand(computer.getBrand());
                }
                if(computer.getYear()!=null){
                    e.get().setYear(computer.getYear());
                }
                if(computer.getDescription()!=null){
                    e.get().setDescription(computer.getDescription());
                }
                if(computer.getCategory()!=null){
                    e.get().setCategory(computer.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return computer;
            }
        }else{
            return computer;
        }
    }


    public boolean deleteComputer(int computerId) {
        Boolean aBoolean = getComputer(computerId).map(computer -> {
            metodosCrud.delete(computer);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
