package org.example.Metier;
import org.example.Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl2 implements IMetier {

    private IDao dao;

    @Autowired
    public MetierImpl2(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getData() * 2;
    }
}

