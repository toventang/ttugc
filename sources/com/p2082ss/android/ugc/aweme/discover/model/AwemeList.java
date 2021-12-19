package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.discover.model.AwemeList;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.AwemeList */
public class AwemeList<T extends AwemeList<T>> implements IAwemeList<T>, Serializable {
    @AbstractC27891c(mo46611a = "aweme_list")
    private List<Aweme> awemeList;
    @AbstractC27891c(mo46611a = "cursor")
    private int cursor;
    @AbstractC27891c(mo46611a = "has_more")
    private int hasMore;
    @AbstractC27891c(mo46611a = "status_code")
    private int statusCode;

    static {
        Covode.recordClassIndex(50421);
    }

    public final List<Aweme> getAwemeList() {
        return this.awemeList;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final int getHasMore() {
        return this.hasMore;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public List<Aweme> getIAwemeList() {
        return this.awemeList;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public int getICursor() {
        return this.cursor;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public int getIHasMore() {
        return this.hasMore;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public int getIStatusCode() {
        return this.statusCode;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final void setAwemeList(List<Aweme> list) {
        this.awemeList = list;
    }

    public final void setCursor(int i) {
        this.cursor = i;
    }

    public final void setHasMore(int i) {
        this.hasMore = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public void setICursor(int i) {
        this.cursor = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public void setIHasMore(int i) {
        this.hasMore = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public void setIStatusCode(int i) {
        this.statusCode = i;
    }

    public final void setStatusCode(int i) {
        this.statusCode = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.IAwemeList
    public void setIAwemeList(List<Aweme> list) {
        C89219l.m154721d(list, "");
        this.awemeList = list;
    }

    public void updateData(T t) {
        C89219l.m154721d(t, "");
        this.hasMore &= t.hasMore;
        this.cursor = t.cursor;
        this.statusCode = t.statusCode;
    }
}
