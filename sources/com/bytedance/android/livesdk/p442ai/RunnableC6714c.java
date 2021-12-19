package com.bytedance.android.livesdk.p442ai;

import android.content.Context;
import com.bytedance.android.live.p250i.p251a.AbstractC4352a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1206f.C17309b;

/* renamed from: com.bytedance.android.livesdk.ai.c */
final /* synthetic */ class RunnableC6714c implements Runnable {

    /* renamed from: a */
    private final C6705a f16646a;

    /* renamed from: b */
    private final String f16647b;

    static {
        Covode.recordClassIndex(7452);
    }

    RunnableC6714c(C6705a aVar, String str) {
        this.f16646a = aVar;
        this.f16647b = str;
    }

    public final void run() {
        AbstractC4352a.AbstractC4353a aVar;
        C6705a aVar2 = this.f16646a;
        String str = this.f16647b;
        if (str != null && str.length() != 0) {
            C6705a.f16632a = str;
            Context context = ((IHostContext) C6193a.m13435a(IHostContext.class)).context();
            if (context != null) {
                C17309b.m32048a(context, C17309b.f41588b).mo27619a("hardware_info_cpu_soc", (Object) str).mo27621a();
            }
            if (aVar2.f16633b != null && (aVar = aVar2.f16633b.get()) != null && C6705a.f16632a != null) {
                aVar.mo9023a(C6705a.f16632a);
            }
        }
    }
}
