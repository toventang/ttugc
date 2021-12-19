package com.p2082ss.android.ugc.aweme.profile.experiment;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.profile.experiment.BioLinkReportConfig */
public final class BioLinkReportConfig {
    @AbstractC27891c(mo46611a = "is_bio_link_report_show")
    private boolean isBioLinkReportShow = true;
    @AbstractC27891c(mo46611a = "show_report_jump_time")
    private int showReportJumpTime;

    static {
        Covode.recordClassIndex(75062);
    }

    public final int getShowReportJumpTime() {
        return this.showReportJumpTime;
    }

    public final boolean isBioLinkReportShow() {
        return this.isBioLinkReportShow;
    }

    public final void setBioLinkReportShow(boolean z) {
        this.isBioLinkReportShow = z;
    }

    public final void setShowReportJumpTime(int i) {
        this.showReportJumpTime = i;
    }
}
