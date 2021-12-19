package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchSurveyConfig */
public final class SearchSurveyConfig implements Serializable {
    @AbstractC27891c(mo46611a = "enabled")
    private boolean enabled;
    @AbstractC27891c(mo46611a = "show_delay")
    private long showDelay = 5;
    @AbstractC27891c(mo46611a = "show_duration")
    private long showDuration = 5;
    @AbstractC27891c(mo46611a = "result_delay")
    private long submitResultDelay = 2;
    @AbstractC27891c(mo46611a = "survey_id")
    private String surveyId;

    static {
        Covode.recordClassIndex(50524);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final long getShowDelay() {
        return this.showDelay;
    }

    public final long getShowDuration() {
        return this.showDuration;
    }

    public final long getSubmitResultDelay() {
        return this.submitResultDelay;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setShowDelay(long j) {
        this.showDelay = j;
    }

    public final void setShowDuration(long j) {
        this.showDuration = j;
    }

    public final void setSubmitResultDelay(long j) {
        this.submitResultDelay = j;
    }

    public final void setSurveyId(String str) {
        this.surveyId = str;
    }
}
