package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.iescore.p3209b.C55638f;
import com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56199c;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.m */
public final class C55218m implements AbstractC56199c {

    /* renamed from: a */
    public static final C55218m f126294a = new C55218m();

    private C55218m() {
    }

    static {
        Covode.recordClassIndex(64965);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.AbstractC56199c
    /* renamed from: a */
    public final void mo92200a(String str) {
        C89219l.m154721d(str, "");
        Iterator<T> it = C55638f.m101378b().iterator();
        while (it.hasNext()) {
            it.next().mo27899a(str);
        }
    }
}
