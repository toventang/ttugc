package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeRiskModel */
public class AwemeRiskModel implements Serializable {
    @AbstractC27891c(mo46611a = "content")
    public String content;
    @AbstractC27891c(mo46611a = "notice")
    public boolean notice;
    @AbstractC27891c(mo46611a = "risk_sink")
    public boolean riskSink;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;
    @AbstractC27891c(mo46611a = "url")
    public String url;
    @AbstractC27891c(mo46611a = "warn")
    public boolean warn;

    static {
        Covode.recordClassIndex(58634);
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isNotice() {
        return this.notice;
    }

    public boolean isRiskSink() {
        return this.riskSink;
    }

    public boolean isWarn() {
        return this.warn;
    }

    public String getContent() {
        if (TextUtils.isEmpty(this.content)) {
            return "";
        }
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setNotice(boolean z) {
        this.notice = z;
    }

    public void setRiskSink(boolean z) {
        this.riskSink = z;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWarn(boolean z) {
        this.warn = z;
    }
}
