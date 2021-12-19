package com.bytedance.p1436j.p1437a.p1444g;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.j.a.g.c */
public final class C20123c {

    /* renamed from: a */
    public static final C20123c f47891a = new C20123c();

    private C20123c() {
    }

    static {
        Covode.recordClassIndex(23631);
    }

    /* renamed from: a */
    public static float m38079a(Context context, float f) {
        C89219l.m154719c(context, "");
        Resources resources = context.getResources();
        C89219l.m154709a((Object) resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
