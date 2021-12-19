package com.p2082ss.android.ugc.aweme.commercialize.log;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38182f;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.r */
public final /* synthetic */ class C38197r implements AbstractC89183m {

    /* renamed from: a */
    private final Map f90239a;

    /* renamed from: b */
    private final Banner f90240b;

    static {
        Covode.recordClassIndex(45676);
    }

    public C38197r(Map map, Banner banner) {
        this.f90239a = map;
        this.f90240b = banner;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        C38182f.C38184b bVar = (C38182f.C38184b) obj;
        return ((Boolean) obj2).booleanValue() ? bVar.mo66491a(this.f90239a) : bVar.mo66487a(this.f90240b);
    }
}
