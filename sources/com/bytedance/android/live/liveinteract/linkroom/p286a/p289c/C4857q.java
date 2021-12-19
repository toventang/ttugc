package com.bytedance.android.live.liveinteract.linkroom.p286a.p289c;

import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.util.rxutils.autodispose.AbstractC11181z;
import com.bytedance.android.livesdk.utils.p654b.C11231b;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.live.liveinteract.linkroom.a.c.q */
final /* synthetic */ class C4857q implements AbstractC89172b {

    /* renamed from: a */
    private final C4840b f12712a;

    static {
        Covode.recordClassIndex(5439);
    }

    C4857q(C4840b bVar) {
        this.f12712a = bVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C4840b bVar = this.f12712a;
        if (bVar.f38654y != null) {
            if (bVar.f12685b != null && !bVar.f12685b.isDisposed()) {
                bVar.f12685b.dispose();
            }
            int value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
            bVar.f12685b = ((AbstractC11181z) C11231b.m19896a(1, TimeUnit.SECONDS).mo143276b((long) (value + 1)).mo143292d(new C4850j(value)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143274a(bVar.mo13748u())).mo17951a(new C4851k(bVar), new C4852l(bVar), new C4853m(bVar, value));
        }
        return C89391z.f203057a;
    }
}
