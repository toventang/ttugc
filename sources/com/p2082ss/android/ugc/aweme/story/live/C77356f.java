package com.p2082ss.android.ugc.aweme.story.live;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.story.live.f */
public final /* synthetic */ class C77356f implements AbstractC88433f {

    /* renamed from: a */
    static final AbstractC88433f f173553a = new C77356f();

    static {
        Covode.recordClassIndex(90385);
    }

    private C77356f() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            th = new IllegalStateException("unknown error");
        }
        C51423a.m95792b("Live", Log.getStackTraceString(th));
    }
}
