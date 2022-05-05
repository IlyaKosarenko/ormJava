package orm;

import client.model.entity.Animal;
import client.model.entity.Zoo;

public class OrmManager {
    public OrmManager(String schemaName) {
        // using schemaName as a key find in
        // property file the configuration to connect to DB
    }

    public <T> void persist(T objectToSave) {
        // check if objectToSave.getClass() has @Entity
        // save the object to the DB table
        // and set id of the object as generated by the DB
    }

    public void merge(Object objectToSave) {
        // save the object state into the DB table at
        // the row that has PK = object id (field marked as @Id)
    }

    public <T> T load(Object id, Class<T> entityClass) {
        // from DB find the row with PK = id in the table
        // where the objects of given type reside
        return null;
    }

    public void update(Object obj) {
        // go to DB to table = obj.getClass at PK = obj id
        // and set the fields of the obj <= data from DB
    }

    public void registerEntities(Class<?>... entityClasses) {
        // prepare MetaInfo, create the tables in the DB
    }

    public void remove(Object entity) {
        // send delete to DB and set id to null
    }
}
