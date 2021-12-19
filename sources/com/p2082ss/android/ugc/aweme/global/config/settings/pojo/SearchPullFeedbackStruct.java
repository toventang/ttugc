package com.p2082ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.SearchPullFeedbackStruct */
public class SearchPullFeedbackStruct {
    @AbstractC27891c(mo46611a = "feedback_options")
    private SearchPullFeedbackOptions feedbackOptions;
    @AbstractC27891c(mo46611a = "freq_per_day")
    private Integer freqPerDay = 1000;
    @AbstractC27891c(mo46611a = "freq_per_query")
    private Integer freqPerQuery = 2;
    @AbstractC27891c(mo46611a = "is_open_feedback")
    private Boolean isOpenFeedback = false;

    static {
        Covode.recordClassIndex(62388);
    }

    public SearchPullFeedbackOptions getFeedbackOptions() {
        SearchPullFeedbackOptions searchPullFeedbackOptions = this.feedbackOptions;
        if (searchPullFeedbackOptions != null) {
            return searchPullFeedbackOptions;
        }
        throw new C16041a();
    }

    public Integer getFreqPerDay() {
        Integer num = this.freqPerDay;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Integer getFreqPerQuery() {
        Integer num = this.freqPerQuery;
        if (num != null) {
            return num;
        }
        throw new C16041a();
    }

    public Boolean getIsOpenFeedback() {
        Boolean bool = this.isOpenFeedback;
        if (bool != null) {
            return bool;
        }
        throw new C16041a();
    }
}
