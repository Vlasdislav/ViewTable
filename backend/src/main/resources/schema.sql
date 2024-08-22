CREATE TABLE IF NOT EXISTS articles (
   id                      BIGINT  AUTO_INCREMENT  PRIMARY KEY
  ,articleid               INTEGER  NOT NULL
  ,subarticleid            INTEGER  NOT NULL
  ,articlename             VARCHAR(80) NOT NULL
  ,external_str_id         VARCHAR(14)
  ,ecrlongname             VARCHAR(128) NOT NULL
  ,ecrsectionid            INTEGER  NOT NULL
  ,sectionname             VARCHAR(55) NOT NULL
  ,articlebarcode          VARCHAR(64)
  ,unitname                VARCHAR(7) NOT NULL
  ,sectiontype             VARCHAR(12) NOT NULL
  ,rest                    INTEGER
  ,flgbase                 VARCHAR(11) NOT NULL
  ,subarticlebarcode       VARCHAR(64)
  ,flg_disable             VARCHAR(14) NOT NULL
  ,flg_disable_name        VARCHAR(10) NOT NULL
  ,preparemoment_name      VARCHAR(11) NOT NULL
  ,baseprice               INTEGER
  ,ecological_class        BIT
  ,articletype             VARCHAR(12) NOT NULL
  ,article_type_name       VARCHAR(16) NOT NULL
  ,tax_system              VARCHAR(5) NOT NULL
  ,tag_1212                INTEGER
  ,tag_1162                VARCHAR(24) NOT NULL
  ,tag_1162_name           VARCHAR(3) NOT NULL
  ,subarticle_marking      VARCHAR(24) NOT NULL
  ,subarticle_marking_name VARCHAR(3) NOT NULL
  ,has_any_bc_marking      VARCHAR(24) NOT NULL
  ,has_mrc                 BIT  NOT NULL
  ,isloto                  BIT  NOT NULL
  ,class_path              VARCHAR(39) NOT NULL
  ,strpath                 VARCHAR(98) NOT NULL
);
