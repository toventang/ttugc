package com.bytedance.android.live.p408u;

import android.view.View;
import androidx.core.p033d.C0649c;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.livesdk.livesetting.performance.LiveBannerWebviewOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFluencyOptSettingV2;
import com.bytedance.android.livesdk.livesetting.performance.LiveScrapFluencyOptSettingV2;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.u.h */
public final class C6204h implements FluencyOpt {

    /* renamed from: a */
    public static boolean f15478a = LiveBroadcastFluencyOptSettingV2.INSTANCE.enable();

    /* renamed from: b */
    public static boolean f15479b = LivePlayFluencyOptSettingV2.INSTANCE.enable();

    /* renamed from: c */
    public static final C6204h f15480c = new C6204h();

    private C6204h() {
    }

    /* renamed from: com.bytedance.android.live.u.h$a */
    static final class RunnableC6205a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f15481a;

        static {
            Covode.recordClassIndex(6911);
        }

        RunnableC6205a(AbstractC89171a aVar) {
            this.f15481a = aVar;
        }

        public final void run() {
            this.f15481a.invoke();
        }
    }

    /* renamed from: com.bytedance.android.live.u.h$b */
    public static final class RunnableC6206b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f15482a;

        static {
            Covode.recordClassIndex(6912);
        }

        public RunnableC6206b(AbstractC89171a aVar) {
            this.f15482a = aVar;
        }

        public final void run() {
            this.f15482a.invoke();
        }
    }

    /* renamed from: a */
    public static final void m13473a() {
        f15478a = LiveBroadcastFluencyOptSettingV2.INSTANCE.enable();
        f15479b = false;
    }

    /* renamed from: e */
    public static final int m13485e() {
        if (m13480b()) {
            return 20;
        }
        return 10;
    }

    static {
        Covode.recordClassIndex(6910);
    }

    /* renamed from: b */
    public static final boolean m13480b() {
        if (f15478a || f15479b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m13482c() {
        if (!LiveGiftFluencyOptSettingV2.INSTANCE.enable() || !m13480b()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m13484d() {
        if (!LiveBannerWebviewOptSettingV2.INSTANCE.enable() || !m13480b()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i) {
        return C2690b.m7789b(i);
    }

    /* renamed from: b */
    public static final void m13479b(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        C40780g.m82246c().submit(runnable);
    }

    /* renamed from: c */
    public static final void m13481c(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        m13475a(null, runnable, 3, 0);
    }

    /* renamed from: d */
    public static final void m13483d(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        m13475a(null, runnable, 1, 0);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
        C89219l.m154721d(obj, "");
        C3940j.m9594a().removeCallbacksAndMessages(obj);
    }

    /* renamed from: a */
    public static final void m13474a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        m13476a(new RunnableC6205a(aVar));
    }

    /* renamed from: a */
    public static final void m13476a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        f15480c.post(runnable, null);
    }

    /* renamed from: a */
    private static boolean m13478a(int i) {
        if (i == 0) {
            return m13480b();
        }
        if (i == 1) {
            return m13482c();
        }
        if (i == 2) {
            return m13484d();
        }
        if (i != 3) {
            return m13480b();
        }
        if (!LiveScrapFluencyOptSettingV2.INSTANCE.enable() || !C6203g.m13464a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
        C89219l.m154721d(runnable, "");
        m13475a(obj, runnable, 0, 0);
    }

    /* renamed from: a */
    public static final void m13477a(Runnable runnable, int i) {
        if (m13478a(i)) {
            C40780g.m82246c().submit(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static final void m13475a(Object obj, Runnable runnable, int i, long j) {
        if (m13478a(i)) {
            C0649c.m2386a(C3940j.m9594a(), runnable, obj, j);
        } else {
            runnable.run();
        }
    }
}
