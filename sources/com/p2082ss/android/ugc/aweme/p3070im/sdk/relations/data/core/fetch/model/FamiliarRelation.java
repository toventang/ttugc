package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarRelation */
public class FamiliarRelation implements Serializable {
    @AbstractC27891c(mo46611a = "created_time_list")
    private List<Long> createdTimes;
    @AbstractC27891c(mo46611a = "has_more")
    private int hasMore;
    @AbstractC27891c(mo46611a = "next_cursor")
    private int nextCursor;
    @AbstractC27891c(mo46611a = "relation_type")
    private int relationType;
    @AbstractC27891c(mo46611a = "sec_user_ids")
    private List<String> secUserIds;

    static {
        Covode.recordClassIndex(65629);
    }

    public List<Long> getCreatedTimes() {
        return this.createdTimes;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public int getNextCursor() {
        return this.nextCursor;
    }

    public int getRelationType() {
        return this.relationType;
    }

    public List<String> getSecUserIds() {
        return this.secUserIds;
    }

    public void setCreatedTimes(List<Long> list) {
        this.createdTimes = list;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setNextCursor(int i) {
        this.nextCursor = i;
    }

    public void setRelationType(int i) {
        this.relationType = i;
    }

    public void setSecUserIds(List<String> list) {
        this.secUserIds = list;
    }
}
