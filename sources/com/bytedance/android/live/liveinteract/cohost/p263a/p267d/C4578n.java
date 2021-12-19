package com.bytedance.android.live.liveinteract.cohost.p263a.p267d;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.liveinteract.cohost.a.d.n */
public final /* synthetic */ class C4578n implements AbstractC88433f {

    /* renamed from: a */
    public static final AbstractC88433f f12207a = new C4578n();

    static {
        Covode.recordClassIndex(5154);
    }

    private C4578n() {
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
