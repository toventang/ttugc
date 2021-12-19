package com.bytedance.android.livesdk.feed.p523a;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.core.p036g.C0692e;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.p223g.AbstractC3968a;
import com.bytedance.android.live.core.paging.p224a.AbstractC3971b;
import com.bytedance.android.live.core.paging.p224a.C3970a;
import com.bytedance.android.live.core.performance.C4017b;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.livesetting.feed.I18nZhibozhongAnimationTagSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.util.rxutils.C11195i;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.a.a */
public abstract class AbstractC8472a extends AbstractC3971b<FeedItem> {

    /* renamed from: j */
    public Handler f20943j;

    /* renamed from: k */
    FeedDataKey f20944k;

    /* renamed from: l */
    public Map<String, Long> f20945l;

    /* renamed from: m */
    Map<String, Long> f20946m;

    /* renamed from: n */
    public Map<String, Long> f20947n;

    /* renamed from: o */
    C88960c<C0692e<FeedItem, Long>> f20948o;

    /* renamed from: p */
    C88960c<FeedItem> f20949p;

    /* renamed from: q */
    public C88960c<Object> f20950q;

    /* renamed from: r */
    public C88960c<Object> f20951r;

    /* renamed from: s */
    public C88960c<Boolean> f20952s;

    /* renamed from: t */
    C88960c<Object> f20953t;

    /* renamed from: u */
    public boolean f20954u;

    /* renamed from: v */
    public Map<Integer, AbstractC3968a> f20955v;

    /* renamed from: w */
    public Object[] f20956w;

    /* renamed from: x */
    public boolean f20957x;

    /* renamed from: y */
    public boolean f20958y;

    /* renamed from: z */
    private AbstractC8593h f20959z;

    static {
        Covode.recordClassIndex(9325);
    }

    /* renamed from: c */
    public int mo14807c(int i) {
        return -8888;
    }

    /* renamed from: com.bytedance.android.livesdk.feed.a.a$a */
    static class C8473a extends C1445j.AbstractC1451e<FeedItem> {
        static {
            Covode.recordClassIndex(9326);
        }

        private C8473a() {
        }

        /* synthetic */ C8473a(byte b) {
            this();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo4953a(FeedItem feedItem, FeedItem feedItem2) {
            FeedItem feedItem3 = feedItem;
            if (feedItem3.type == feedItem2.type && feedItem3.type == 1003) {
                return true;
            }
            return false;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.C1445j.AbstractC1451e
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ boolean mo4954b(FeedItem feedItem, FeedItem feedItem2) {
            FeedItem feedItem3 = feedItem;
            if (feedItem3.type == feedItem2.type && feedItem3.type == 1003) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: c */
    public final void mo14808c() {
        mo14805a(this.f20945l, false);
    }

    /* renamed from: b */
    public final void mo14806b() {
        this.f20943j.removeCallbacksAndMessages(null);
        if (I18nZhibozhongAnimationTagSetting.INSTANCE.getValue()) {
            this.f20953t.onNext(C11195i.f26825c);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: a */
    public final /* synthetic */ int mo9330a(FeedItem feedItem) {
        FeedItem feedItem2 = feedItem;
        if (feedItem2 == null) {
            return -8888;
        }
        return mo14807c(feedItem2.type);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        FeedItem feedItem;
        super.onViewDetachedFromWindow(viewHolder);
        int b = mo9338b(viewHolder.getAdapterPosition());
        if (b >= 0 && b < mo9338b(getItemCount()) && (feedItem = (FeedItem) mo3758a(b)) != null && feedItem.item != null) {
            String mixId = feedItem.item.getMixId();
            if (this.f20945l.get(mixId) != null) {
                long longValue = this.f20945l.get(mixId).longValue();
                Long l = this.f20946m.get(mixId);
                if (l == null) {
                    l = 0L;
                }
                this.f20946m.put(mixId, Long.valueOf(l.longValue() + ((System.nanoTime() / 1000000) - longValue)));
                this.f20945l.remove(mixId);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        FeedItem feedItem;
        super.onViewAttachedToWindow(viewHolder);
        if (!this.f20954u) {
            int b = mo9338b(viewHolder.getAdapterPosition());
            if (b >= 0 && b < mo9338b(getItemCount()) && (feedItem = (FeedItem) mo3758a(b)) != null && feedItem.item != null) {
                String mixId = feedItem.item.getMixId();
                if (this.f20958y) {
                    if (!this.f20957x) {
                        C6501b.C6502a.m13948a("livesdk_explore_page_show").mo12639a().mo12651a("show_type", "normal").mo12645a("has_banner", C2695a.f8059g.mo7220c()).mo12655b();
                        this.f20957x = true;
                    }
                    if (this.f20945l.get(mixId) == null) {
                        this.f20945l.put(mixId, Long.valueOf(System.nanoTime() / 1000000));
                    }
                } else {
                    if (this.f20947n == null) {
                        this.f20947n = new HashMap();
                    }
                    this.f20947n.put(mixId, -1L);
                }
            }
            C4017b.m9795a(C4017b.EnumC4018a.LiveFeedInit, C4017b.m9793a("viewholder", viewHolder.getClass().toString()));
        }
    }

    public AbstractC8472a(Map<Integer, AbstractC3968a> map, AbstractC8593h hVar) {
        this(new C8473a((byte) 0), map, hVar);
    }

    @Override // com.bytedance.android.live.core.paging.p224a.AbstractC3971b
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo9340b(ViewGroup viewGroup, int i) {
        AbstractC3968a aVar = this.f20955v.get(Integer.valueOf(i));
        if (aVar == null) {
            return new C3970a(viewGroup);
        }
        return aVar.mo9317a(viewGroup, this.f20956w);
    }

    /* renamed from: a */
    private void m16686a(String str, long j) {
        FeedItem b;
        if (j > 0 && j >= 50 && (b = this.f20959z.mo14836b(this.f20944k, str)) != null) {
            this.f20948o.onNext(new C0692e<>(b, Long.valueOf(j)));
        }
    }

    /* renamed from: a */
    public final void mo14805a(Map<String, Long> map, boolean z) {
        if (!(map == null || map.size() == 0)) {
            for (Map.Entry<String, Long> entry : map.entrySet()) {
                String key = entry.getKey();
                long longValue = entry.getValue().longValue();
                if (!z && longValue > 0) {
                    longValue = (System.nanoTime() / 1000000) - longValue;
                }
                m16686a(key, longValue);
            }
            map.clear();
        }
    }

    private AbstractC8472a(C1445j.AbstractC1451e<FeedItem> eVar, Map<Integer, AbstractC3968a> map, AbstractC8593h hVar) {
        super(eVar);
        this.f20943j = new Handler(Looper.getMainLooper());
        this.f20948o = new C88960c<>();
        this.f20949p = new C88960c<>();
        this.f20950q = new C88960c<>();
        this.f20951r = new C88960c<>();
        this.f20952s = new C88960c<>();
        this.f20953t = new C88960c<>();
        this.f20958y = true;
        this.f20955v = map;
        this.f20959z = hVar;
        this.f20945l = new HashMap();
        this.f20946m = new HashMap();
        this.f20949p.mo143254a(new C8474b(this), C8475c.f20961a);
    }
}
