package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.p3803a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a */
public final class C70517a<T> {

    /* renamed from: b */
    public static final C70518a f157703b = new C70518a((byte) 0);

    /* renamed from: a */
    public final T f157704a;

    /* renamed from: c */
    private final int f157705c;

    static {
        Covode.recordClassIndex(82973);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.a.a$a */
    public static final class C70518a {
        static {
            Covode.recordClassIndex(82974);
        }

        private C70518a() {
        }

        public /* synthetic */ C70518a(byte b) {
            this();
        }

        /* renamed from: a */
        public static <T> C70517a<T> m124518a(T t) {
            return new C70517a<>(1, t, (byte) 0);
        }

        /* renamed from: b */
        public static <T> C70517a<T> m124519b(T t) {
            return new C70517a<>(2, t, (byte) 0);
        }
    }

    /* renamed from: a */
    public final boolean mo111236a() {
        if (this.f157705c == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo111238c() {
        if (this.f157705c == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo111237b() {
        if (this.f157705c == 2) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "InterceptResult(type=" + this.f157705c + ", result=" + ((Object) this.f157704a) + ')';
    }

    private C70517a(int i, T t) {
        this.f157705c = i;
        this.f157704a = t;
    }

    public /* synthetic */ C70517a(int i, Object obj, byte b) {
        this(i, obj);
    }
}
