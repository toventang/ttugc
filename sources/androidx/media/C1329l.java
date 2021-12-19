package androidx.media;

import android.text.TextUtils;
import androidx.core.p036g.C0691d;
import androidx.media.C1323i;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.media.l */
class C1329l {

    /* renamed from: a */
    private static final boolean f4308a = C1323i.f4304a;

    static {
        Covode.recordClassIndex(1442);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.media.l$a */
    public static class C1330a implements C1323i.AbstractC1325b {

        /* renamed from: a */
        private String f4309a;

        /* renamed from: b */
        private int f4310b;

        /* renamed from: c */
        private int f4311c;

        static {
            Covode.recordClassIndex(1443);
        }

        public final int hashCode() {
            return C0691d.m2447a(this.f4309a, Integer.valueOf(this.f4310b), Integer.valueOf(this.f4311c));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1330a)) {
                return false;
            }
            C1330a aVar = (C1330a) obj;
            if (TextUtils.equals(this.f4309a, aVar.f4309a) && this.f4310b == aVar.f4310b && this.f4311c == aVar.f4311c) {
                return true;
            }
            return false;
        }

        C1330a(String str, int i, int i2) {
            this.f4309a = str;
            this.f4310b = i;
            this.f4311c = i2;
        }
    }
}
