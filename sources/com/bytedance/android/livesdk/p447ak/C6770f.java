package com.bytedance.android.livesdk.p447ak;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11641e;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.ak.f */
final /* synthetic */ class C6770f implements AbstractC89172b {

    /* renamed from: a */
    private final AbstractC11641e f16813a;

    static {
        Covode.recordClassIndex(7508);
    }

    C6770f(AbstractC11641e eVar) {
        this.f16813a = eVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        Class hostActivity;
        AbstractC11641e eVar = this.f16813a;
        int intValue = ((Integer) obj).intValue();
        if (intValue == 1) {
            hostActivity = ((IHostApp) C6193a.m13435a(IHostApp.class)).getHostActivity(5);
        } else if (intValue != 2) {
            hostActivity = null;
        } else {
            hostActivity = ((IHostApp) C6193a.m13435a(IHostApp.class)).getHostActivity(6);
        }
        eVar.mo18425a(hostActivity);
        return C89391z.f203057a;
    }
}
