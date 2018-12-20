package com.my.fate.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author M.Y
 * @version 1.0
 * @date 2018/12/3 14:26
 */

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键（手机号码）
     */
    private String userId;

    /**
     * 姓名
     */
    private String userName;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 属象
     */
    private Integer zodiac;

    /**
     * 身高
     */
    private Integer height;

    /**
     * 体重
     */
    private String weight;

    /**
     * 家乡
     */
    private String hometown;

    /**
     * 学历
     */
    private String education;

    /**
     * 本科学校
     */
    private String bachelorSchool;

    /**
     * 硕士学校
     */
    private String masterSchool;

    /**
     * 博士学校
     */
    private String doctorSchool;

    /**
     * 收入
     */
    private Integer income;

    /**
     * 职业
     */
    private Integer occupation;

    /**
     * 工作地
     */
    private String workplace;

    /**
     * 兴趣爱好
     */
    private String habit;

    /**
     * 照片
     */
    private String photo;

    /**
     * 声音
     */
    private byte[] voice;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 恋爱中
     */
    private Integer fallInLove;

    /**
     * 结婚
     */
    private Integer married;

    /**
     * 是否启用，1为启动，0为不启用
     */
    private Boolean isEnabled;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getZodiac() {
        return zodiac;
    }

    public void setZodiac(Integer zodiac) {
        this.zodiac = zodiac;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getBachelorSchool() {
        return bachelorSchool;
    }

    public void setBachelorSchool(String bachelorSchool) {
        this.bachelorSchool = bachelorSchool == null ? null : bachelorSchool.trim();
    }

    public String getMasterSchool() {
        return masterSchool;
    }

    public void setMasterSchool(String masterSchool) {
        this.masterSchool = masterSchool == null ? null : masterSchool.trim();
    }

    public String getDoctorSchool() {
        return doctorSchool;
    }

    public void setDoctorSchool(String doctorSchool) {
        this.doctorSchool = doctorSchool == null ? null : doctorSchool.trim();
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getOccupation() {
        return occupation;
    }

    public void setOccupation(Integer occupation) {
        this.occupation = occupation;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getHabit() {
        return habit;
    }

    public void setHabit(String habit) {
        this.habit = habit == null ? null : habit.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public byte[] getVoice() {
        return voice;
    }

    public void setVoice(byte[] voice) {
        this.voice = voice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public Integer getFallInLove() {
        return fallInLove;
    }

    public void setFallInLove(Integer fallInLove) {
        this.fallInLove = fallInLove;
    }

    public Integer getMarried() {
        return married;
    }

    public void setMarried(Integer married) {
        this.married = married;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}