package com.oleg.project.dao.appealImpl.lawyerAppealDaoImpl;


import com.oleg.project.dao.AppealDao;
import com.oleg.project.dao.SessionDao;
import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;
import com.oleg.project.domain.Appeal.LawyerAppeal;
import com.oleg.project.domain.utilDomain.RequestForDeputeAppealSearch;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class LawyerAppealDaoImpl implements AppealDao<LawyerAppeal> {

    @Autowired
    SessionDao sessionDao;

    public List<LawyerAppeal> getAll() {
        Criteria criteria = sessionDao.getSession().createCriteria(LawyerAppeal.class);
        return criteria.list();
    }

    public LawyerAppeal getById(int id) {
        Criteria criteria = sessionDao.getSession().createCriteria(LawyerAppeal.class)
                .add(Restrictions.idEq(id));
        return (LawyerAppeal) criteria.uniqueResult();
    }

    public void addAppeal(LawyerAppeal lawyerAppeal) {
        sessionDao.getSession().save(lawyerAppeal);
    }

    public void deleteAppeal(int id) {
        Criteria criteria = sessionDao.getSession().createCriteria(LawyerAppeal.class)
                .add(Restrictions.idEq(id));
        sessionDao.getSession().delete(criteria.uniqueResult());
    }


    public void editAppeal(LawyerAppeal lawyerAppeal, LawyerAppeal existingDeputesAppeal) {
        sessionDao.getSession().save(existingDeputesAppeal);
    }

    public LawyerAppeal modSession(LawyerAppeal lawyerAppeal) {
        LawyerAppeal lawyerAppeal1 = sessionDao.getSession().get(LawyerAppeal.class, lawyerAppeal.getId());
        return lawyerAppeal1;
    }

    public List<LawyerAppeal> abstractSearch(String searchingChar) {
        Query query = sessionDao.getSession().createQuery("from LawyerAppeal where DESCRIBE (LawyerAppeal) like '%" + searchingChar + "%'");
        return query.list();
    }


    public List<LawyerAppeal> individualSearch(RequestForDeputeAppealSearch deputeAppealForRequest) {
        return null;
    }

    public void editFilePathName(DeputeAppealFiles deputeAppealFiles) {

    }

}
