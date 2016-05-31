package com.oleg.project.dao;

import com.oleg.project.domain.DeputesAppeal;

import java.util.List;


public interface DeputesAppealDao {

    List<DeputesAppeal> getAll();

    DeputesAppeal getById(Long id);

    void addAppeal(DeputesAppeal deputesAppeal);

    void deleteAppeal(Long id);

    void editAppeal(DeputesAppeal deputesAppeal, DeputesAppeal existingDeputesAppeal);

    DeputesAppeal modSession(DeputesAppeal deputesAppeal);

    List<DeputesAppeal> abstractSearch(String searchingChar);
}
