package com.p2082ss.android.ugc.aweme.themechange.base;

import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.b */
public final class C77793b {

    /* renamed from: a */
    static final int f174509a = C70636dh.m124831b(C63247i.f143610a);

    /* renamed from: b */
    static final float f174510b;

    /* renamed from: c */
    static final float f174511c = C13628n.m24520b(C63247i.f143610a, 20.0f);

    /* renamed from: d */
    static final float f174512d = C13628n.m24520b(C63247i.f143610a, 56.0f);

    /* renamed from: e */
    static final float f174513e = C13628n.m24520b(C63247i.f143610a, 80.0f);

    /* renamed from: f */
    public static final C77793b f174514f = new C77793b();

    /* renamed from: g */
    private static final AbstractC89244h f174515g = C89250i.m154773a((AbstractC89171a) C77794a.f174517a);

    /* renamed from: h */
    private static final float f174516h;

    /* renamed from: a */
    public static float m135908a() {
        return ((Number) f174515g.getValue()).floatValue();
    }

    private C77793b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.themechange.base.b$a */
    static final class C77794a extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        public static final C77794a f174517a = new C77794a();

        static {
            Covode.recordClassIndex(90872);
        }

        C77794a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            double d = (double) ((((float) C77793b.f174509a) - C77793b.f174511c) - (C77793b.f174510b * 5.0f));
            Double.isNaN(d);
            float f = (float) (d / 5.3d);
            if (f < C77793b.f174512d) {
                f = C77793b.f174512d;
            } else if (f > C77793b.f174513e) {
                f = C77793b.f174513e;
            }
            return Float.valueOf(f);
        }
    }

    static {
        Covode.recordClassIndex(90871);
        float b = C13628n.m24520b(C63247i.f143610a, 12.0f);
        f174510b = b;
        f174516h = m135908a() + b;
    }
}
