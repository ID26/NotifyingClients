package com.sber.denisov.model;

import java.time.LocalDate;
import java.util.Objects;

public class Passport {
    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;
    private PassportOffice issueDepartment;

    public Passport(String passportSeria, String passportNumber, LocalDate issueDate, PassportOffice issueDepartment) {
        this.passportSeria = passportSeria;
        this.passportNumber = passportNumber;
        this.issueDate = issueDate;
        this.issueDepartment = issueDepartment;
    }

    public Passport() {
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public PassportOffice getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(PassportOffice issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return Objects.equals(passportSeria, passport.passportSeria) &&
                Objects.equals(passportNumber, passport.passportNumber) &&
                Objects.equals(issueDate, passport.issueDate) &&
                Objects.equals(issueDepartment, passport.issueDepartment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportSeria, passportNumber, issueDate, issueDepartment);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportSeria='" + passportSeria + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", issueDate=" + issueDate +
                ", issueDepartment=" + issueDepartment +
                '}';
    }
}
