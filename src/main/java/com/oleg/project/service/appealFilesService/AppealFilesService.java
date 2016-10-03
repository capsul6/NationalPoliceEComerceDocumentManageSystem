package com.oleg.project.service.appealFilesService;


import java.util.List;

public interface AppealFilesService<Files> {

    List<Files> getAll();

    Files getByFileId(int id);

    void addFiles(Files files);

    void deleteFilesByAppealId(int id);
}
