package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.http.C14612a;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33617c;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33632h;
import com.p2082ss.android.ugc.aweme.app.api.C33633i;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TrendingTopicList */
public final class TrendingTopicList extends BaseResponse implements AbstractC33617c, AbstractC33631g, LazyParseTask<TrendingTopicList> {
    @AbstractC27891c(mo46611a = "cursor")
    public final int cursor;
    @AbstractC27891c(mo46611a = "device_type")
    public final int deviceType;
    @AbstractC27891c(mo46611a = "has_more")
    public final int hasMore;
    @AbstractC27891c(mo46611a = "category_list")
    public List<TrendingTopic> items;
    public transient String jsonRawData;
    private transient Callable<TrendingTopicList> lazyParseCallable;
    private C14612a<?> requestInfo;

    static {
        Covode.recordClassIndex(50535);
    }

    public TrendingTopicList() {
        this(0, null, 0, 0, null, 31, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C33633i getRequestLog() {
        return AbstractC33632h.m68862a(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.LazyParseTask
    public final Callable<TrendingTopicList> getLazyParseCallable() {
        return this.lazyParseCallable;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final C14612a<?> getRequestInfo() {
        return this.requestInfo;
    }

    public final boolean doesHaveMore() {
        if (this.hasMore == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33617c
    public final void setJsonData(String str) {
        this.jsonRawData = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.model.LazyParseTask
    public final void setLazyParseCallable(Callable<TrendingTopicList> callable) {
        this.lazyParseCallable = callable;
    }

    public final void setItems(List<TrendingTopic> list) {
        C89219l.m154721d(list, "");
        this.items = list;
    }

    @Override // com.p2082ss.android.ugc.aweme.app.api.AbstractC33631g
    public final void setRequestInfo(C14612a<?> aVar) {
        if (aVar != null) {
            this.requestInfo = aVar;
        }
    }

    public TrendingTopicList(int i, List<TrendingTopic> list, int i2, int i3, C14612a<?> aVar) {
        C89219l.m154721d(list, "");
        this.deviceType = i;
        this.items = list;
        this.hasMore = i2;
        this.cursor = i3;
        this.requestInfo = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrendingTopicList(int i, List list, int i2, int i3, C14612a aVar, int i4, C89214g gVar) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? C89086z.INSTANCE : list, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) == 0 ? i3 : 0, (i4 & 16) != 0 ? null : aVar);
    }
}
