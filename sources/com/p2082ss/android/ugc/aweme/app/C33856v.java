package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34571b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.app.v */
public class C33856v implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public long f80142a;

    /* renamed from: b */
    private AbstractC53430a f80143b;

    /* renamed from: c */
    private C33594aj<Long> f80144c;

    /* renamed from: d */
    private volatile long f80145d;

    static {
        Covode.recordClassIndex(40769);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(151, new RunnableC90250g(C33856v.class, "onQueryUserFinishedEvent", C34571b.class, ThreadMode.POSTING, 0, true));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.app.v$a */
    public static class C33858a {

        /* renamed from: a */
        public static C33856v f80147a = new C33856v((byte) 0);

        static {
            Covode.recordClassIndex(40771);
        }
    }

    /* renamed from: a */
    public final long mo60114a() {
        return Math.max(0L, this.f80145d);
    }

    private C33856v() {
        this.f80143b = new AbstractC53430a() {
            /* class com.p2082ss.android.ugc.aweme.app.C33856v.C338571 */

            static {
                Covode.recordClassIndex(40770);
            }

            @Override // com.p2082ss.android.ugc.aweme.p3060i.p3061a.AbstractC53430a
            /* renamed from: a */
            public final C33594aj<Long> mo60117a() {
                return SharePrefCache.inst().getLastFeedTime();
            }
        };
        C33594aj<Long> lastFeedCount = SharePrefCache.inst().getLastFeedCount();
        this.f80144c = lastFeedCount;
        this.f80145d = lastFeedCount.mo59941c().longValue();
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f80142a = SharePrefCache.inst().getLastFeedTime().mo59941c().longValue();
    }

    /* synthetic */ C33856v(byte b) {
        this();
    }

    /* renamed from: a */
    private void m69293a(long j) {
        this.f80145d = j;
        this.f80144c.mo59940b(Long.valueOf(this.f80145d));
    }

    @AbstractC90264r(mo145423b = true)
    public void onQueryUserFinishedEvent(C34571b bVar) {
        AwemeService.m70060b().mo60682a(0);
        m69293a(-1);
    }

    /* renamed from: a */
    public final void mo60115a(FeedItemList feedItemList) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f80143b.mo90000b(currentTimeMillis)) {
                m69293a(-1);
            }
            m69293a(this.f80145d + 1);
            this.f80143b.mo89999a(currentTimeMillis);
            long j = this.f80145d;
            if (!(feedItemList == null || feedItemList.getItems() == null)) {
                for (Aweme aweme : feedItemList.getItems()) {
                    aweme.setFeedCount(j);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
