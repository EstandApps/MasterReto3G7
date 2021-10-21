
package reto3.computer.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reto3.computer.model.Computer;
import reto3.computer.service.ServiceComputer;
/**
 *
 * @author grupo 7 
 */
@RestController
@RequestMapping("/api/Computer")  
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ComputerController {
    @Autowired
    private ServiceComputer servicios;
    @GetMapping("all")
    public List<Computer> getComputer(){
        return servicios.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Computer> getComputer(@PathVariable("id") int idComputer){
        return servicios.getComputer(idComputer);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save(@RequestBody Computer computer){
        return servicios.save(computer);
    }
     @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer update(@RequestBody Computer computer) {
        return servicios.update( computer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int computerId) {
        return servicios.deleteComputer(computerId);
    } 
    
}
