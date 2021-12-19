package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse */
public final class AwemeStatisticsResponse implements Serializable {
    @AbstractC27891c(mo46611a = "status_msg")
    private String message;
    @AbstractC27891c(mo46611a = "statistics_list")
    private List<AwemeStatisticsBackup> statisticsList;
    @AbstractC27891c(mo46611a = "status_code")
    private Integer status = 0;

    static {
        Covode.recordClassIndex(58640);
    }

    public final String getMessage() {
        return this.message;
    }

    public final List<AwemeStatisticsBackup> getStatisticsList() {
        return this.statisticsList;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final String toString() {
        return "AwemeStatisticsResponse(status=" + this.status + ", message=" + this.message + ", statisticsList=" + this.statisticsList + ')';
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setStatisticsList(List<AwemeStatisticsBackup> list) {
        this.statisticsList = list;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }
}
