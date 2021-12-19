package com.p2082ss.android.ugc.aweme.dependence.beauty.p2740a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.beauty.p2741b.C41098c;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.dependence.beauty.a.a */
public final class C41095a {

    /* renamed from: a */
    public static final C41095a f96057a = new C41095a();

    private C41095a() {
    }

    static {
        Covode.recordClassIndex(48965);
    }

    /* renamed from: b */
    public static final float m82772b(Context context) {
        C89219l.m154721d(context, "");
        return C84912r.m145930a(context, 12.0f);
    }

    /* renamed from: c */
    public static final float m82773c(Context context) {
        C89219l.m154721d(context, "");
        return C84912r.m145930a(context, 20.0f);
    }

    /* renamed from: d */
    public static final float m82774d(Context context) {
        C89219l.m154721d(context, "");
        return m82771a(context) + m82772b(context);
    }

    /* renamed from: a */
    public static final float m82771a(Context context) {
        C89219l.m154721d(context, "");
        int a = C41098c.m82777a(context);
        float b = m82772b(context);
        float c = m82773c(context);
        C89219l.m154721d(context, "");
        float a2 = C84912r.m145930a(context, 52.0f);
        C89219l.m154721d(context, "");
        float a3 = C84912r.m145930a(context, 80.0f);
        double d = (double) ((((float) a) - c) - (b * 5.0f));
        Double.isNaN(d);
        float f = (float) (d / 5.3d);
        if (f < a2) {
            return a2;
        }
        return f > a3 ? a3 : f;
    }
}
