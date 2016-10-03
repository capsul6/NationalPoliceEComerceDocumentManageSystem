package com.oleg.project.service.appealService;


import com.oleg.project.dao.appealImpl.accessAppealDaoImpl.AccessAppealDaoImpl;
import com.oleg.project.domain.Appeal.AccessAppeal;
import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;
import com.oleg.project.dto.appealDto.AccessAppealDto;
import com.oleg.project.dto.requestDto.DeputeAppealForRequestDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccessAppealServiceImpl implements AppealService<AccessAppeal, AccessAppealDto> {

    private static final Logger LOGGER = Logger.getLogger("AccessAppealService");

    @Autowired
    AccessAppealDaoImpl accessAppealDao;

    public List<AccessAppeal> getAll() {
        LOGGER.debug("Retrieving all appeals");
        return accessAppealDao.getAll();
    }

    public AccessAppeal getById(int id) {
        LOGGER.debug("Retrieving appeal by id");
        return accessAppealDao.getById(id);
    }

    public void add(AccessAppealDto accessAppealDto) {
        AccessAppeal accessAppeal = new AccessAppeal();
        LOGGER.debug("Adding new appeal");
        accessAppealDao.addAppeal(accessAppeal);
    }

    public void delete(int id) {
        LOGGER.debug("Deleting existing appeal");
        accessAppealDao.deleteAppeal(id);
    }


    public void edit(AccessAppeal accessAppeal) {
        LOGGER.debug("Editing existing appeal");
        AccessAppeal existingAccessAppeal = accessAppealDao.modSession(accessAppeal);
        accessAppealDao.editAppeal(accessAppeal, existingAccessAppeal);
    }
    //method return list of all AccessAppeals where searchChar == enter characters
    public List<AccessAppeal> abstractSearch(String searchingChar) {
        return accessAppealDao.abstractSearch(searchingChar);
    }


    public List<AccessAppeal> individualSearch(DeputeAppealForRequestDto deputeAppealForRequest) {
        return null;
    }

    public AccessAppeal editFromDtoToEntity(AccessAppealDto accessAppealDto) {
        return null;
    }

    public void editFilePath(DeputeAppealFiles deputeAppealFiles) {

    }

}
