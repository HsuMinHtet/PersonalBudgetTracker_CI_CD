package edu.miu.cs489.hsumin.personalbudgettracker.util;

import edu.miu.cs489.hsumin.personalbudgettracker.model.AuditData;

import java.time.LocalDateTime;

public class AuditDataCreate {
    static AuditData auditData = new AuditData();
    public static AuditData populateAuditData(String loggedInUser) {
        LocalDateTime now = LocalDateTime.now();
        auditData.setCreatedBy(loggedInUser);
        auditData.setCreatedOn(now);
        auditData.setUpdatedBy(null);
        auditData.setUpdatedOn(null);
        return auditData;
    }
}