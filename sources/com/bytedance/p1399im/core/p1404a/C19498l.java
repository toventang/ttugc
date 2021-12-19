package com.bytedance.p1399im.core.p1404a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.bytedance.im.core.a.l */
public class C19498l implements Serializable {
    @AbstractC27891c(mo46611a = "enable")
    public int enable;
    @AbstractC27891c(mo46611a = "report_duration_days")
    public int reportDurationDays = 1;

    static {
        Covode.recordClassIndex(22342);
    }

    public String toString() {
        return "ReportDBInfoConfig{enable:" + this.enable + ", reportDurationDays:" + this.reportDurationDays + "}";
    }
}
