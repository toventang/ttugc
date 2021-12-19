package com.bytedance.p1469l.p1473b.p1476c;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1469l.p1470a.AbstractC20690a;
import com.p2082ss.android.ugc.aweme.live.LivePlayActivity;

/* renamed from: com.bytedance.l.b.c.a */
public class C20712a implements AbstractC20690a {

    /* renamed from: a */
    public static volatile AbstractC20690a f48890a;

    static {
        Covode.recordClassIndex(24285);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public void onInit() {
    }

    private C20712a() {
    }

    @Override // com.bytedance.p1469l.p1470a.AbstractC20690a
    /* renamed from: a */
    public final Class mo34105a() {
        return LivePlayActivity.class;
    }

    /* renamed from: b */
    public static AbstractC20690a m38958b() {
        MethodCollector.m26663i(955);
        if (f48890a == null) {
            synchronized (C20712a.class) {
                try {
                    if (f48890a == null) {
                        f48890a = new C20712a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(955);
                    throw th;
                }
            }
        }
        AbstractC20690a aVar = f48890a;
        MethodCollector.m26664o(955);
        return aVar;
    }

    @Override // com.bytedance.p1469l.p1470a.AbstractC20690a
    /* renamed from: a */
    public final void mo34106a(Context context, EnterRoomConfig enterRoomConfig) {
        LivePlayActivity.m107294a(context, enterRoomConfig);
    }
}
