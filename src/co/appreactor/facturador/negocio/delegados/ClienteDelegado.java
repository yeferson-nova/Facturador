/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.appreactor.facturador.negocio.delegados;

import co.appreactor.facturador.modelo.dao.ClienteDao;
import co.appreactor.facturador.modelo.entidades.Cliente;
import co.appreactor.facturador.negocio.excepciones.FacturadorException;
import java.sql.Connection;

/**
 *
 * @author yefer
 */
public class ClienteDelegado extends GenericoDelegado <Cliente>{
    
    private final ClienteDao clienteDao;
    public ClienteDelegado(Connection cnn) throws FacturadorException {
        super(cnn);
        clienteDao = new ClienteDao(cnn);
        genericoDao = clienteDao;
    }
    
}
