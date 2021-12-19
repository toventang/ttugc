package com.p2082ss.android.ugc.aweme.feed.p2968t;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.feed.t.i */
public final class C49943i implements AbstractC49934c<FeedItemList> {

    /* renamed from: a */
    volatile boolean f115126a;

    /* renamed from: b */
    private FeedItemList f115127b;

    /* renamed from: c */
    private volatile C1731i f115128c;

    /* renamed from: d */
    private volatile boolean f115129d;

    static {
        Covode.recordClassIndex(59054);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo84984b(FeedItemList feedItemList) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: c */
    public final void mo84985c() {
        this.f115126a = true;
    }

    /* renamed from: g */
    private void m93782g() {
        this.f115128c = null;
        this.f115127b = null;
    }

    /* renamed from: d */
    public static boolean m93779d() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public FeedItemList mo84983b() {
        FeedItemList feedItemList = this.f115127b;
        if (feedItemList != null) {
            m93782g();
            return feedItemList;
        } else if (this.f115128c == null) {
            return null;
        } else {
            if (!this.f115128c.mo5535a()) {
                try {
                    this.f115128c.mo5547f();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                if (this.f115128c.mo5544c()) {
                    this.f115128c.mo5546e().printStackTrace();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            FeedItemList feedItemList2 = this.f115127b;
            m93782g();
            return feedItemList2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: a */
    public final void mo84981a() {
        MethodCollector.m26663i(6986);
        if (!this.f115129d) {
            synchronized (this) {
                try {
                    if (!this.f115129d) {
                        this.f115129d = true;
                        this.f115128c = C1731i.m5640b(new CallableC49945k(this), C40780g.m82241a());
                    }
                } finally {
                    MethodCollector.m26664o(6986);
                }
            }
            return;
        }
        MethodCollector.m26664o(6986);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2968t.AbstractC49934c
    /* renamed from: a */
    public final /* synthetic */ void mo84982a(FeedItemList feedItemList) {
        m93782g();
        this.f115126a = false;
        this.f115129d = false;
        this.f115129d = true;
        this.f115127b = feedItemList;
    }
}
