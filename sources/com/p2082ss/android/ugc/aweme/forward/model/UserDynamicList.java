package com.p2082ss.android.ugc.aweme.forward.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.utils.C80582ip;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.UserDynamicList */
public class UserDynamicList extends BaseResponse implements AbstractC33623d {
    @AbstractC27891c(mo46611a = "dongtai_list")
    private List<C51415a> dynamicList;
    @AbstractC27891c(mo46611a = "has_more")
    private int hasMore;
    @AbstractC27891c(mo46611a = "max_cursor")
    private long maxCursor;
    @AbstractC27891c(mo46611a = "min_cursor")
    private long minCursor;
    String requestId;

    static {
        Covode.recordClassIndex(60633);
    }

    public List<C51415a> getDynamicList() {
        return this.dynamicList;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public String getRequestId() {
        return this.requestId;
    }

    public void setDynamicList(List<C51415a> list) {
        this.dynamicList = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d
    public void setRequestId(String str) {
        this.requestId = str;
        if (!C80582ip.m139712a(this.dynamicList)) {
            for (C51415a aVar : this.dynamicList) {
                if (aVar != null) {
                    aVar.setRequestId(str);
                }
            }
        }
    }
}
