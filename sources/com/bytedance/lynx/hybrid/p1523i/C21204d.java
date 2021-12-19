package com.bytedance.lynx.hybrid.p1523i;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.lynx.hybrid.i.d */
public final class C21204d {

    /* renamed from: a */
    public static final C21204d f50318a = new C21204d();

    private C21204d() {
    }

    static {
        Covode.recordClassIndex(24820);
    }

    /* renamed from: a */
    public static float m39916a(Context context, float f) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
