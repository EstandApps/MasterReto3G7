
package reto3.computer.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reto3.computer.model.Reservations;
import reto3.computer.repositorycrud.ReservationsRepositoryCrud;

/**
 *
 * @author grupo7
 */
@Repository
public class ReservationsRepository {
     @Autowired
    private ReservationsRepositoryCrud crud4;

    public List<Reservations> getAll(){
        return (List<Reservations>) crud4.findAll();
    }
    public Optional<Reservations> getReservation(int id){
        return crud4.findById(id);
    }
    public Reservations save(Reservations reservation){
        return crud4.save(reservation);
    }
    public void delete(Reservations reservation){
        crud4.delete(reservation);
    }
    
    
}
