package com.example.tableview.model;

import jakarta.persistence.*;

@Entity
@Table(name = "articles")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "articleid", nullable = false)
    private Long articleid;

    @Column(name = "subarticleid", nullable = false)
    private Long subarticleid;

    @Column(name = "articlename", nullable = false, length = 80)
    private String articlename;

    @Column(name = "external_str_id", length = 14)
    private String externalStrId;

    @Column(name = "ecrlongname", nullable = false, length = 128)
    private String ecrlongname;

    @Column(name = "ecrsectionid", nullable = false)
    private Long ecrsectionid;

    @Column(name = "sectionname", nullable = false, length = 55)
    private String sectionname;

    @Column(name = "articlebarcode", length = 64)
    private String articlebarcode;

    @Column(name = "unitname", nullable = false, length = 7)
    private String unitname;

    @Column(name = "sectiontype", nullable = false, length = 12)
    private String sectiontype;

    @Column(name = "rest")
    private Long rest;

    @Column(name = "flgbase", nullable = false, length = 11)
    private String flgbase;

    @Column(name = "subarticlebarcode", length = 64)
    private String subarticlebarcode;

    @Column(name = "flg_disable", nullable = false, length = 14)
    private String flgDisable;

    @Column(name = "flg_disable_name", nullable = false, length = 10)
    private String flgDisableName;

    @Column(name = "preparemoment_name", nullable = false, length = 11)
    private String preparemomentName;

    @Column(name = "baseprice")
    private Long baseprice;

    @Column(name = "ecological_class")
    private Boolean ecologicalClass;

    @Column(name = "articletype", nullable = false, length = 12)
    private String articletype;

    @Column(name = "article_type_name", nullable = false, length = 16)
    private String articleTypeName;

    @Column(name = "tax_system", nullable = false, length = 5)
    private String taxSystem;

    @Column(name = "tag_1212")
    private Long tag1212;

    @Column(name = "tag_1162", nullable = false, length = 24)
    private String tag1162;

    @Column(name = "tag_1162_name", nullable = false, length = 3)
    private String tag1162Name;

    @Column(name = "subarticle_marking", nullable = false, length = 24)
    private String subarticleMarking;

    @Column(name = "subarticle_marking_name", nullable = false, length = 3)
    private String subarticleMarkingName;

    @Column(name = "has_any_bc_marking", length = 24)
    private String hasAnyBcMarking;

    @Column(name = "has_mrc", nullable = false)
    private Boolean hasMrc;

    @Column(name = "isloto", nullable = false)
    private Boolean isLoto;

    @Column(name = "class_path", nullable = false, length = 39)
    private String classPath;

    @Column(name = "strpath", nullable = false, length = 98)
    private String strPath;

    // Конструкторы, геттеры и сеттеры

    public Article(Long articleid, Long subarticleid, String articlename, String externalStrId, String ecrlongname, Long ecrsectionid, String sectionname, String articlebarcode, String unitname, String sectiontype, Long rest, String flgbase, String subarticlebarcode, String flgDisable, String flgDisableName, String preparemomentName, Long baseprice, Boolean ecologicalClass, String articletype, String articleTypeName, String taxSystem, Long tag1212, String tag1162, String tag1162Name, String subarticleMarking, String subarticleMarkingName, String hasAnyBcMarking, Boolean hasMrc, Boolean isLoto, String classPath, String strPath) {
        this.articleid = articleid;
        this.subarticleid = subarticleid;
        this.articlename = articlename;
        this.externalStrId = externalStrId;
        this.ecrlongname = ecrlongname;
        this.ecrsectionid = ecrsectionid;
        this.sectionname = sectionname;
        this.articlebarcode = articlebarcode;
        this.unitname = unitname;
        this.sectiontype = sectiontype;
        this.rest = rest;
        this.flgbase = flgbase;
        this.subarticlebarcode = subarticlebarcode;
        this.flgDisable = flgDisable;
        this.flgDisableName = flgDisableName;
        this.preparemomentName = preparemomentName;
        this.baseprice = baseprice;
        this.ecologicalClass = ecologicalClass;
        this.articletype = articletype;
        this.articleTypeName = articleTypeName;
        this.taxSystem = taxSystem;
        this.tag1212 = tag1212;
        this.tag1162 = tag1162;
        this.tag1162Name = tag1162Name;
        this.subarticleMarking = subarticleMarking;
        this.subarticleMarkingName = subarticleMarkingName;
        this.hasAnyBcMarking = hasAnyBcMarking;
        this.hasMrc = hasMrc;
        this.isLoto = isLoto;
        this.classPath = classPath;
        this.strPath = strPath;
    }

    public Article() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleid() {
        return articleid;
    }

    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    public Long getSubarticleid() {
        return subarticleid;
    }

    public void setSubarticleid(Long subarticleid) {
        this.subarticleid = subarticleid;
    }

    public String getArticlename() {
        return articlename;
    }

    public void setArticlename(String articlename) {
        this.articlename = articlename;
    }

    public String getExternalStrId() {
        return externalStrId;
    }

    public void setExternalStrId(String externalStrId) {
        this.externalStrId = externalStrId;
    }

    public String getEcrlongname() {
        return ecrlongname;
    }

    public void setEcrlongname(String ecrlongname) {
        this.ecrlongname = ecrlongname;
    }

    public Long getEcrsectionid() {
        return ecrsectionid;
    }

    public void setEcrsectionid(Long ecrsectionid) {
        this.ecrsectionid = ecrsectionid;
    }

    public String getSectionname() {
        return sectionname;
    }

    public void setSectionname(String sectionname) {
        this.sectionname = sectionname;
    }

    public String getArticlebarcode() {
        return articlebarcode;
    }

    public void setArticlebarcode(String articlebarcode) {
        this.articlebarcode = articlebarcode;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getSectiontype() {
        return sectiontype;
    }

    public void setSectiontype(String sectiontype) {
        this.sectiontype = sectiontype;
    }

    public Long getRest() {
        return rest;
    }

    public void setRest(Long rest) {
        this.rest = rest;
    }

    public String getFlgbase() {
        return flgbase;
    }

    public void setFlgbase(String flgbase) {
        this.flgbase = flgbase;
    }

    public String getSubarticlebarcode() {
        return subarticlebarcode;
    }

    public void setSubarticlebarcode(String subarticlebarcode) {
        this.subarticlebarcode = subarticlebarcode;
    }

    public String getFlgDisable() {
        return flgDisable;
    }

    public void setFlgDisable(String flgDisable) {
        this.flgDisable = flgDisable;
    }

    public String getFlgDisableName() {
        return flgDisableName;
    }

    public void setFlgDisableName(String flgDisableName) {
        this.flgDisableName = flgDisableName;
    }

    public String getPreparemomentName() {
        return preparemomentName;
    }

    public void setPreparemomentName(String preparemomentName) {
        this.preparemomentName = preparemomentName;
    }

    public Long getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(Long baseprice) {
        this.baseprice = baseprice;
    }

    public Boolean getEcologicalClass() {
        return ecologicalClass;
    }

    public void setEcologicalClass(Boolean ecologicalClass) {
        this.ecologicalClass = ecologicalClass;
    }

    public String getArticletype() {
        return articletype;
    }

    public void setArticletype(String articletype) {
        this.articletype = articletype;
    }

    public String getArticleTypeName() {
        return articleTypeName;
    }

    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    public String getTaxSystem() {
        return taxSystem;
    }

    public void setTaxSystem(String taxSystem) {
        this.taxSystem = taxSystem;
    }

    public Long getTag1212() {
        return tag1212;
    }

    public void setTag1212(Long tag1212) {
        this.tag1212 = tag1212;
    }

    public String getTag1162() {
        return tag1162;
    }

    public void setTag1162(String tag1162) {
        this.tag1162 = tag1162;
    }

    public String getTag1162Name() {
        return tag1162Name;
    }

    public void setTag1162Name(String tag1162Name) {
        this.tag1162Name = tag1162Name;
    }

    public String getSubarticleMarking() {
        return subarticleMarking;
    }

    public void setSubarticleMarking(String subarticleMarking) {
        this.subarticleMarking = subarticleMarking;
    }

    public String getSubarticleMarkingName() {
        return subarticleMarkingName;
    }

    public void setSubarticleMarkingName(String subarticleMarkingName) {
        this.subarticleMarkingName = subarticleMarkingName;
    }

    public String getHasAnyBcMarking() {
        return hasAnyBcMarking;
    }

    public void setHasAnyBcMarking(String hasAnyBcMarking) {
        this.hasAnyBcMarking = hasAnyBcMarking;
    }

    public Boolean getHasMrc() {
        return hasMrc;
    }

    public void setHasMrc(Boolean hasMrc) {
        this.hasMrc = hasMrc;
    }

    public Boolean getLoto() {
        return isLoto;
    }

    public void setLoto(Boolean loto) {
        isLoto = loto;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getStrPath() {
        return strPath;
    }

    public void setStrPath(String strPath) {
        this.strPath = strPath;
    }
}
