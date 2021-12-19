package com.p2082ss.android.ugc.aweme.trending.p4146b;

import android.animation.TimeInterpolator;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;

/* renamed from: com.ss.android.ugc.aweme.trending.b.b */
public final class C79051b implements TimeInterpolator {

    /* renamed from: a */
    public static final C79052a f177689a = new C79052a((byte) 0);

    /* renamed from: b */
    private final float f177690b = ((float) C34728n.m70946a(12.0d));

    static {
        Covode.recordClassIndex(92228);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.b.b$a */
    public static final class C79052a {
        static {
            Covode.recordClassIndex(92229);
        }

        private C79052a() {
        }

        public /* synthetic */ C79052a(byte b) {
            this();
        }
    }

    public final float getInterpolation(float f) {
        float f2;
        if (f < 0.1f) {
            f2 = this.f177690b * f;
        } else if (f <= 0.9f) {
            return this.f177690b;
        } else {
            f2 = this.f177690b * (1.0f - f);
        }
        return f2 / 0.1f;
    }
}
