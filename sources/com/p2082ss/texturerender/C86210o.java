package com.p2082ss.texturerender;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.C15346a;
import java.lang.reflect.Method;

/* renamed from: com.ss.texturerender.o */
public final class C86210o {

    /* renamed from: a */
    private Object f192356a;

    /* renamed from: b */
    private Method f192357b;

    /* renamed from: c */
    private Method f192358c;

    /* renamed from: d */
    private Method f192359d;

    /* renamed from: e */
    private Method f192360e;

    /* renamed from: f */
    private Method f192361f;

    /* renamed from: g */
    private Method f192362g;

    /* renamed from: h */
    private Method f192363h;

    /* renamed from: i */
    private Method f192364i;

    static {
        Covode.recordClassIndex(101353);
    }

    public C86210o() {
        C86203l.m148116a("VideoOCLSRWrapper", "new VideoOCLSRWrapper");
        m148148c();
    }

    /* renamed from: b */
    public final void mo136538b() {
        Method method;
        Object obj = this.f192356a;
        if (!(obj == null || (method = this.f192364i) == null)) {
            m148147a(method, obj, new Object[0]);
            C86203l.m148116a("VideoOCLSRWrapper", "ReleaseVideoOclSr");
        }
        this.f192356a = null;
    }

    /* renamed from: a */
    public final int mo136533a() {
        if (this.f192356a == null || this.f192363h == null) {
            m148148c();
        }
        Object a = m148147a(this.f192363h, this.f192356a, new Object[0]);
        if (a == null) {
            return -1;
        }
        return ((Integer) a).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00c3 A[SYNTHETIC, Splitter:B:12:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m148148c() {
        /*
        // Method dump skipped, instructions count: 323
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.texturerender.C86210o.m148148c():void");
    }

    /* renamed from: a */
    private static Object m148147a(Method method, Object obj, Object... objArr) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            Pair<Boolean, Object> a = C15346a.m28238a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_texturerender_VideoOCLSRWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a.first).booleanValue()) {
                return a.second;
            }
            Object invoke = method.invoke(obj, objArr);
            C15346a.m28242a(invoke, method, new Object[]{obj, objArr}, "com_ss_texturerender_VideoOCLSRWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Exception e) {
            C86203l.m148116a("VideoOCLSRWrapper", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final int mo136534a(int i, int i2, int i3) {
        if (this.f192356a == null || this.f192362g == null) {
            m148148c();
        }
        Object a = m148147a(this.f192362g, this.f192356a, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), true);
        if (a == null) {
            return -1;
        }
        return ((Integer) a).intValue();
    }

    /* renamed from: a */
    public final int mo136535a(int i, int i2, int i3, float[] fArr) {
        if (this.f192356a == null || this.f192361f == null) {
            m148148c();
        }
        Object a = m148147a(this.f192361f, this.f192356a, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fArr, true);
        if (a == null) {
            return -1;
        }
        return ((Integer) a).intValue();
    }

    /* renamed from: a */
    public final boolean mo136536a(String str, int i, boolean z, String str2) {
        Object a;
        if (this.f192356a == null || this.f192360e == null) {
            m148148c();
        }
        Object obj = this.f192356a;
        if (obj != null) {
            if (this.f192360e != null) {
                C86203l.m148116a("VideoOCLSRWrapper", "mInitWithLicenseMethod ".concat(String.valueOf(str2)));
                a = m148147a(this.f192360e, this.f192356a, str, Integer.valueOf(i), Boolean.valueOf(z), true, str2, 720, 1440);
            } else {
                Method method = this.f192357b;
                if (method != null) {
                    a = m148147a(method, obj, str, Integer.valueOf(i), Boolean.valueOf(z));
                }
            }
            if (a == null || !((Boolean) a).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo136537a(String str, int i, boolean z, boolean z2, int i2, int i3, String str2) {
        Object a;
        if (this.f192356a == null || this.f192360e == null) {
            m148148c();
        }
        Object obj = this.f192356a;
        if (obj != null) {
            if (this.f192360e != null) {
                C86203l.m148116a("VideoOCLSRWrapper", "mInitWithLicenseMethod ".concat(String.valueOf(str2)));
                a = m148147a(this.f192360e, this.f192356a, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), str2, Integer.valueOf(i2), Integer.valueOf(i3));
            } else {
                Method method = this.f192359d;
                if (method != null) {
                    a = m148147a(method, obj, str, Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(i2), Integer.valueOf(i3));
                } else if (this.f192358c != null) {
                    C86203l.m148116a("VideoOCLSRWrapper", "mInitMethodMaxMalisync null, use mInitMethodMax");
                    a = m148147a(this.f192358c, this.f192356a, str, Integer.valueOf(i), Boolean.valueOf(z), Integer.valueOf(i2), Integer.valueOf(i3));
                } else if (this.f192357b != null) {
                    C86203l.m148116a("VideoOCLSRWrapper", "mInitMethodMaxMalisync/mInitMethodMax null,use mInitMethod");
                    a = m148147a(this.f192357b, this.f192356a, str, Integer.valueOf(i), Boolean.valueOf(z));
                }
            }
            if (a == null || !((Boolean) a).booleanValue()) {
                return false;
            }
            return true;
        }
        return false;
    }
}
