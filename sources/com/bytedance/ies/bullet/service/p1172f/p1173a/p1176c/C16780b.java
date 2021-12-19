package com.bytedance.ies.bullet.service.p1172f.p1173a.p1176c;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.ies.bullet.service.f.a.c.b */
public final class C16780b {
    static {
        Covode.recordClassIndex(19220);
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$c */
    public static final class C16783c extends AbstractC89220m implements AbstractC89183m<Bundle, String, String> {
        static {
            Covode.recordClassIndex(19223);
        }

        public C16783c() {
            super(2);
        }

        public final String invoke(Bundle bundle, String str) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (bundle.containsKey(str)) {
                return bundle.getString(str);
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$f */
    public static final class C16786f extends AbstractC89220m implements AbstractC89183m<Bundle, String, Integer> {
        static {
            Covode.recordClassIndex(19226);
        }

        public C16786f() {
            super(2);
        }

        public final Integer invoke(Bundle bundle, String str) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (bundle.containsKey(str)) {
                return Integer.valueOf(bundle.getInt(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$j */
    public static final class C16790j extends AbstractC89220m implements AbstractC89183m<Bundle, String, Float> {
        static {
            Covode.recordClassIndex(19230);
        }

        public C16790j() {
            super(2);
        }

        public final Float invoke(Bundle bundle, String str) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (bundle.containsKey(str)) {
                return Float.valueOf(bundle.getFloat(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$l */
    public static final class C16792l extends AbstractC89220m implements AbstractC89183m<Bundle, String, Double> {
        static {
            Covode.recordClassIndex(19232);
        }

        public C16792l() {
            super(2);
        }

        public final Double invoke(Bundle bundle, String str) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (bundle.containsKey(str)) {
                return Double.valueOf(bundle.getDouble(str));
            }
            return null;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$a */
    public static final class C16781a extends AbstractC89220m implements AbstractC89183m<Bundle, String, Boolean> {
        static {
            Covode.recordClassIndex(19221);
        }

        public C16781a() {
            super(2);
        }

        public final Boolean invoke(Bundle bundle, String str) {
            boolean z;
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (!bundle.containsKey(str)) {
                return null;
            }
            String string = bundle.getString(str);
            if (string != null) {
                z = C89219l.m154714a((Object) string, (Object) "1");
            } else {
                z = bundle.getBoolean(str);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$h */
    public static final class C16788h extends AbstractC89220m implements AbstractC89183m<Bundle, String, Long> {
        static {
            Covode.recordClassIndex(19228);
        }

        public C16788h() {
            super(2);
        }

        public final Long invoke(Bundle bundle, String str) {
            long j;
            Long g;
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            if (!bundle.containsKey(str)) {
                return null;
            }
            String string = bundle.getString(str);
            if (string == null || (g = C89361p.m154865g(string)) == null) {
                j = bundle.getLong(str);
            } else {
                j = g.longValue();
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$d */
    public static final class C16784d extends AbstractC89220m implements AbstractC89187q<Bundle, String, String, Bundle> {
        static {
            Covode.recordClassIndex(19224);
        }

        public C16784d() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, String str2) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putString(str, str2);
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$b */
    public static final class C16782b extends AbstractC89220m implements AbstractC89187q<Bundle, String, Double, Bundle> {
        static {
            Covode.recordClassIndex(19222);
        }

        public C16782b() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Double d) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putDouble(str, d.doubleValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$e */
    public static final class C16785e extends AbstractC89220m implements AbstractC89187q<Bundle, String, Boolean, Bundle> {
        static {
            Covode.recordClassIndex(19225);
        }

        public C16785e() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Boolean bool) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putBoolean(str, bool.booleanValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$g */
    public static final class C16787g extends AbstractC89220m implements AbstractC89187q<Bundle, String, Integer, Bundle> {
        static {
            Covode.recordClassIndex(19227);
        }

        public C16787g() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Integer num) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putInt(str, num.intValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$i */
    public static final class C16789i extends AbstractC89220m implements AbstractC89187q<Bundle, String, Long, Bundle> {
        static {
            Covode.recordClassIndex(19229);
        }

        public C16789i() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Long l) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putLong(str, l.longValue());
            return bundle;
        }
    }

    /* renamed from: com.bytedance.ies.bullet.service.f.a.c.b$k */
    public static final class C16791k extends AbstractC89220m implements AbstractC89187q<Bundle, String, Float, Bundle> {
        static {
            Covode.recordClassIndex(19231);
        }

        public C16791k() {
            super(3);
        }

        public final Bundle invoke(Bundle bundle, String str, Float f) {
            C89219l.m154719c(bundle, "");
            C89219l.m154719c(str, "");
            bundle.putFloat(str, f.floatValue());
            return bundle;
        }
    }
}
