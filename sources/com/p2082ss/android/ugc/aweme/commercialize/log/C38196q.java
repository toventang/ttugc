package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.q */
public final /* synthetic */ class C38196q implements AbstractC89183m {

    /* renamed from: a */
    private final Map f90237a;

    /* renamed from: b */
    private final Banner f90238b;

    static {
        Covode.recordClassIndex(45675);
    }

    public C38196q(Map map, Banner banner) {
        this.f90237a = map;
        this.f90238b = banner;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66491a(this.f90237a) : bVar.mo66487a(this.f90238b);
    }
}
