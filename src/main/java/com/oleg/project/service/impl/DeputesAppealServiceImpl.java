package com.oleg.project.service.impl;


import com.oleg.project.dao.DeputesAppealDao;
import com.oleg.project.domain.DeputesAppeal;
import com.oleg.project.service.DeputesAppealService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class DeputesAppealServiceImpl implements DeputesAppealService{

    private static final Logger LOGGER = Logger.getLogger("appealService");

    @Autowired
    DeputesAppealDao deputesAppealDao;

    public List<DeputesAppeal> getAll() {
        LOGGER.debug("Retrieving all appeals");
        return deputesAppealDao.getAll();
    }

    public DeputesAppeal getById(Long id) {
        LOGGER.debug("Retrieving appeal by id");
        return deputesAppealDao.getById(id);
    }

    public void add(DeputesAppeal deputesAppeal) {
        LOGGER.debug("Adding new appeal");
        deputesAppealDao.addAppeal(deputesAppeal);
    }

    public void delete(Long id) {
        LOGGER.debug("Deleting existing appeal");
        deputesAppealDao.deleteAppeal(id);
    }

    public void edit(DeputesAppeal deputesAppeal) {
        LOGGER.debug("Editing existing appeal");
        DeputesAppeal existingDeputesAppeal = deputesAppealDao.modSession(deputesAppeal);
        existingDeputesAppeal.setIncomingDate(deputesAppeal.getIncomingDate());
        existingDeputesAppeal.setNameOfDepute(deputesAppeal.getNameOfDepute());
        existingDeputesAppeal.setNumber(deputesAppeal.getNumber());
        existingDeputesAppeal.setResolutionOfChief(deputesAppeal.getResolutionOfChief());
        existingDeputesAppeal.setTypeOfAppeal(deputesAppeal.getTypeOfAppeal());
        deputesAppealDao.editAppeal(deputesAppeal, existingDeputesAppeal);
    }

    public List<DeputesAppeal> abstractSearch(String searchingChar) {
        return deputesAppealDao.abstractSearch(searchingChar);
    }
}
