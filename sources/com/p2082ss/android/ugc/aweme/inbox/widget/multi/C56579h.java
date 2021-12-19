package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageData;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.h */
public final class C56579h extends AbstractC39100a<FollowPageData, FollowPageResponse> {

    /* renamed from: e */
    public static final C56580a f129003e = new C56580a((byte) 0);

    /* renamed from: a */
    public final boolean f129004a = C56323c.m102322i();

    /* renamed from: b */
    public long f129005b;

    /* renamed from: c */
    public long f129006c;

    /* renamed from: d */
    public long f129007d;

    /* renamed from: f */
    private boolean f129008f;

    /* renamed from: g */
    private long f129009g;

    /* renamed from: h */
    private int f129010h;

    /* renamed from: i */
    private List<FollowPageData> f129011i = new ArrayList();

    static {
        Covode.recordClassIndex(66402);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final boolean checkParams(Object... objArr) {
        C89219l.m154721d(objArr, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.h$a */
    public static final class C56580a {
        static {
            Covode.recordClassIndex(66403);
        }

        private C56580a() {
        }

        public /* synthetic */ C56580a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final List<FollowPageData> getItems() {
        return this.f129011i;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final boolean isHasMore() {
        return this.f129008f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.h$b */
    public static final class CallableC56581b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C56579h f129012a;

        static {
            Covode.recordClassIndex(66404);
        }

        CallableC56581b(C56579h hVar) {
            this.f129012a = hVar;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            return MultiApiManager.m102308a().fetchFollowPageData(this.f129012a.f129004a, 1, 20, this.f129012a.f129005b, this.f129012a.f129006c, this.f129012a.f129007d).mo143273a();
        }
    }

    /* renamed from: a */
    private final void m102552a() {
        C34608n.m70658a().mo61083a(this.mHandler, new CallableC56581b(this), 1001);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void loadMoreList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        m102552a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a
    public final void refreshList(Object... objArr) {
        C89219l.m154721d(objArr, "");
        this.f129006c = 0;
        this.f129005b = 0;
        this.f129007d = 0;
        m102552a();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.AbstractC39085b
    public final /* synthetic */ void handleData(Object obj) {
        FollowPageResponse followPageResponse = (FollowPageResponse) obj;
        super.handleData(followPageResponse);
        if (followPageResponse != null) {
            this.f129005b = followPageResponse.getNoticeMaxTime();
            this.f129006c = followPageResponse.getNoticeMinTime();
            this.f129007d = followPageResponse.getFollowReqOffset();
            this.f129009g = followPageResponse.getNoticeLastReadTime();
            this.f129010h = followPageResponse.getTotal();
            this.f129008f = followPageResponse.getHasMore();
            if (this.mListQueryType == 1) {
                this.f129011i.clear();
            }
            List<FollowPageData> data = followPageResponse.getData();
            if (data != null) {
                this.f129011i.addAll(data);
            }
        }
    }
}
