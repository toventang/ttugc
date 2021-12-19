package com.bytedance.android.livesdk;

import androidx.p025c.C0489d;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageManagerV2EnableSetting;
import com.bytedance.android.livesdk.p656w.C11306f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* renamed from: com.bytedance.android.livesdk.aq */
public final class C6813aq {

    /* renamed from: a */
    static C0489d<IMessageManager> f17083a = new C0489d<>(2);

    /* renamed from: b */
    static C0489d<C11306f> f17084b = new C0489d<>(2);

    /* renamed from: c */
    static long f17085c;

    /* renamed from: d */
    public static boolean f17086d = LiveMessageManagerV2EnableSetting.INSTANCE.getValue();

    static {
        Covode.recordClassIndex(7551);
    }

    /* renamed from: a */
    public static void m14604a(long j) {
        C11306f a = f17084b.mo2078a(j, null);
        if (a != null) {
            a.mo18068b();
        }
        f17084b.mo2082b(j);
    }
}
