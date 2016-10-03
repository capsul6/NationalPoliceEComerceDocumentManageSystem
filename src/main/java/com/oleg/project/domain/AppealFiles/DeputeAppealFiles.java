package com.oleg.project.domain.AppealFiles;


import com.oleg.project.domain.Appeal.DeputeAppeal;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "DeputeAppealFiles")
public class DeputeAppealFiles extends Files implements Serializable {

    private static final long serialVersionUID = -5227566248002296042L;

    @Id
    @Column(name = "DeputeAppealFiles_ID", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int deputeAppealFilesId;

    @Column(name = "FileName")
    private String fileName;

    @Column(name = "FilePath")
    private String filePath;

    @Column(name = "FileType")
    private String fileType;

    @ManyToOne
    @JoinColumn(name = "DeputeAppeal_ID")
    private DeputeAppeal deputeAppeal;

    public DeputeAppealFiles(){}

    public String getFilePathById() {
        return this.getFilePath();
    }

    public Integer getDeputeAppealFilesId() {
        return deputeAppealFilesId;
    }

    public void setDeputeAppealFilesId(Integer deputeAppealFilesId) {
        this.deputeAppealFilesId = deputeAppealFilesId;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public DeputeAppeal getDeputeAppeal() {
        return this.deputeAppeal;
    }

    public void setDeputeAppeal(DeputeAppeal deputeAppeal) {
        this.deputeAppeal = deputeAppeal;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
