package com.p2082ss.android.ugc.aweme.feed.p2968t;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.cache.C49319g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.C80444fq;
import com.p2082ss.android.ugc.aweme.utils.EnumC80443fp;
import com.p2082ss.android.ugc.aweme.video.C80662ac;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import java.util.Collection;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.t.e */
public final class C49936e implements AbstractC49934c<FeedItemList> {

    /* renamed from: a */
    FeedItemList f115108a;

    /* renamed from: b */
    volatile boolean f115109b;

    /* renamed from: c */
    private volatile C1731i f115110c;

    /* renamed from: d */
    private volatile boolean f115111d;

    static {
        Covode.recordClassIndex(59047);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: c */
    public final void mo84985c() {
        this.f115109b = true;
    }

    /* renamed from: f */
    private void m93772f() {
        this.f115110c = null;
        this.f115108a = null;
    }

    /* renamed from: d */
    public static boolean m93770d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public FeedItemList mo84983b() {
        System.currentTimeMillis();
        FeedItemList feedItemList = this.f115108a;
        if (feedItemList != null) {
            m93772f();
            return feedItemList;
        } else if (this.f115110c == null) {
            return null;
        } else {
            if (!this.f115110c.mo5535a()) {
                try {
                    this.f115110c.mo5547f();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (this.f115110c.mo5544c()) {
                    this.f115110c.mo5546e().printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            FeedItemList feedItemList2 = this.f115108a;
            m93772f();
            return feedItemList2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: a */
    public final void mo84981a() {
        MethodCollector.m26663i(7152);
        if (!this.f115111d) {
            synchronized (this) {
                try {
                    if (!this.f115111d) {
                        this.f115111d = true;
                        this.f115110c = C1731i.m5640b(new CallableC49942h(this), C40780g.m82241a());
                    }
                } finally {
                    MethodCollector.m26664o(7152);
                }
            }
            return;
        }
        MethodCollector.m26664o(7152);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: a */
    public final /* synthetic */ void mo84982a(FeedItemList feedItemList) {
        m93772f();
        this.f115109b = false;
        this.f115111d = false;
        this.f115111d = true;
        this.f115108a = feedItemList;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: b */
    public final /* synthetic */ void mo84984b(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        FeedItemList feedItemList3 = this.f115108a;
        if (feedItemList3 != null) {
            List<Aweme> items = feedItemList3.getItems();
            if (items == null || items.size() <= 0) {
                this.f115108a = feedItemList2;
                return;
            }
            Aweme aweme = items.get(0);
            items.clear();
            items.add(aweme);
            for (Aweme aweme2 : feedItemList2.getItems()) {
                if (!aweme2.getDesc().equals(aweme.getDesc())) {
                    items.add(aweme2);
                }
            }
            return;
        }
        this.f115108a = feedItemList2;
    }

    /* renamed from: a */
    public static void m93769a(FeedItemList feedItemList, int i) {
        Aweme aweme;
        if (feedItemList != null && !C13603b.m24435a((Collection) feedItemList.getItems()) && C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.FEED_FIRST_VIDEO_PRELOAD)) {
            feedItemList.getItems().size();
            C80662ac.m139885a(feedItemList.getItems());
            if (C80444fq.C80445a.f180026a.mo123743a(EnumC80443fp.PLAYER_FIRST_VIDEO_PREPARED) && (aweme = feedItemList.getItems().get(0)) != null && aweme.getVideo() != null) {
                if (i == 4) {
                    aweme.getAid();
                    aweme.getDesc();
                    C81079v.m140776O().mo123936a(aweme);
                } else if (C49319g.m92398a()) {
                    C81079v.m140776O().mo123944b(aweme);
                }
            }
        }
    }
}
