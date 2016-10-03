package com.oleg.project.dao.appealImpl.generalAppealDaoImpl;
import com.oleg.project.dao.SessionDao;
import com.oleg.project.domain.Appeal.AccessAppeal;
import com.oleg.project.domain.Appeal.DeputeAppeal;
import com.oleg.project.domain.Appeal.LawyerAppeal;
import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("generalAppealDao")
public class GeneralAppealDaoImpl {

    @Autowired
    SessionDao sessionDao;

    //This method will return all Appeals generalSearch field like input String
    public List<DeputeAppeal> generalSearchBySearchingCharDeputeAppeals(String searchingChar) {
        Query query = sessionDao.getSession().createQuery("from DeputeAppeal where " +
                "( typeOfDeputeAppeal like '%" + searchingChar + "%') or (sendingOrganization like '%" + searchingChar + "%') or (outNumber like '%" + searchingChar + "%') or (outDate like '%" + searchingChar
                + "%') or (countOfPages like '%" + searchingChar + "%') or (nameOfDepute like '%" + searchingChar + "%') or (incomeNumber like '%" + searchingChar
                + "%') or (incomingDate like '%" + searchingChar + "%') or (themeOfAppeal like '%" + searchingChar + "%') or (shortContentOfAppeal like '%" + searchingChar
                + "%') or (unitWhoDoResolution like '%" + searchingChar + "%') or (contentOfResolution like '%" + searchingChar + "%') or (checkForPlagiarism like '%" + searchingChar
                + "%') or (nameAndAddressOfApplicant like '%" + searchingChar + "%') or (dateForCheck like '%" + searchingChar + "%') or (mainWorker like '%" + searchingChar
                + "%') or (secondaryWorkers like '%" + searchingChar + "%') or (statusOfWorking like '%" + searchingChar + "%') or (result like '%" + searchingChar + "%')");
        return query.list();
    }

    public List<AccessAppeal> generalSearchBySearchingCharAccessAppeals(String searchingChar) {
        Query query = sessionDao.getSession().createQuery("from AccessAppeal where " +
                "( typeOfDeputeAppeal like '%" + searchingChar + "%') or (outNumber like '%" + searchingChar + "%') or (outDate like '%" + searchingChar
                + "%') or (countOfPages like '%" + searchingChar + "%') or (nameOfDepute like '%" + searchingChar + "%') or (incomeNumber like '%" + searchingChar
                + "%') or (incomingDate like '%" + searchingChar + "%') or (themeOfAppeal like '%" + searchingChar + "%') or (shortContentOfAppeal like '%" + searchingChar
                + "%') or (unitWhoDoResolution like '%" + searchingChar + "%') or (contentOfResolution like '%" + searchingChar + "%') or (checkForPlagiarism like '%" + searchingChar
                + "%') or (nameAndAddressOfApplicant like '%" + searchingChar + "%') or (dateForCheck like '%" + searchingChar + "%') or (mainWorker like '%" + searchingChar
                + "%') or (secondaryWorkers like '%" + searchingChar + "%') or (statusOfWorking like '%" + searchingChar + "%') or (result like '%" + searchingChar + "%')");
        return query.list();
    }

    public List<LawyerAppeal> generalSearchBySearchingCharLawyerAppeals(String searchingChar) {
        Query query = sessionDao.getSession().createQuery("from LawyerAppeal where " +
                "(typeOfDeputeAppeal like '%" + searchingChar + "%') or (outNumber like '%" + searchingChar + "%') or (outDate like '%" + searchingChar
                + "%') or (countOfPages like '%" + searchingChar + "%') or (nameOfDepute like '%" + searchingChar + "%') or (incomeNumber like '%" + searchingChar
                + "%') or (incomingDate like '%" + searchingChar + "%') or (themeOfAppeal like '%" + searchingChar + "%') or (shortContentOfAppeal like '%" + searchingChar
                + "%') or (unitWhoDoResolution like '%" + searchingChar + "%') or (contentOfResolution like '%" + searchingChar + "%') or (checkForPlagiarism like '%" + searchingChar
                + "%') or (nameAndAddressOfApplicant like '%" + searchingChar + "%') or (dateForCheck like '%" + searchingChar + "%') or (mainWorker like '%" + searchingChar
                + "%') or (secondaryWorkers like '%" + searchingChar + "%') or (statusOfWorking like '%" + searchingChar + "%') or (result like '%" + searchingChar + "%')");
        return query.list();
    }

    public Integer getNumberForDeputeAppealFromDB() {
            Query query = sessionDao.getSession().createQuery("select max (id) from DeputeAppeal");
            return (Integer) query.list().get(0);
        }

    }

