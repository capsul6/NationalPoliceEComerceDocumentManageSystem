package com.oleg.project.dao;

import com.oleg.project.domain.Appeal.DeputeAppealFiles;
import com.oleg.project.domain.utilDomain.RequestForDeputeAppealSearch;

import java.util.List;


public interface AppealDao<Appeal> {

    List<Appeal> getAll();

    Appeal getById(int id);

    void addAppeal(Appeal appeal);

    void deleteAppeal(int id);

    void editAppeal(Appeal appeal, Appeal existingAppeal);

    Appeal modSession(Appeal appeal);

    List<Appeal> abstractSearch(String searchingChar);

    List<Appeal> individualSearch(RequestForDeputeAppealSearch deputeAppealForRequest);

    void editFilePathName(DeputeAppealFiles deputeAppealFiles);
}
