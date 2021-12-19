package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p210a.AbstractC3838b;
import com.bytedance.android.live.core.p218f.C3963v;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.feed.AbstractC8586e;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.p4591l.C88958b;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.d */
public final class C8524d implements AbstractC8593h {

    /* renamed from: a */
    Map<FeedDataKey, C8525a> f21072a = new ConcurrentHashMap();

    /* renamed from: b */
    C88958b<Boolean> f21073b = C88958b.m154214a((Object) false);

    /* renamed from: c */
    C88960c<FeedDataKey> f21074c = new C88960c<>();

    /* renamed from: d */
    C88960c<Boolean> f21075d = new C88960c<>();

    /* renamed from: e */
    private AbstractC3838b<FeedDataKey, FeedItem> f21076e;

    /* renamed from: f */
    private List<AbstractC8586e> f21077f = new LinkedList();

    /* renamed from: g */
    private List<AbstractC8593h.AbstractC8594a> f21078g = new C3963v();

    /* renamed from: h */
    private boolean f21079h;

    static {
        Covode.recordClassIndex(9378);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final void mo14829a() {
        if (!this.f21079h) {
            this.f21079h = true;
            this.f21073b.onNext(true);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.d$a */
    static class C8525a {

        /* renamed from: a */
        public AbstractC8656r f21080a;

        /* renamed from: b */
        public int f21081b;

        static {
            Covode.recordClassIndex(9379);
        }

        private C8525a(AbstractC8656r rVar) {
            this.f21080a = rVar;
        }

        /* synthetic */ C8525a(AbstractC8656r rVar, byte b) {
            this(rVar);
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final void mo14832a(AbstractC8586e eVar) {
        this.f21077f.add(eVar);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: b */
    public final void mo14837b(AbstractC8586e eVar) {
        this.f21077f.remove(eVar);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final void mo14833a(AbstractC8593h.AbstractC8594a aVar) {
        this.f21078g.add(aVar);
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: b */
    public final void mo14838b(AbstractC8593h.AbstractC8594a aVar) {
        this.f21078g.remove(aVar);
    }

    public C8524d(AbstractC3838b<FeedDataKey, FeedItem> bVar) {
        this.f21076e = bVar;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final boolean mo14835a(FeedDataKey feedDataKey) {
        if (feedDataKey == null) {
            return false;
        }
        C8525a aVar = this.f21072a.get(feedDataKey);
        if (aVar != null) {
            aVar.f21081b--;
            if (aVar.f21081b <= 0) {
                this.f21072a.remove(feedDataKey);
            }
            if (aVar.f21081b == 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8632j
    /* renamed from: b */
    public final FeedItem mo14836b(FeedDataKey feedDataKey, String str) {
        C8525a aVar = this.f21072a.get(feedDataKey);
        if (aVar != null) {
            return aVar.f21080a.mo14955d(str);
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final void mo14830a(FeedDataKey feedDataKey, AbstractC8656r rVar) {
        if (feedDataKey != null) {
            C8525a aVar = this.f21072a.get(feedDataKey);
            if (aVar == null) {
                aVar = new C8525a(rVar, (byte) 0);
                this.f21072a.put(feedDataKey, aVar);
                this.f21074c.onNext(feedDataKey);
            }
            if (aVar.f21080a != rVar) {
                aVar.f21080a = rVar;
            }
            aVar.f21081b++;
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final void mo14831a(FeedDataKey feedDataKey, String str) {
        C8525a aVar = this.f21072a.get(feedDataKey);
        if (aVar != null) {
            aVar.f21080a.mo14954c(str);
        }
        for (AbstractC8593h.AbstractC8594a aVar2 : this.f21078g) {
            if (aVar2 != null) {
                aVar2.mo14897a();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.feed.AbstractC8593h
    /* renamed from: a */
    public final void mo14834a(String str, List<FeedItem> list, C2965a aVar, boolean z) {
        if (C13617h.m24466b(this.f21077f)) {
            for (AbstractC8586e eVar : this.f21077f) {
                eVar.mo14892a(str, list, aVar, z);
            }
        }
    }
}
