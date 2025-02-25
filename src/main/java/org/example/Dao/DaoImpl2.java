package org.example.Dao;

import org.springframework.stereotype.Component;

@Component
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        return 42;
    }
}
