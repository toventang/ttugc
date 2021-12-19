package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchLiveStruct */
public class SearchLiveStruct implements Serializable {
    @AbstractC27891c(mo46611a = "lives")
    Aweme liveAweme;
    LogPbBean logPbBean;
    @AbstractC27891c(mo46611a = StringSet.type)
    int type;

    static {
        Covode.recordClassIndex(50500);
    }

    public Aweme getLiveAweme() {
        return this.liveAweme;
    }

    public LogPbBean getLogPbBean() {
        return this.logPbBean;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.liveAweme.hashCode();
    }

    public void setLogPbBean(LogPbBean logPbBean2) {
        this.logPbBean = logPbBean2;
    }

    public void setType(int i) {
        this.type = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchLiveStruct searchLiveStruct = (SearchLiveStruct) obj;
        if (this.type != searchLiveStruct.type) {
            return false;
        }
        return this.liveAweme.equals(searchLiveStruct.liveAweme);
    }
}
