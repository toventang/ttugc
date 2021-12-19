package com.p2082ss.android.ugc.aweme.common;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.ag */
public final class C39082ag {

    /* renamed from: a */
    public static final C39083a f92282a = new C39083a((byte) 0);

    static {
        Covode.recordClassIndex(46698);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.ag$a */
    public static final class C39083a {
        static {
            Covode.recordClassIndex(46699);
        }

        private C39083a() {
        }

        public /* synthetic */ C39083a(byte b) {
            this();
        }

        /* renamed from: a */
        public static float m79346a(float f, Resources resources) {
            if (resources == null) {
                return 0.0f;
            }
            return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
        }

        /* renamed from: a */
        public static float m79347a(Context context, float f) {
            C89219l.m154721d(context, "");
            Resources resources = context.getResources();
            C89219l.m154716b(resources, "");
            return f * resources.getDisplayMetrics().density;
        }
    }
}
