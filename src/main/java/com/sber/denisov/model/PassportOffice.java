package com.sber.denisov.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PassportOffice {
    private long officeId;
    private String officeAreaId;
    private String officeName;

    @Autowired
    public PassportOffice(long officeId, String officeAreaId, String officeName) {
        this.officeId = officeId;
        this.officeAreaId = officeAreaId;
        this.officeName = officeName;
    }

    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    public String getOfficeAreaId() {
        return officeAreaId;
    }

    public void setOfficeAreaId(String officeAreaId) {
        this.officeAreaId = officeAreaId;
    }

    public String getOfficeName() {
        return officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassportOffice)) return false;
        PassportOffice that = (PassportOffice) o;
        return officeId == that.officeId &&
                Objects.equals(officeAreaId, that.officeAreaId) &&
                Objects.equals(officeName, that.officeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, officeAreaId, officeName);
    }

    @Override
    public String toString() {
        return "PassportOffice{" +
                "officeId=" + officeId +
                ", officeAreaId='" + officeAreaId + '\'' +
                ", officeName='" + officeName + '\'' +
                '}';
    }
}
