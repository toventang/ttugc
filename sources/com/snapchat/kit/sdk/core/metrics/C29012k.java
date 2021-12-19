package com.snapchat.kit.sdk.core.metrics;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.snapchat.kit.sdk.core.metrics.k */
public final class C29012k implements AbstractC88078c<ScheduledExecutorService> {

    /* renamed from: a */
    public static final C29012k f68533a = new C29012k();

    static {
        Covode.recordClassIndex(35209);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SCHEDULED);
        a.f95505c = 1;
        return C88081f.m153153a(C40780g.m82242a(a.mo70028a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
