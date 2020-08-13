package com.shuaichen.entity;

public class Provider {
    private String providerId;//供应商编号
    private String providerName;//供应商名称
    private String contact;//联系人
    private String contactTelephone;//联系电话
    private String contactAddress;//联系地址
    private String fax;//传真
    private String description;//描述
    private String creationTime;//创建时间

    public Provider(String providerId, String providerName, String contact, String contactTelephone, String contactAddress, String fax, String description, String creationTime) {
        this.providerId = providerId;
        this.providerName = providerName;
        this.contact = contact;
        this.contactTelephone = contactTelephone;
        this.contactAddress = contactAddress;
        this.fax = fax;
        this.description = description;
        this.creationTime = creationTime;
    }

    public Provider() {
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactTelephone() {
        return contactTelephone;
    }

    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "providerId='" + providerId + '\'' +
                ", providerName='" + providerName + '\'' +
                ", contact='" + contact + '\'' +
                ", contactTelephone='" + contactTelephone + '\'' +
                ", contactAddress='" + contactAddress + '\'' +
                ", fax='" + fax + '\'' +
                ", description='" + description + '\'' +
                ", creationTime='" + creationTime + '\'' +
                '}';
    }
}