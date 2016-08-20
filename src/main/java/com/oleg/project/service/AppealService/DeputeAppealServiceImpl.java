package com.oleg.project.service.AppealService;


import com.oleg.project.dao.impl.DeputeAppealDaoImpl;
import com.oleg.project.domain.Appeal.DeputeAppeal;
import com.oleg.project.domain.Appeal.DeputeAppealFiles;
import com.oleg.project.domain.utilDomain.RequestForDeputeAppealSearch;
import com.oleg.project.dto.appealDto.DeputeAppealDto;
import com.oleg.project.dto.requestDto.DeputeAppealForRequestDto;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service("deputeAppealService")
@Transactional
public class DeputeAppealServiceImpl implements AppealService<DeputeAppeal, DeputeAppealDto> {

    private static final Logger LOGGER = Logger.getLogger("DeputeAppealService");

    @Autowired
    private DeputeAppealDaoImpl deputeAppealDao;

    //Method for getting all shares from DeputeAppeal table
    public List<DeputeAppeal> getAll() {
        LOGGER.debug("Retrieving all appeals");
        return deputeAppealDao.getAll();
    }

    //Method for searching and get share by id
    public DeputeAppeal getById(int id) {
        LOGGER.debug("Retrieving appeal by id");
        return deputeAppealDao.getById(id);
    }

    //Method for save new DeputeAppeal share
    public void add(DeputeAppealDto deputeAppealDto) {
        DeputeAppeal deputeAppeal = new DeputeAppeal();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date outDateForDeputeAppealSQL;
        java.sql.Date incomingDateForDeputeAppealSQL;
        java.sql.Date dateForCheckForDeputeAppealSQL;

            /*
            Parse from String value deputeAppealDto to
            deputeAppeal DateSql value for save in Entity
            with verify if value == null
             */
        if (deputeAppealDto.getOutDate() == "") {
            outDateForDeputeAppealSQL = null;
        } else {
            Date outDateForDeputeAppeal = null;
            try {
                outDateForDeputeAppeal = format.parse(deputeAppealDto.getOutDate());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            outDateForDeputeAppealSQL = new java.sql.Date(outDateForDeputeAppeal.getTime());
        }

           /*
            Parse from String value deputeAppealDto to
            deputeAppeal DateSql value for save in Entity
            with verify if value == null
             */
        if (deputeAppealDto.getIncomingDate() == "") {
            incomingDateForDeputeAppealSQL = null;
        } else {
            Date incomingDateForDeputeAppeal = null;
            try {
                incomingDateForDeputeAppeal = format.parse(deputeAppealDto.getIncomingDate());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            incomingDateForDeputeAppealSQL = new java.sql.Date(incomingDateForDeputeAppeal.getTime());
        }
               /*
            Parse from String value deputeAppealDto to
            deputeAppeal DateSql value for save in Entity
            with verify if value == null
             */
            if (deputeAppealDto.getDateForCheck() == "") {
                dateForCheckForDeputeAppealSQL = null;
            } else {
                Date dateForCheckForDeputeAppeal = null;
                try {
                    dateForCheckForDeputeAppeal = format.parse(deputeAppealDto.getDateForCheck());
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                dateForCheckForDeputeAppealSQL = new java.sql.Date(dateForCheckForDeputeAppeal.getTime());
            }
            //set all value of Entity
            deputeAppeal.setTypeOfDeputeAppeal(deputeAppealDto.getTypeOfDeputeAppeal());
            deputeAppeal.setSendingOrganization(deputeAppealDto.getSendingOrganization());
            deputeAppeal.setOutNumber(deputeAppealDto.getOutNumber());
            deputeAppeal.setOutDate(outDateForDeputeAppealSQL);
            deputeAppeal.setCountOfPages(deputeAppealDto.getCountOfPages());
            deputeAppeal.setNameOfDepute(deputeAppealDto.getNameOfDepute());
            deputeAppeal.setIncomeNumber(deputeAppealDto.getIncomeNumber());
            deputeAppeal.setIncomingDate(incomingDateForDeputeAppealSQL);
            deputeAppeal.setThemeOfAppeal(deputeAppealDto.getThemeOfAppeal());
            deputeAppeal.setShortContentOfAppeal(deputeAppealDto.getShortContentOfAppeal());
            deputeAppeal.setUnitWhoDoResolution(deputeAppealDto.getUnitWhoDoResolution());
            deputeAppeal.setContentOfResolution(deputeAppealDto.getContentOfResolution());
            deputeAppeal.setCheckForPlagiarism(deputeAppealDto.getCheckForPlagiarism());
            deputeAppeal.setNameAndAddressOfApplicant(deputeAppealDto.getNameAndAddressOfApplicant());
            deputeAppeal.setDateForCheck(dateForCheckForDeputeAppealSQL);
            deputeAppeal.setMainWorker(deputeAppealDto.getMainWorker());
            deputeAppeal.setSecondaryWorkers(deputeAppealDto.getSecondaryWorkers());
            deputeAppeal.setStatusOfWorking(deputeAppealDto.getStatusOfWorking());
            deputeAppeal.setResult(deputeAppealDto.getResult());
            LOGGER.debug("Adding new appeal");
            deputeAppealDao.addAppeal(deputeAppeal);
        }


    public void delete(int id) {
        LOGGER.debug("Deleting existing appeal");
        deputeAppealDao.deleteAppeal(id);
    }


    public void edit(DeputeAppeal deputeAppeal) {
        LOGGER.debug("Editing existing appeal");
        DeputeAppeal existingDeputesAppeal = deputeAppealDao.modSession(deputeAppeal);
        existingDeputesAppeal.setTypeOfDeputeAppeal(deputeAppeal.getTypeOfDeputeAppeal());
        existingDeputesAppeal.setSendingOrganization(deputeAppeal.getSendingOrganization());
        existingDeputesAppeal.setOutNumber(deputeAppeal.getOutNumber());
        existingDeputesAppeal.setOutDate(deputeAppeal.getOutDate());
        existingDeputesAppeal.setCountOfPages(deputeAppeal.getCountOfPages());
        existingDeputesAppeal.setNameOfDepute(deputeAppeal.getNameOfDepute());
        existingDeputesAppeal.setIncomeNumber(deputeAppeal.getIncomeNumber());
        existingDeputesAppeal.setIncomingDate(deputeAppeal.getIncomingDate());
        existingDeputesAppeal.setThemeOfAppeal(deputeAppeal.getThemeOfAppeal());
        existingDeputesAppeal.setShortContentOfAppeal(deputeAppeal.getShortContentOfAppeal());
        existingDeputesAppeal.setUnitWhoDoResolution(deputeAppeal.getUnitWhoDoResolution());
        existingDeputesAppeal.setContentOfResolution(deputeAppeal.getContentOfResolution());
        existingDeputesAppeal.setCheckForPlagiarism(deputeAppeal.getCheckForPlagiarism());
        existingDeputesAppeal.setNameAndAddressOfApplicant(deputeAppeal.getNameAndAddressOfApplicant());
        existingDeputesAppeal.setDateForCheck(deputeAppeal.getDateForCheck());
        existingDeputesAppeal.setMainWorker(deputeAppeal.getMainWorker());
        existingDeputesAppeal.setSecondaryWorkers(deputeAppeal.getSecondaryWorkers());
        existingDeputesAppeal.setStatusOfWorking(deputeAppeal.getStatusOfWorking());
        existingDeputesAppeal.setResult(deputeAppeal.getResult());
        deputeAppealDao.editAppeal(deputeAppeal, existingDeputesAppeal);
    }
    //method return list of all DeputeAppeals where searchChar == typing characters
    public List<DeputeAppeal> abstractSearch(String searchingChar) {
        return deputeAppealDao.abstractSearch(searchingChar);
    }

    public List<DeputeAppeal> individualSearch(DeputeAppealForRequestDto deputeAppealForRequestDto) {

        RequestForDeputeAppealSearch requestForDeputeAppealSearch = new RequestForDeputeAppealSearch();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date incomeDateForDeputeAppealSQLSearch;
        java.sql.Date outDateForDeputeAppealSQLSearch;

        if(deputeAppealForRequestDto.getOutDate() == "") {
            deputeAppealForRequestDto.setOutDate(null);
        } else {
            try {
                Date outDateForSearch = format.parse(deputeAppealForRequestDto.getOutDate());
                outDateForDeputeAppealSQLSearch = new java.sql.Date(outDateForSearch.getTime());
                requestForDeputeAppealSearch.setOutDate(outDateForDeputeAppealSQLSearch);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }


        if(deputeAppealForRequestDto.getIncomingDate() == "") {
            deputeAppealForRequestDto.setIncomingDate(null);
        } else {
            try {
                Date incomingDateForSearch = format.parse(deputeAppealForRequestDto.getIncomingDate());
                incomeDateForDeputeAppealSQLSearch = new java.sql.Date(incomingDateForSearch.getTime());
                requestForDeputeAppealSearch.setIncomingDate(incomeDateForDeputeAppealSQLSearch);
            } catch (ParseException e) {
                e.printStackTrace();
            }

        }
        requestForDeputeAppealSearch.setOutNumber(deputeAppealForRequestDto.getOutNumber());
        requestForDeputeAppealSearch.setIncomeNumber(deputeAppealForRequestDto.getIncomeNumber());
        requestForDeputeAppealSearch.setNameAndAddressOfApplicant(deputeAppealForRequestDto.getNameAndAddressOfApplicant());
        requestForDeputeAppealSearch.setNameOfDepute(deputeAppealForRequestDto.getNameOfDepute());
        requestForDeputeAppealSearch.setSendingOrganization(deputeAppealForRequestDto.getSendingOrganization());
        requestForDeputeAppealSearch.setShortContentOfAppeal(deputeAppealForRequestDto.getShortContentOfAppeal());
        requestForDeputeAppealSearch.setMainWorker(deputeAppealForRequestDto.getMainWorker());
        requestForDeputeAppealSearch.setTypeOfDeputeAppeal(deputeAppealForRequestDto.getTypeOfDeputeAppeal());
        return deputeAppealDao.individualSearch(requestForDeputeAppealSearch);
    }

    public DeputeAppeal editFromDtoToEntity(DeputeAppealDto deputeAppealDto){

        DeputeAppeal deputeAppeal = new DeputeAppeal();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date outDateForDeputeAppealEdit;
        java.sql.Date incomingDateForDeputeAppealEdit;
        java.sql.Date dateForCheckForDeputeAppealEdit;

            /*
            Parse from String value deputeAppealDto to
            deputeAppeal DateSql value for save in Entity
            with verify if value == null
             */
        if (deputeAppealDto.getOutDate().equals("")) {
            outDateForDeputeAppealEdit = null;
        } else {
            Date outDateForDeputeAppeal = null;
            try {
                outDateForDeputeAppeal = format.parse(deputeAppealDto.getOutDate());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            outDateForDeputeAppealEdit = new java.sql.Date(outDateForDeputeAppeal.getTime());
        }

           /*
            Parse from String value deputeAppealDto to
            deputeAppeal DateSql value for save in Entity
            with verify if value == null
             */
        if (deputeAppealDto.getIncomingDate().equals("")) {
            incomingDateForDeputeAppealEdit = null;
        } else {
            Date incomingDateForDeputeAppeal = null;
            try {
                incomingDateForDeputeAppeal = format.parse(deputeAppealDto.getIncomingDate());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            incomingDateForDeputeAppealEdit = new java.sql.Date(incomingDateForDeputeAppeal.getTime());
        }
               /*
            Parse from String value deputeAppealDto to
            deputeAppeal DateSql value for save in Entity
            with verify if value == null
             */
        if (deputeAppealDto.getDateForCheck().equals("")) {
            dateForCheckForDeputeAppealEdit = null;
        } else {
            Date dateForCheckForDeputeAppeal = null;
            try {
                dateForCheckForDeputeAppeal = format.parse(deputeAppealDto.getDateForCheck());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            dateForCheckForDeputeAppealEdit = new java.sql.Date(dateForCheckForDeputeAppeal.getTime());
        }
        //set all value of Entity
        deputeAppeal.setTypeOfDeputeAppeal(deputeAppealDto.getTypeOfDeputeAppeal());
        deputeAppeal.setSendingOrganization(deputeAppealDto.getSendingOrganization());
        deputeAppeal.setOutNumber(deputeAppealDto.getOutNumber());
        deputeAppeal.setOutDate(outDateForDeputeAppealEdit);
        deputeAppeal.setCountOfPages(deputeAppealDto.getCountOfPages());
        deputeAppeal.setNameOfDepute(deputeAppealDto.getNameOfDepute());
        deputeAppeal.setIncomeNumber(deputeAppealDto.getIncomeNumber());
        deputeAppeal.setIncomingDate(incomingDateForDeputeAppealEdit);
        deputeAppeal.setThemeOfAppeal(deputeAppealDto.getThemeOfAppeal());
        deputeAppeal.setShortContentOfAppeal(deputeAppealDto.getShortContentOfAppeal());
        deputeAppeal.setUnitWhoDoResolution(deputeAppealDto.getUnitWhoDoResolution());
        deputeAppeal.setContentOfResolution(deputeAppealDto.getContentOfResolution());
        deputeAppeal.setCheckForPlagiarism(deputeAppealDto.getCheckForPlagiarism());
        deputeAppeal.setNameAndAddressOfApplicant(deputeAppealDto.getNameAndAddressOfApplicant());
        deputeAppeal.setDateForCheck(dateForCheckForDeputeAppealEdit);
        deputeAppeal.setMainWorker(deputeAppealDto.getMainWorker());
        deputeAppeal.setSecondaryWorkers(deputeAppealDto.getSecondaryWorkers());
        deputeAppeal.setStatusOfWorking(deputeAppealDto.getStatusOfWorking());
        deputeAppeal.setResult(deputeAppealDto.getResult());

        return deputeAppeal;
    }

    public void editFilePath(DeputeAppealFiles deputeAppealFiles) {
        deputeAppealDao.editFilePathName(deputeAppealFiles);
    }
}
