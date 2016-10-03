package com.oleg.project.dao.appealFilesImpl;


import com.oleg.project.dao.AppealFilesDao;
import com.oleg.project.dao.SessionDao;
import com.oleg.project.domain.AppealFiles.DeputeAppealFiles;
import org.hibernate.Criteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("deputeAppealFilesDao")
public class DeputeAppealFilesDaoImpl implements AppealFilesDao<DeputeAppealFiles> {

    @Autowired
    SessionDao sessionDao;

    public List<DeputeAppealFiles> getAll() {
        Criteria criteria = sessionDao.getSession().createCriteria(DeputeAppealFiles.class);
        return criteria.list();
    }

    public DeputeAppealFiles getByFileId(int id) {
        DeputeAppealFiles deputeAppealFiles = sessionDao.getSession().get(DeputeAppealFiles.class, id);
        return deputeAppealFiles;
    }

    public void addFiles(DeputeAppealFiles deputeAppealFiles) {
        sessionDao.getSession().save(deputeAppealFiles);
    }

    public void deleteFilesByAppealId(int id) {
        sessionDao.getSession().delete(id);
    }
}
