package com.oleg.project.dao.impl;


import com.oleg.project.dao.AppealDao;
import com.oleg.project.dao.SessionDao;
import com.oleg.project.domain.Appeal.DeputeAppeal;
import com.oleg.project.domain.Appeal.DeputeAppealFiles;
import com.oleg.project.domain.utilDomain.RequestForDeputeAppealSearch;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("deputeAppealDao")
public class DeputeAppealDaoImpl implements AppealDao<DeputeAppeal> {

    @Autowired
    SessionDao sessionDao;

    //This method will return all DeputeAppeals
    public List<DeputeAppeal> getAll() {
        Criteria criteria = sessionDao.getSession().createCriteria(DeputeAppeal.class);
        return criteria.list();
    }

    //This method will return DeputeAppeal by id
    public DeputeAppeal getById(int id) {
        Criteria criteria = sessionDao.getSession().createCriteria(DeputeAppeal.class)
                .add(Restrictions.idEq(id));
        return (DeputeAppeal) criteria.uniqueResult();
    }

    //This method will add DeputeAppeal
    public void addAppeal(DeputeAppeal deputeAppeal) {
        sessionDao.getSession().save(deputeAppeal);
    }

    //This method will get DeputeAppeal by id and then delete it
    public void deleteAppeal(int id) {
        Criteria criteria = sessionDao.getSession().createCriteria(DeputeAppeal.class)
                .add(Restrictions.idEq(id));
        sessionDao.getSession().delete(criteria.uniqueResult());
    }

    //This method will edit current Depute Appeal
    public void editAppeal(DeputeAppeal deputeAppeal, DeputeAppeal existingDeputesAppeal) {
        sessionDao.getSession().save(existingDeputesAppeal);
    }

    //This method will
    public DeputeAppeal modSession(DeputeAppeal deputeAppeal) {
        DeputeAppeal deputeAppeal1 = sessionDao.getSession().get(DeputeAppeal.class, deputeAppeal.getId());
        return deputeAppeal1;
    }

    //This method will return all DeputeAppeals where all fields like input String
    public List<DeputeAppeal> abstractSearch(String searchingChar) {
       return null;
    }

    public List<DeputeAppeal> individualSearch(RequestForDeputeAppealSearch deputeAppealForRequest) {
        Criteria criteria = sessionDao.getSession().createCriteria(DeputeAppeal.class);
        if(!deputeAppealForRequest.getOutNumber().equals("")) {
            criteria.add(Restrictions.eq("outNumber", deputeAppealForRequest.getOutNumber()));
        }
        if(!deputeAppealForRequest.getIncomeNumber().equals("")) {
            criteria.add(Restrictions.eq("incomeNumber", deputeAppealForRequest.getIncomeNumber()));
        }
        if(!deputeAppealForRequest.getNameAndAddressOfApplicant().equals("")) {
            criteria.add(Restrictions.like("nameAndAddressOfApplicant", deputeAppealForRequest.getNameAndAddressOfApplicant()));
        }
        if(!deputeAppealForRequest.getNameOfDepute().equals("")) {
            criteria.add(Restrictions.like("nameOfDepute", deputeAppealForRequest.getNameOfDepute()));
        }
        if(!deputeAppealForRequest.getSendingOrganization().equals("")) {
            criteria.add(Restrictions.eq("sendingOrganization", deputeAppealForRequest.getSendingOrganization()));
        }
        if(deputeAppealForRequest.getOutDate() != null) {
            criteria.add(Restrictions.eq("outDate", deputeAppealForRequest.getOutDate()));
        }
        if(deputeAppealForRequest.getIncomingDate() != null) {
            criteria.add(Restrictions.eq("incomingDate", deputeAppealForRequest.getIncomingDate()));
        }
        if(!deputeAppealForRequest.getShortContentOfAppeal().equals("")) {
            criteria.add(Restrictions.like("shortContentOfAppeal", deputeAppealForRequest.getShortContentOfAppeal()));
        }
        if(deputeAppealForRequest.getTypeOfDeputeAppeal() != null) {
            criteria.add(Restrictions.eq("typeOfDeputeAppeal", deputeAppealForRequest.getTypeOfDeputeAppeal()));
        }
        if(!deputeAppealForRequest.getMainWorker().equals("")) {
            criteria.add(Restrictions.eq("mainWorker", deputeAppealForRequest.getMainWorker()));
        }

        return criteria.list();
    }

    public void editFilePathName(DeputeAppealFiles deputeAppealFiles) {
       sessionDao.getSession().save(deputeAppealFiles);
    }

}
