package com.oleg.project.dao.impl;


import com.oleg.project.dao.AppealDao;
import com.oleg.project.dao.SessionDao;
import com.oleg.project.domain.Appeal.AccessAppeal;
import com.oleg.project.domain.Appeal.DeputeAppealFiles;
import com.oleg.project.domain.utilDomain.RequestForDeputeAppealSearch;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class AccessAppealDaoImpl implements AppealDao<AccessAppeal> {

        @Autowired
        SessionDao sessionDao;

        public List<AccessAppeal> getAll() {
            Criteria criteria = sessionDao.getSession().createCriteria(AccessAppeal.class);
            return criteria.list();
        }

        public AccessAppeal getById(int id) {
            Criteria criteria = sessionDao.getSession().createCriteria(AccessAppeal.class)
                    .add(Restrictions.idEq(id));
            return (AccessAppeal) criteria.uniqueResult();
        }

        public void addAppeal(AccessAppeal accessAppeal) {
            sessionDao.getSession().save(accessAppeal);
        }

        public void deleteAppeal(int id) {
            Criteria criteria = sessionDao.getSession().createCriteria(AccessAppeal.class)
                    .add(Restrictions.idEq(id));
            sessionDao.getSession().delete(criteria.uniqueResult());
        }


        public void editAppeal(AccessAppeal accessAppeal, AccessAppeal existingDeputesAppeal) {
            sessionDao.getSession().save(existingDeputesAppeal);
        }

        public AccessAppeal modSession(AccessAppeal accessAppeal) {
            AccessAppeal accessAppeal1 = sessionDao.getSession().get(AccessAppeal.class, accessAppeal.getId());
            return accessAppeal1;
        }

        public List<AccessAppeal> abstractSearch(String searchingChar) {
            Query query = sessionDao.getSession().createQuery("from AccessAppeal where DESCRIBE (AccessAppeal) like '%" + searchingChar + "%'");
            return query.list();
        }


        public List<AccessAppeal> individualSearch(RequestForDeputeAppealSearch deputeAppealForRequest) {
            return null;
        }

    public void editFilePathName(DeputeAppealFiles deputeAppealFiles) {

    }

}

