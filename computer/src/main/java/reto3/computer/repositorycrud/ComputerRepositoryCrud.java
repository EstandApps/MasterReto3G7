/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reto3.computer.repositorycrud;

import org.springframework.data.repository.CrudRepository;
import reto3.computer.model.Computer;

/**
 *
 * @author ragno
 */
public interface ComputerRepositoryCrud  extends CrudRepository <Computer,Integer> {
    
 }
