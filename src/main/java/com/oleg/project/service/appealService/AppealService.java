package com.oleg.project.service.appealService;


import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;
import com.oleg.project.dto.requestDto.DeputeAppealForRequestDto;

import java.util.List;

public interface AppealService<Appeal, AppealDto> {

    List<Appeal> getAll();

    Appeal getById(int id);

    void add(AppealDto appealDto);

    void delete(int id);

    void edit(Appeal appeal);

    List<Appeal> abstractSearch(String searchingChar);

    List<Appeal> individualSearch(DeputeAppealForRequestDto deputeAppealForRequest);

    Appeal editFromDtoToEntity(AppealDto appealDto);

    void editFilePath(DeputeAppealFiles deputeAppealFiles);

}
