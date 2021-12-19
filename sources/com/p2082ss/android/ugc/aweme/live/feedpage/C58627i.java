package com.p2082ss.android.ugc.aweme.live.feedpage;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.live.feedpage.C58621e;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.live.feedpage.i */
public final /* synthetic */ class C58627i implements AbstractC88433f {

    /* renamed from: a */
    private final C58621e.RunnableC58623a f133528a;

    static {
        Covode.recordClassIndex(68927);
    }

    C58627i(C58621e.RunnableC58623a aVar) {
        this.f133528a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C58621e.RunnableC58623a aVar = this.f133528a;
        C51423a.m95792b("LiveStateManager", "refresh net:" + Log.getStackTraceString((Throwable) obj));
        aVar.f133514a = false;
        C58621e.this.mo96088a();
    }
}
