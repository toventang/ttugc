package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.hc */
public final class C80525hc {

    /* renamed from: a */
    public static TypedValue f180138a = new TypedValue();

    /* renamed from: b */
    public static DisplayMetrics f180139b;

    /* renamed from: c */
    public static final C80526a f180140c = new C80526a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.utils.hc$a */
    public static final class C80526a {
        static {
            Covode.recordClassIndex(93799);
        }

        private C80526a() {
        }

        public /* synthetic */ C80526a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m139597a(Context context) {
            if (C80525hc.f180139b == null) {
                Resources resources = context.getResources();
                C89219l.m154716b(resources, "");
                C80525hc.f180139b = resources.getDisplayMetrics();
            }
        }

        /* renamed from: a */
        public static float m139596a(Context context, float f) {
            if (context == null) {
                return f;
            }
            m139597a(context);
            DisplayMetrics displayMetrics = C80525hc.f180139b;
            DisplayMetrics displayMetrics2 = C80525hc.f180139b;
            if (displayMetrics2 == null) {
                C89219l.m154715b();
            }
            float f2 = 3.0f;
            if (displayMetrics2.density < 3.0f) {
                f2 = 2.0f;
            }
            return (f * f2) + 0.5f;
        }
    }

    static {
        Covode.recordClassIndex(93798);
    }
}
