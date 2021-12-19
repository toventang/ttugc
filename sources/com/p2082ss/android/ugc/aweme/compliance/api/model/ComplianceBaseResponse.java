package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.ComplianceBaseResponse */
public class ComplianceBaseResponse implements Serializable {
    @AbstractC27891c(mo46611a = "log_pb")
    private final LogPbBean logPb;

    static {
        Covode.recordClassIndex(46882);
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }
}
