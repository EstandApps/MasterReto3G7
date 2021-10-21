
package reto3.computer.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3.computer.model.Computer;
import reto3.computer.repositorycrud.ComputerRepositoryCrud;

/**
 *
 * @author grupo 7 
 */
@Repository
public class ComputerRepository {
    @Autowired
    private ComputerRepositoryCrud Crud;
    
    public List<Computer> getAll(){
        return(List<Computer>) Crud.findAll();
    }
    public Optional<Computer> getComputer(int id){
        return Crud.findById(id);
    }
    
    public Computer save(Computer computer){
        return Crud.save(computer);
        
       }
     public void delete(Computer bike){
        Crud.delete(bike);
     }
}
