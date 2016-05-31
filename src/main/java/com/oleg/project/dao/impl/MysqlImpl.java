package com.oleg.project.dao.impl;


import com.oleg.project.dao.DeputesAppealDao;
import com.oleg.project.domain.DeputesAppeal;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MysqlImpl implements DeputesAppealDao{

    @Autowired
    SessionFactory sessionFactory;

    public List<DeputesAppeal> getAll() {
        Query query = sessionFactory.getCurrentSession().createQuery("from DeputesAppeal");
        return query.list();
    }

    public DeputesAppeal getById(Long id) {
        DeputesAppeal deputesAppeal = (DeputesAppeal) sessionFactory.getCurrentSession().get(DeputesAppeal.class, id);
        return deputesAppeal;
    }

    public void addAppeal(DeputesAppeal deputesAppeal) {
        sessionFactory.getCurrentSession().save(deputesAppeal);
    }

    public void deleteAppeal(Long id) {
         DeputesAppeal deputesAppeal = (DeputesAppeal) sessionFactory.getCurrentSession().get(DeputesAppeal.class, id);
         sessionFactory.getCurrentSession().delete(deputesAppeal);
    }

    public void editAppeal(DeputesAppeal deputesAppeal, DeputesAppeal existingDeputesAppeal) {
         sessionFactory.getCurrentSession().save(existingDeputesAppeal);
    }

    public DeputesAppeal modSession(DeputesAppeal deputesAppeal) {
        DeputesAppeal deputesAppeal1 = (DeputesAppeal) sessionFactory.getCurrentSession().get(DeputesAppeal.class, deputesAppeal.getId());
        return  deputesAppeal1;
    }

    public List<DeputesAppeal> abstractSearch(String searchingChar) {
        Query query = sessionFactory.getCurrentSession().createQuery("from DeputesAppeal where concat(NumberOfAppeal, DateOfIncomingAppeal, NameOfDepute, ResolutionOfChief, TypeOfAppeal)  like '%" + searchingChar + "%'");
        return query.list();
    }

}
