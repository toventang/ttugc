package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.p686b.C11688a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.userservice.j */
final /* synthetic */ class C11104j implements AbstractC88434g {

    /* renamed from: a */
    private final long f26705a;

    static {
        Covode.recordClassIndex(12727);
    }

    C11104j(long j) {
        this.f26705a = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        long j = this.f26705a;
        int i = ((C11090a) ((C5832d) obj).data).f26668a;
        C11688a aVar = new C11688a();
        if (i == 1) {
            aVar.f27934e = 1;
        } else if (i == 2) {
            aVar.f27934e = 2;
        } else {
            aVar.f27934e = 0;
        }
        aVar.f27930a = j;
        return aVar;
    }
}
