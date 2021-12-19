package com.p2082ss.android.ugc.aweme.trending.p4146b;

import android.animation.TimeInterpolator;
import android.graphics.PointF;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.trending.p4147c.C79055a;
import com.p2082ss.android.ugc.aweme.utils.C80211af;

/* renamed from: com.ss.android.ugc.aweme.trending.b.c */
public final class C79053c implements TimeInterpolator {

    /* renamed from: a */
    public static final C79054a f177691a = new C79054a((byte) 0);

    /* renamed from: b */
    private final PointF f177692b;

    /* renamed from: c */
    private final PointF f177693c;

    /* renamed from: d */
    private final PointF f177694d = new PointF(0.0f, 0.0f);

    /* renamed from: e */
    private final PointF f177695e = new PointF(1.0f, 1.0f);

    /* renamed from: f */
    private final C80211af f177696f;

    static {
        Covode.recordClassIndex(92230);
    }

    /* renamed from: com.ss.android.ugc.aweme.trending.b.c$a */
    public static final class C79054a {
        static {
            Covode.recordClassIndex(92231);
        }

        private C79054a() {
        }

        public /* synthetic */ C79054a(byte b) {
            this();
        }
    }

    public C79053c() {
        PointF pointF = new PointF(0.15f, 0.0f);
        this.f177692b = pointF;
        PointF pointF2 = new PointF(0.85f, 1.0f);
        this.f177693c = pointF2;
        this.f177696f = new C80211af(pointF, pointF2);
    }

    public final float getInterpolation(float f) {
        if (C79055a.m137879a(f, 0.0f)) {
            return 1.0f;
        }
        if (f < 0.4f) {
            return 1.0f - (this.f177696f.evaluate(f / 0.4f, this.f177694d, this.f177695e).y * 0.14999998f);
        }
        if (f > 0.6f) {
            return (this.f177696f.evaluate((f - 0.6f) / 0.39999998f, this.f177694d, this.f177695e).y * 0.14999998f) + 0.85f;
        }
        return 0.85f;
    }
}
