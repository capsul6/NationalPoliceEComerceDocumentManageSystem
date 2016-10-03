package com.oleg.project.dao;


import java.util.List;

public interface AppealFilesDao<Files> {

    List<Files> getAll();

    Files getByFileId(int id);

    void addFiles(Files files);

    void deleteFilesByAppealId(int id);
}
