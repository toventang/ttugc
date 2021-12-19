package com.lynx.p2031a;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.a.b */
public final class C28182b {

    /* renamed from: a */
    public final int f65963a;

    /* renamed from: b */
    public final int f65964b;

    /* renamed from: c */
    public final boolean f65965c;

    /* renamed from: d */
    public final int f65966d;

    /* renamed from: e */
    public final Bitmap.Config f65967e;

    static {
        Covode.recordClassIndex(34128);
    }

    /* renamed from: com.lynx.a.b$a */
    public static final class C28183a {

        /* renamed from: a */
        public int f65968a;

        /* renamed from: b */
        public int f65969b;

        /* renamed from: c */
        public int f65970c;

        /* renamed from: d */
        public Bitmap.Config f65971d;

        /* renamed from: e */
        private boolean f65972e;

        static {
            Covode.recordClassIndex(34129);
        }

        /* renamed from: a */
        public final C28182b mo48198a() {
            return new C28182b(this.f65968a, this.f65969b, this.f65971d, this.f65970c, this.f65972e, (byte) 0);
        }
    }

    private C28182b(int i, int i2, Bitmap.Config config, int i3, boolean z) {
        this.f65963a = i <= 0 ? -1 : i;
        this.f65964b = i2 <= 0 ? -1 : i2;
        this.f65967e = config == null ? Bitmap.Config.ARGB_8888 : config;
        this.f65966d = i3 < 0 ? 0 : i3;
        this.f65965c = z;
    }

    /* synthetic */ C28182b(int i, int i2, Bitmap.Config config, int i3, boolean z, byte b) {
        this(i, i2, config, i3, z);
    }
}
