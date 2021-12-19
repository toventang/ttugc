package com.p2082ss.android.ugc.aweme.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.model.AppWidgetStruct */
public final class AppWidgetStruct {
    @AbstractC27891c(mo46611a = "ch_info")
    private List<ChallengeStruct> challengeStructList;
    @AbstractC27891c(mo46611a = "cursor")
    private long cursor;
    @AbstractC27891c(mo46611a = "status_code")
    private int statusCode;
    @AbstractC27891c(mo46611a = "status_msg")
    private String statusMsg;

    static {
        Covode.recordClassIndex(70610);
    }

    public final List<ChallengeStruct> getChallengeStructList() {
        return this.challengeStructList;
    }

    public final long getCursor() {
        return this.cursor;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final void setChallengeStructList(List<ChallengeStruct> list) {
        this.challengeStructList = list;
    }

    public final void setCursor(long j) {
        this.cursor = j;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusMsg(String str) {
        this.statusMsg = str;
    }

    public AppWidgetStruct(int i, String str, long j, List<ChallengeStruct> list) {
        this.statusCode = i;
        this.statusMsg = str;
        this.cursor = j;
        this.challengeStructList = list;
    }
}
