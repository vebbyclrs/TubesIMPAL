/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     26-Nov-17 1:58:42 PM                         */
/*==============================================================*/


drop table if exists ADMIN;

drop table if exists DOSEN;

drop table if exists JADWAL;

drop table if exists MAHASISWA;

drop table if exists MATA_KULIAH;

drop table if exists TAKEN_SCHEDULE;

/*==============================================================*/
/* Table: ADMIN                                                 */
/*==============================================================*/
create table ADMIN
(
   ID                   varchar(10) not null,
   NAMA                 varchar(60),
   USERNAME             varchar(32),
   PASSWORD             varchar(32),
   primary key (ID)
);

/*==============================================================*/
/* Table: DOSEN                                                 */
/*==============================================================*/
create table DOSEN
(
   ID_DOSEN             int not null,
   NAMA                 varchar(30),
   TANGGAL_LAHIR        date,
   TEMPAT_LAHIR         varchar(60),
   ALAMAT               varchar(60),
   ISMALE               bool,
   NO_HP                bigint,
   EMAIL                varchar(60),
   PASSWORD             varchar(32),
   primary key (ID_DOSEN)
);

/*==============================================================*/
/* Table: JADWAL                                                */
/*==============================================================*/
create table JADWAL
(
   IDJADWAL             int not null,
   ID_MATKUL            int,
   PUKUL                time,
   HARI                 varchar(10),
   primary key (IDJADWAL)
);

/*==============================================================*/
/* Table: MAHASISWA                                             */
/*==============================================================*/
create table MAHASISWA
(
   NIM                  bigint not null,
   ID_DOSEN             int,
   NAMA                 varchar(30),
   IS_MALE              bool,
   TANGGAL_LAHIR        date,
   TEMPAT_LAHIR         varchar(20),
   ALAMAT               varchar(60),
   NO_HP                bigint,
   ANGKATAN             int,
   STATUS_PEMBAYARAN    bool,
   TOTAL_SKS            int,
   EMAIL                varchar(60),
   PASSWORD             varchar(32),
   primary key (NIM)
);

/*==============================================================*/
/* Table: MATA_KULIAH                                           */
/*==============================================================*/
create table MATA_KULIAH
(
   ID_MATKUL            int not null,
   ID_DOSEN             int,
   NAMA_MATKUL          varbinary(60),
   SKS                  int,
   primary key (ID_MATKUL)
);

/*==============================================================*/
/* Table: TAKEN_SCHEDULE                                        */
/*==============================================================*/
create table TAKEN_SCHEDULE
(
   NIM                  bigint,
   IDJADWAL             int
);

alter table JADWAL add constraint FK_REFERENCE_6 foreign key (ID_MATKUL)
      references MATA_KULIAH (ID_MATKUL) on delete restrict on update restrict;

alter table MAHASISWA add constraint FK_REFERENCE_5 foreign key (ID_DOSEN)
      references DOSEN (ID_DOSEN) on delete restrict on update restrict;

alter table MATA_KULIAH add constraint FK_REFERENCE_4 foreign key (ID_DOSEN)
      references DOSEN (ID_DOSEN) on delete restrict on update restrict;

alter table TAKEN_SCHEDULE add constraint FK_REFERENCE_1 foreign key (NIM)
      references MAHASISWA (NIM) on delete restrict on update restrict;

alter table TAKEN_SCHEDULE add constraint FK_REFERENCE_2 foreign key (IDJADWAL)
      references JADWAL (IDJADWAL) on delete restrict on update restrict;

