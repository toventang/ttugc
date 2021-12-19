package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b;

import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.view.C24263d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.b.b */
public final class C55192b {
    static {
        Covode.recordClassIndex(64937);
    }

    /* renamed from: a */
    public static final void m100905a(C24263d dVar, float[] fArr) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(fArr, "");
        if (!dVar.hasHierarchy()) {
            dVar.setHierarchy(new C24247b(dVar.getResources()).mo39973a());
        }
        C24246a aVar = (C24246a) dVar.getHierarchy();
        C89219l.m154716b(aVar, "");
        aVar.mo39959a(C24250e.m46056b(fArr[0], fArr[1], fArr[2], fArr[3]));
    }
}
