drop table if exists ACCESS_APPEAL;
drop table if exists DEPUTES_APPEAL;
drop table if exists LAWYER_APPEAL;
drop table if exists hibernate_sequence;
drop table if exists DeputeAppealFiles;


create table ACCESS_APPEAL (
  ID integer not null AUTO_INCREMENT,
  filePath varchar(255),
  address varchar(255),
  checkForPlagiarism varchar(255),
  contentOfResolution varchar(255),
  countOfPages varchar(255),
  dateForCheck date NULL DEFAULT NULL,
  howAppealWasTaken varchar(255),
  incomeNumber varchar(255),
  incomingDate date NULL DEFAULT NULL,
  mainWorker varchar(255),
  nameOfLawyer varchar(255),
  result varchar(255),
  secondaryWorkers varchar(255),
  shortContentOfAppeal varchar(255),
  statusOfApplicant varchar(255),
  statusOfWorking varchar(255),
  themeOfAppeal varchar(255),
  unitWhoDoResolution varchar(255),
  primary key (ID));

create table DEPUTES_APPEAL (
  ID integer not null AUTO_INCREMENT,
  sendingOrganization varchar(255),
  checkForPlagiarism varchar(255),
  contentOfResolution TEXT,
  countOfPages varchar(255),
  dateForCheck date NULL DEFAULT NULL,
  incomeNumber varchar(255),
  incomingDate date NULL DEFAULT NULL,
  mainWorker varchar(255),
  nameAndAddressOfApplicant TEXT,
  nameOfDepute varchar(255),
  outDate date NULL DEFAULT NULL,
  outNumber varchar(255),
  result TEXT,
  secondaryWorkers varchar(255),
  shortContentOfAppeal TEXT,
  statusOfWorking varchar(255),
  themeOfAppeal varchar(255),
  TypeOfDeputeAppeal varchar(255),
  unitWhoDoResolution varchar(255),
  deputeAppealFilesId INTEGER NOT NULL UNIQUE,
  FOREIGN KEY (D),
  primary key (ID));

create table LAWYER_APPEAL (
  ID integer not null AUTO_INCREMENT,
  filePath varchar(255),
  address varchar(255),
  checkForPlagiarism varchar(255),
  contentOfResolution varchar(255),
  countOfPages varchar(255),
  dateForCheck date NULL DEFAULT NULL,
  howAppealWasTaken varchar(255),
  incomeNumber varchar(255),
  incomingDate date NULL DEFAULT NULL,
  mainWorker varchar(255),
  nameOfLawyer varchar(255),
  result varchar(255),
  secondaryWorkers varchar(255),
  shortContentOfAppeal varchar(255),
  statusOfWorking varchar(255),
  themeOfAppeal varchar(255),
  unitWhoDoResolution varchar(255),
  primary key (ID));

create table DeputeAppealFiles (
  ID integer not null AUTO_INCREMENT,
  FilePath varchar(255),
  FileType varchar(255),
  DEPUTES_APPEAL_ID integer NOT NULL REFERENCES DEPUTES_APPEAL(deputeAppealFilesId),
  primary key (ID));

create table hibernate_sequence (next_val bigint);
  insert into hibernate_sequence values ( 1 );
  insert into hibernate_sequence values ( 1 );
  insert into hibernate_sequence values ( 1 );
  insert into hibernate_sequence values ( 1 );





