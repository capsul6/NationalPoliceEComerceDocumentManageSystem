package com.oleg.project.service.appealFilesService;

import com.oleg.project.dao.appealFilesImpl.DeputeAppealFilesDaoImpl;
import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("deputeAppealFilesService")
@Transactional
public class DeputeAppealFilesServiceImpl implements AppealFilesService<DeputeAppealFiles> {

    @Autowired
    DeputeAppealFilesDaoImpl deputeAppealFilesDao;

    public List<DeputeAppealFiles> getAll() {
        return deputeAppealFilesDao.getAll();
    }

    public DeputeAppealFiles getByFileId(int id) {
        return deputeAppealFilesDao.getByFileId(id);
    }

    public void addFiles(DeputeAppealFiles deputeAppealFiles) {
        deputeAppealFilesDao.addFiles(deputeAppealFiles);
    }

    public void deleteFilesByAppealId(int id) {
        deputeAppealFilesDao.deleteFilesByAppealId(id);
    }
}
