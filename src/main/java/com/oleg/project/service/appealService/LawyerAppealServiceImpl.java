package com.oleg.project.service.appealService;


import com.oleg.project.dao.appealImpl.lawyerAppealDaoImpl.LawyerAppealDaoImpl;
import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;
import com.oleg.project.domain.Appeal.LawyerAppeal;
import com.oleg.project.dto.appealDto.LawyerAppealDto;
import com.oleg.project.dto.requestDto.DeputeAppealForRequestDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class LawyerAppealServiceImpl implements AppealService<LawyerAppeal, LawyerAppealDto> {

    private static final Logger LOGGER = Logger.getLogger("LawyerAppealService");

    @Autowired
    LawyerAppealDaoImpl lawyerAppealDao;

    public List<LawyerAppeal> getAll() {
        LOGGER.debug("Retrieving all appeals");
        return lawyerAppealDao.getAll();
    }

    public LawyerAppeal getById(int id) {
        LOGGER.debug("Retrieving appeal by id");
        return lawyerAppealDao.getById(id);
    }

    public void add(LawyerAppealDto lawyerAppealDto) {
        LawyerAppeal lawyerAppeal = new LawyerAppeal();
        LOGGER.debug("Adding new appeal");
        lawyerAppealDao.addAppeal(lawyerAppeal);
    }

    public void delete(int id) {
        LOGGER.debug("Deleting existing appeal");
        lawyerAppealDao.deleteAppeal(id);
    }


    public void edit(LawyerAppeal lawyerAppeal) {
        LOGGER.debug("Editing existing appeal");
        LawyerAppeal existingLawyerAppeal = lawyerAppealDao.modSession(lawyerAppeal);
        lawyerAppealDao.editAppeal(lawyerAppeal, existingLawyerAppeal);
    }
    //method return list of all LawyerAppeals where searchChar == enter characters
    public List<LawyerAppeal> abstractSearch(String searchingChar) {
        return lawyerAppealDao.abstractSearch(searchingChar);
    }


    public List<LawyerAppeal> individualSearch(DeputeAppealForRequestDto deputeAppealForRequest) {
        return null;
    }


    public LawyerAppeal editFromDtoToEntity(LawyerAppealDto lawyerAppealDto) {
        return null;
    }

    public void editFilePath(DeputeAppealFiles deputeAppealFiles) {

    }

}

