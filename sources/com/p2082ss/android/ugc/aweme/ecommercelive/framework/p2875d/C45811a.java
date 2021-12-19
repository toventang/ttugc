package com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.framework.d.a */
public final class C45811a {
    static {
        Covode.recordClassIndex(54330);
    }

    /* renamed from: a */
    public static final int m88429a(int i, Context context) {
        C89219l.m154721d(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }
}
