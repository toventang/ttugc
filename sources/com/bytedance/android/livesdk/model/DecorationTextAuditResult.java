package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

public class DecorationTextAuditResult {
    @AbstractC27891c(mo46611a = "audit_nopass_warn")
    private String auditNotPassWarnText;
    @AbstractC27891c(mo46611a = "audit_status")
    private int auditStatus;

    static {
        Covode.recordClassIndex(11028);
    }

    public String getAuditNotPassWarnText() {
        return this.auditNotPassWarnText;
    }

    public int getAuditStatus() {
        return this.auditStatus;
    }

    public void setAuditNotPassWarnText(String str) {
        this.auditNotPassWarnText = str;
    }

    public void setAuditStatus(int i) {
        this.auditStatus = i;
    }
}
