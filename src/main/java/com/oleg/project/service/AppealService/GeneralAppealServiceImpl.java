package com.oleg.project.service.AppealService;


import com.oleg.project.dao.impl.GeneralAppealDaoImpl;
import com.oleg.project.domain.Appeal.AccessAppeal;
import com.oleg.project.domain.Appeal.DeputeAppeal;
import com.oleg.project.domain.Appeal.LawyerAppeal;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("generalAppealService")
@Transactional
public class GeneralAppealServiceImpl {

    private static final Logger LOGGER = Logger.getLogger("GeneralAppealServiceImpl");

    @Autowired
    private GeneralAppealDaoImpl generalAppealDao;

    public List<DeputeAppeal> getAllDeputeAppeals(String searchingChar) {
        LOGGER.debug("Retrieving all DeputesAppeals where anyone field content like searchingChar");
        return generalAppealDao.generalSearchBySearchingCharDeputeAppeals(searchingChar);
    }

    public List<AccessAppeal> getAllAccessAppeals(String searchingChar) {
        LOGGER.debug("Retrieving all AccessAppeals where anyone field content like searchingChar");
        return generalAppealDao.generalSearchBySearchingCharAccessAppeals(searchingChar);
    }

    public List<LawyerAppeal> getAllLawyerAppeals(String searchingChar) {
        LOGGER.debug("Retrieving all LawyerAppeals where anyone field content like searchingChar");
        return generalAppealDao.generalSearchBySearchingCharLawyerAppeals(searchingChar);
    }

    public Integer getNumberForDeputeAppeal(){
        LOGGER.debug("Retrieving number for DeputeAppeal");
        return generalAppealDao.getNumberForDeputeAppealFromDB();
    }
}
