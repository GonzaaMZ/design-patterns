package org.singleton;

/**
 * 1) Debemos tener un constructor privado
 * 2) Debemos tener un atributo privado estatico
 * 3) Debemos tener un metodo estatico que devuelva la instancia
 */
public class DatabaseConnector {

    private static DatabaseConnector databaseConnector;

    private DatabaseConnector(){
        System.out.println("Creando Objecto");
    }
    public static synchronized DatabaseConnector getInstance(){
        if(databaseConnector == null){
            databaseConnector = new DatabaseConnector();
        }
        return databaseConnector;
    }

    public void connectDatabase(){
        System.out.println("Connecting database = " + databaseConnector);
    }

    public void disconnectDatabase(){
        System.out.println("Disconnecting database = " + databaseConnector);
    }


}
