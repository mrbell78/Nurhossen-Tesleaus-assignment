package com.nurhossen.nur_assignmentapp.service.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Profile {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("is_public")
@Expose
private Integer isPublic;
@SerializedName("avatar_url")
@Expose
private String avatarUrl;
@SerializedName("cover_photo_url")
@Expose
private String coverPhotoUrl;
@SerializedName("date_of_birth")
@Expose
private Object dateOfBirth;
@SerializedName("phone")
@Expose
private String phone;
@SerializedName("qualification")
@Expose
private String qualification;
@SerializedName("experience")
@Expose
private String experience;
@SerializedName("skills")
@Expose
private List<String> skills = null;
@SerializedName("business_number")
@Expose
private Object businessNumber;
@SerializedName("cover_letter")
@Expose
private String coverLetter;
@SerializedName("job_title")
@Expose
private Object jobTitle;
@SerializedName("company_name")
@Expose
private Object companyName;
@SerializedName("company_size")
@Expose
private Object companySize;
@SerializedName("business_type")
@Expose
private Object businessType;
@SerializedName("company_registration_number")
@Expose
private Object companyRegistrationNumber;
@SerializedName("location")
@Expose
private String location;
@SerializedName("country")
@Expose
private String country;
@SerializedName("created_at")
@Expose
private String createdAt;
@SerializedName("updated_at")
@Expose
private String updatedAt;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Integer getIsPublic() {
return isPublic;
}

public void setIsPublic(Integer isPublic) {
this.isPublic = isPublic;
}

public String getAvatarUrl() {
return avatarUrl;
}

public void setAvatarUrl(String avatarUrl) {
this.avatarUrl = avatarUrl;
}

public String getCoverPhotoUrl() {
return coverPhotoUrl;
}

public void setCoverPhotoUrl(String coverPhotoUrl) {
this.coverPhotoUrl = coverPhotoUrl;
}

public Object getDateOfBirth() {
return dateOfBirth;
}

public void setDateOfBirth(Object dateOfBirth) {
this.dateOfBirth = dateOfBirth;
}

public String getPhone() {
return phone;
}

public void setPhone(String phone) {
this.phone = phone;
}

public String getQualification() {
return qualification;
}

public void setQualification(String qualification) {
this.qualification = qualification;
}

public String getExperience() {
return experience;
}

public void setExperience(String experience) {
this.experience = experience;
}

public List<String> getSkills() {
return skills;
}

public void setSkills(List<String> skills) {
this.skills = skills;
}

public Object getBusinessNumber() {
return businessNumber;
}

public void setBusinessNumber(Object businessNumber) {
this.businessNumber = businessNumber;
}

public String getCoverLetter() {
return coverLetter;
}

public void setCoverLetter(String coverLetter) {
this.coverLetter = coverLetter;
}

public Object getJobTitle() {
return jobTitle;
}

public void setJobTitle(Object jobTitle) {
this.jobTitle = jobTitle;
}

public Object getCompanyName() {
return companyName;
}

public void setCompanyName(Object companyName) {
this.companyName = companyName;
}

public Object getCompanySize() {
return companySize;
}

public void setCompanySize(Object companySize) {
this.companySize = companySize;
}

public Object getBusinessType() {
return businessType;
}

public void setBusinessType(Object businessType) {
this.businessType = businessType;
}

public Object getCompanyRegistrationNumber() {
return companyRegistrationNumber;
}

public void setCompanyRegistrationNumber(Object companyRegistrationNumber) {
this.companyRegistrationNumber = companyRegistrationNumber;
}

public String getLocation() {
return location;
}

public void setLocation(String location) {
this.location = location;
}

public String getCountry() {
return country;
}

public void setCountry(String country) {
this.country = country;
}

public String getCreatedAt() {
return createdAt;
}

public void setCreatedAt(String createdAt) {
this.createdAt = createdAt;
}

public String getUpdatedAt() {
return updatedAt;
}

public void setUpdatedAt(String updatedAt) {
this.updatedAt = updatedAt;
}

}