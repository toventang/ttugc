package com.p2082ss.android.vesdk;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.C85346av;

/* renamed from: com.ss.android.vesdk.bc */
public final class C85388bc {

    /* renamed from: a */
    public VESize f191134a;

    /* renamed from: b */
    public boolean f191135b;

    /* renamed from: c */
    public String f191136c;

    /* renamed from: d */
    public boolean f191137d;

    /* renamed from: e */
    public Bitmap.CompressFormat f191138e;

    /* renamed from: f */
    public boolean f191139f;

    /* renamed from: g */
    public boolean f191140g;

    /* renamed from: h */
    public boolean f191141h;

    /* renamed from: i */
    public boolean f191142i;

    /* renamed from: j */
    public boolean f191143j;

    /* renamed from: k */
    public C85346av.AbstractC85359e f191144k;

    /* renamed from: l */
    public C85346av.AbstractC85358d f191145l;

    /* renamed from: m */
    public C85346av.AbstractC85360f f191146m;

    static {
        Covode.recordClassIndex(99500);
    }

    private C85388bc() {
    }

    /* renamed from: com.ss.android.vesdk.bc$a */
    public static final class C85389a {

        /* renamed from: a */
        public final C85388bc f191147a = new C85388bc((byte) 0);

        static {
            Covode.recordClassIndex(99501);
        }

        /* renamed from: a */
        public final C85389a mo130876a(Bitmap.CompressFormat compressFormat) {
            this.f191147a.f191138e = compressFormat;
            return this;
        }

        /* renamed from: b */
        public final C85389a mo130881b(boolean z) {
            this.f191147a.f191142i = z;
            return this;
        }

        /* renamed from: a */
        public final C85389a mo130877a(VESize vESize) {
            this.f191147a.f191134a = vESize;
            return this;
        }

        /* renamed from: a */
        public final C85389a mo130878a(C85346av.AbstractC85359e eVar) {
            this.f191147a.f191144k = eVar;
            return this;
        }

        /* renamed from: a */
        public final C85389a mo130879a(String str) {
            this.f191147a.f191136c = str;
            return this;
        }

        /* renamed from: a */
        public final C85389a mo130880a(boolean z) {
            this.f191147a.f191135b = z;
            return this;
        }
    }

    /* synthetic */ C85388bc(byte b) {
        this();
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C85388bc)) {
            C85388bc bcVar = (C85388bc) obj;
            if (this.f191135b == bcVar.f191135b && this.f191136c.equals(bcVar.f191136c) && this.f191137d == bcVar.f191137d && this.f191138e == bcVar.f191138e && this.f191134a.equals(bcVar.f191134a) && this.f191139f == bcVar.f191139f && this.f191140g == bcVar.f191140g && this.f191141h == bcVar.f191141h && this.f191142i == bcVar.f191142i && this.f191143j == bcVar.f191143j) {
                return true;
            }
            return false;
        }
        return false;
    }
}
