package androidx.work;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.work.c */
public final class C1593c {

    /* renamed from: a */
    public static final C1593c f5203a = new C1593c(new C1594a());

    /* renamed from: b */
    public EnumC1602h f5204b = EnumC1602h.NOT_REQUIRED;

    /* renamed from: c */
    public boolean f5205c;

    /* renamed from: d */
    public boolean f5206d;

    /* renamed from: e */
    public boolean f5207e;

    /* renamed from: f */
    public boolean f5208f;

    /* renamed from: g */
    public long f5209g = -1;

    /* renamed from: h */
    public long f5210h = -1;

    /* renamed from: i */
    public C1595d f5211i = new C1595d();

    /* renamed from: androidx.work.c$a */
    public static final class C1594a {

        /* renamed from: a */
        boolean f5212a;

        /* renamed from: b */
        boolean f5213b;

        /* renamed from: c */
        EnumC1602h f5214c = EnumC1602h.NOT_REQUIRED;

        /* renamed from: d */
        boolean f5215d;

        /* renamed from: e */
        boolean f5216e;

        /* renamed from: f */
        long f5217f = -1;

        /* renamed from: g */
        long f5218g = -1;

        /* renamed from: h */
        C1595d f5219h = new C1595d();

        static {
            Covode.recordClassIndex(1747);
        }
    }

    /* renamed from: a */
    public final boolean mo5350a() {
        if (this.f5211i.mo5353a() > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(1746);
    }

    public C1593c() {
    }

    public final int hashCode() {
        long j = this.f5209g;
        long j2 = this.f5210h;
        return (((((((((((((this.f5204b.hashCode() * 31) + (this.f5205c ? 1 : 0)) * 31) + (this.f5206d ? 1 : 0)) * 31) + (this.f5207e ? 1 : 0)) * 31) + (this.f5208f ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f5211i.hashCode();
    }

    private C1593c(C1594a aVar) {
        boolean z;
        this.f5205c = aVar.f5212a;
        if (Build.VERSION.SDK_INT < 23 || !aVar.f5213b) {
            z = false;
        } else {
            z = true;
        }
        this.f5206d = z;
        this.f5204b = aVar.f5214c;
        this.f5207e = aVar.f5215d;
        this.f5208f = aVar.f5216e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f5211i = aVar.f5219h;
            this.f5209g = aVar.f5217f;
            this.f5210h = aVar.f5218g;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1593c cVar = (C1593c) obj;
        if (this.f5205c == cVar.f5205c && this.f5206d == cVar.f5206d && this.f5207e == cVar.f5207e && this.f5208f == cVar.f5208f && this.f5209g == cVar.f5209g && this.f5210h == cVar.f5210h && this.f5204b == cVar.f5204b) {
            return this.f5211i.equals(cVar.f5211i);
        }
        return false;
    }
}
