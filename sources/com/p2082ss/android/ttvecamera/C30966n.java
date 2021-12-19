package com.p2082ss.android.ttvecamera;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttvecamera.AbstractC30753a;

/* renamed from: com.ss.android.ttvecamera.n */
public class C30966n {

    /* renamed from: a */
    public final int f74234a;

    /* renamed from: b */
    public final int f74235b;

    /* renamed from: c */
    public final int f74236c;

    /* renamed from: d */
    public final int f74237d;

    /* renamed from: e */
    public final float f74238e;

    /* renamed from: f */
    long f74239f;

    /* renamed from: g */
    public boolean f74240g = true;

    /* renamed from: h */
    public boolean f74241h = true;

    /* renamed from: i */
    public boolean f74242i;

    /* renamed from: j */
    public boolean f74243j = true;

    /* renamed from: k */
    public AbstractC30753a.AbstractC30754a f74244k;

    /* renamed from: l */
    public AbstractC30753a.AbstractC30755b f74245l;

    /* renamed from: m */
    public AbstractC30967a f74246m = new C30968b((byte) 0);

    /* renamed from: com.ss.android.ttvecamera.n$a */
    public interface AbstractC30967a {
        static {
            Covode.recordClassIndex(37592);
        }

        /* renamed from: a */
        void mo56059a(int i, int i2, String str);
    }

    static {
        Covode.recordClassIndex(37591);
    }

    /* renamed from: com.ss.android.ttvecamera.n$b */
    static class C30968b implements AbstractC30967a {
        static {
            Covode.recordClassIndex(37593);
        }

        private C30968b() {
        }

        /* synthetic */ C30968b(byte b) {
            this();
        }

        @Override // com.p2082ss.android.ttvecamera.C30966n.AbstractC30967a
        /* renamed from: a */
        public final void mo56059a(int i, int i2, String str) {
            if (i > 0) {
                C30969o.m63687b("TEFocusNullCallback", "Focus done, cost: " + i + "ms");
            } else {
                C30969o.m63686a("TEFocusNullCallback", "Focus failed, error code: " + i + ", msg: " + str);
            }
            C30969o.m63687b("Debug", C30969o.m63685a());
        }
    }

    /* renamed from: a */
    public final int mo56055a() {
        return (int) (System.currentTimeMillis() - this.f74239f);
    }

    /* renamed from: b */
    public final Rect mo56056b() {
        AbstractC30753a.AbstractC30754a aVar = this.f74244k;
        if (aVar != null) {
            return aVar.mo55614a().get(0).rect;
        }
        return null;
    }

    /* renamed from: c */
    public final Rect mo56057c() {
        AbstractC30753a.AbstractC30755b bVar = this.f74245l;
        if (bVar != null) {
            return bVar.mo55615a().get(0).rect;
        }
        return null;
    }

    public String toString() {
        return "TEFocusSettings{width =" + this.f74234a + ", height =" + this.f74235b + ", x =" + this.f74236c + ", y =" + this.f74237d + ", need focus =" + this.f74240g + ", need meter =" + this.f74241h + ", lock =" + this.f74242i + ", from user=" + this.f74243j + '}';
    }

    public C30966n(int i, int i2, int i3, int i4, float f) {
        this.f74234a = i;
        this.f74235b = i2;
        this.f74236c = i3;
        this.f74237d = i4;
        this.f74238e = f;
    }
}
