/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EFF.test;

import edu.eci.cosw.proyecto_eff.simplepersistencelayer.Pago;
import java.sql.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.junit.After;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jennibarajas
 */
public class Test3y5 {
    private SessionFactory sessionFactory;
    private Session session = null;
    
    /**
     * Operaciones que se realizan antes de ejecutar el banco de pruebas.
     * En este caso se crea una misma sesión que será usada en todas las
     * pruebas.
     */
    @Before
    public void setupSession() {
        
        Configuration configuration = new Configuration();
        configuration.configure("hibernate-inmemory.cfg.xml");
        ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(
        configuration.getProperties()).buildServiceRegistry();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        session=sessionFactory.openSession();
        
    }
    
    /**
     * Operaciones que se realizan cuando finalice la ejecución de las pruebas.
     * En este caso se cierra la sesi_n y la f_brica de sesiones.
     */
    @After
    public void closeResources(){
        session.close();
        sessionFactory.close();
    }
 /**
     Realización de las pruebas,mirando la persistencia de estas en la base de datos. 
     */
    @Test
    public void sampleTest(){
        Transaction tx=session.beginTransaction();
        
        //Cálculo del valor total pagado a una franquicia en un intervalo de fechas.
        Date d= new Date(date);
            Pago p= new Pago(5, new Date , monto, null)
       
        //comparar el resultado esperado contra el obtenido con un assert
        assertTrue(true==true);
        
        tx.commit();        
    }
}
