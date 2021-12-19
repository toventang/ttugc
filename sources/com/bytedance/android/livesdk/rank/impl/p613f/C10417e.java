package com.bytedance.android.livesdk.rank.impl.p613f;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.f.e */
public final /* synthetic */ class C10417e implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f25130a = new C10417e();

    static {
        Covode.recordClassIndex(11991);
    }

    private C10417e() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C2912a) {
            C11226ao.m19883a(C3966y.m9669e(), ((C2912a) th).getPrompt(), 0);
            return;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gpl);
    }
}
