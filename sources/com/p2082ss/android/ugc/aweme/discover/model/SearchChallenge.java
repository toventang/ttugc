package com.p2082ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38228an;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.utils.StringJsonAdapterFactory;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchChallenge */
public class SearchChallenge implements Serializable {
    @AbstractC27890b(mo46609a = StringJsonAdapterFactory.class)
    @AbstractC27891c(mo46611a = "ad_data")
    C38228an adData;
    @AbstractC27891c(mo46611a = "items")
    List<Aweme> awemes;
    @AbstractC27891c(mo46611a = "challenge_info")
    Challenge challenge;
    public LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = "position")
    List<Position> position;
    private String requestId;

    static {
        Covode.recordClassIndex(50476);
    }

    public C38228an getAdData() {
        return this.adData;
    }

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public Challenge getChallenge() {
        return this.challenge;
    }

    public List<Position> getPosition() {
        return this.position;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public boolean hasAwemeList() {
        List<Aweme> list = this.awemes;
        if (list == null || list.size() < 3) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.challenge.getCid().hashCode();
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        Challenge challenge2 = this.challenge;
        if (challenge2 != null) {
            challenge2.setRequestId(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchChallenge)) {
            return false;
        }
        return TextUtils.equals(this.challenge.getCid(), ((SearchChallenge) obj).challenge.getCid());
    }
}
