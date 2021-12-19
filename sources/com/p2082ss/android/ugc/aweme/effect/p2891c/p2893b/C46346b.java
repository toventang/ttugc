package com.p2082ss.android.ugc.aweme.effect.p2891c.p2893b;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.effect.c.b.b */
public final class C46346b {

    /* renamed from: c */
    public static final C46347a f108031c = new C46347a((byte) 0);

    /* renamed from: a */
    public final int f108032a;

    /* renamed from: b */
    public final float f108033b;

    static {
        Covode.recordClassIndex(54923);
    }

    /* renamed from: com.ss.android.ugc.aweme.effect.c.b.b$a */
    public static final class C46347a {
        static {
            Covode.recordClassIndex(54924);
        }

        private C46347a() {
        }

        public /* synthetic */ C46347a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C46346b m89401a(float f) {
            return new C46346b(1, f, (byte) 0);
        }

        /* renamed from: b */
        public static C46346b m89402b(float f) {
            return new C46346b(0, f, (byte) 0);
        }
    }

    public final String toString() {
        return "op = " + this.f108032a + ", duration = " + this.f108033b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C46346b) {
            C46346b bVar = (C46346b) obj;
            if (this.f108032a == bVar.f108032a && this.f108033b == bVar.f108033b) {
                return true;
            }
            return false;
        }
        return false;
    }

    private C46346b(int i, float f) {
        this.f108032a = i;
        this.f108033b = f;
    }

    public /* synthetic */ C46346b(int i, float f, byte b) {
        this(i, f);
    }
}
