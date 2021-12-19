package com.p2082ss.android.ugc.aweme.p2719cv;

import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.cv.h */
public final class C40782h {

    /* renamed from: a */
    public final boolean f95482a;

    /* renamed from: b */
    public final List<EnumC40793o> f95483b;

    /* renamed from: c */
    public final List<String> f95484c;

    /* renamed from: d */
    public final long f95485d;

    /* renamed from: e */
    public final long f95486e;

    /* renamed from: f */
    public final long f95487f;

    static {
        Covode.recordClassIndex(48634);
    }

    /* renamed from: com.ss.android.ugc.aweme.cv.h$a */
    public static final class C40783a {

        /* renamed from: a */
        public boolean f95488a;

        /* renamed from: b */
        public List<EnumC40793o> f95489b;

        /* renamed from: c */
        public List<String> f95490c;

        /* renamed from: d */
        public long f95491d;

        /* renamed from: e */
        public long f95492e;

        /* renamed from: f */
        public long f95493f;

        static {
            Covode.recordClassIndex(48635);
        }

        /* renamed from: a */
        public final C40782h mo70024a() {
            return new C40782h(this, (byte) 0);
        }

        private C40783a() {
            this.f95489b = (List) C40782h.m82259a(Collections.emptyList());
            this.f95490c = (List) C40782h.m82259a(Collections.emptyList());
            this.f95491d = TimeUnit.MINUTES.toMillis(5);
            this.f95492e = TimeUnit.MINUTES.toMillis(5);
            this.f95493f = TimeUnit.MINUTES.toMillis(15);
        }

        /* synthetic */ C40783a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C40783a m82258a() {
        return new C40783a((byte) 0);
    }

    /* renamed from: a */
    public static <T> T m82259a(T t) {
        if (t != null) {
            return t;
        }
        IllegalStateException illegalStateException = new IllegalStateException("should not be null!");
        illegalStateException.printStackTrace();
        throw illegalStateException;
    }

    /* renamed from: a */
    public static long m82257a(long j) {
        if (j != 0) {
            return j;
        }
        IllegalStateException illegalStateException = new IllegalStateException("should not be zero!");
        illegalStateException.printStackTrace();
        throw illegalStateException;
    }

    private C40782h(C40783a aVar) {
        this.f95482a = aVar.f95488a;
        this.f95483b = (List) m82259a(aVar.f95489b);
        this.f95484c = (List) m82259a(aVar.f95490c);
        this.f95485d = m82257a(aVar.f95491d);
        this.f95486e = m82257a(aVar.f95492e);
        this.f95487f = m82257a(aVar.f95493f);
    }

    /* synthetic */ C40782h(C40783a aVar, byte b) {
        this(aVar);
    }
}
