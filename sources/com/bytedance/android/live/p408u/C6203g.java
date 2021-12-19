package com.bytedance.android.live.p408u;

import android.view.View;
import androidx.core.p033d.C0649c;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.core.p218f.C3940j;
import com.bytedance.android.livesdk.livesetting.performance.LiveBannerWebviewOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableX2cSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveScrapFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveSlotFluencyOptSetting;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.u.g */
public final class C6203g implements FluencyOpt {

    /* renamed from: a */
    public static final C6203g f15476a = new C6203g();

    /* renamed from: b */
    private static final Object f15477b = new Object();

    private C6203g() {
    }

    static {
        Covode.recordClassIndex(6909);
    }

    /* renamed from: c */
    public static final boolean m13470c() {
        if (!LiveEnableX2cSetting.INSTANCE.enable() || !m13464a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m13468b() {
        if (!LiveGiftFluencyOptSetting.INSTANCE.enable() || !m13464a()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m13472d() {
        if (!LiveScrapFluencyOptSetting.INSTANCE.enable() || !m13464a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m13464a() {
        if (C11279p.m20029f() && LiveBroadcastFluencyOptSetting.INSTANCE.enable()) {
            return true;
        }
        if (!C11279p.m20028e() || !LivePlayFluencyOptSetting.INSTANCE.enable()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final View getPreloadLayout(int i) {
        return C2690b.m7789b(i);
    }

    /* renamed from: a */
    public static final void m13462a(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        f15476a.post(runnable, null);
    }

    /* renamed from: b */
    public static final void m13466b(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        m13471d(runnable);
    }

    /* renamed from: c */
    public static final void m13469c(Runnable runnable) {
        C89219l.m154721d(runnable, "");
        m13461a(null, runnable, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void removeMessages(Object obj) {
        C89219l.m154721d(obj, "");
        C3940j.m9594a().removeCallbacksAndMessages(obj);
    }

    /* renamed from: d */
    private static final void m13471d(Runnable runnable) {
        if (m13465a(0)) {
            C40780g.m82246c().submit(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    private static boolean m13465a(int i) {
        if (i == 0) {
            return m13464a();
        }
        if (i == 1) {
            return m13468b();
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return m13464a();
                }
                return m13472d();
            } else if (!LiveBannerWebviewOptSetting.INSTANCE.enable() || !m13464a()) {
                return false;
            } else {
                return true;
            }
        } else if (!LiveSlotFluencyOptSetting.INSTANCE.enable() || !m13464a()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.FluencyOpt
    public final void post(Runnable runnable, Object obj) {
        C89219l.m154721d(runnable, "");
        m13461a(obj, runnable, 0);
    }

    /* renamed from: b */
    public static final void m13467b(Runnable runnable, Object obj) {
        C89219l.m154721d(runnable, "");
        m13461a(obj, runnable, 2);
    }

    /* renamed from: a */
    public static final void m13463a(Runnable runnable, Object obj) {
        C89219l.m154721d(runnable, "");
        m13461a(obj, runnable, 3);
    }

    /* renamed from: a */
    private static final void m13461a(Object obj, Runnable runnable, int i) {
        if (m13465a(i)) {
            C0649c.m2386a(C3940j.m9594a(), runnable, obj, 0);
        } else {
            runnable.run();
        }
    }
}
