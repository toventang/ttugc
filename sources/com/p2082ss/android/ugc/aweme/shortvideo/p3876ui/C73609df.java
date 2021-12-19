package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3838k.C71907a;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72631i;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72683v;
import p4600h.p4611f.p4612a.AbstractC89183m;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.df */
public final /* synthetic */ class C73609df implements AbstractC89183m {

    /* renamed from: a */
    private final C73560cj f165427a;

    /* renamed from: b */
    private final C72683v f165428b;

    static {
        Covode.recordClassIndex(86347);
    }

    C73609df(C73560cj cjVar, C72683v vVar) {
        this.f165427a = cjVar;
        this.f165428b = vVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89183m
    public final Object invoke(Object obj, Object obj2) {
        C73560cj cjVar = this.f165427a;
        C72683v vVar = this.f165428b;
        Boolean bool = (Boolean) obj2;
        boolean booleanValue = bool.booleanValue();
        C73496bd.m129633a(cjVar.requireActivity(), booleanValue ? 1 : 0, cjVar.f165268K, null, new C73648er((CommonItemView) obj, vVar));
        if (C71907a.m126982a() && C72631i.C72632a.m128111a() && !bool.booleanValue()) {
            vVar.f162951d = true;
        }
        return null;
    }
}
