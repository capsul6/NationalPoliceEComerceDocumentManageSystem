package com.oleg.project.service;


import com.oleg.project.domain.DeputesAppeal;

import java.util.List;

public interface DeputesAppealService {

    List<DeputesAppeal> getAll();

    DeputesAppeal getById(Long id);

    void add(DeputesAppeal deputesAppeal);

    void delete(Long id);

    void edit(DeputesAppeal deputesAppeal);

    List<DeputesAppeal> abstractSearch(String searchingChar);

}
